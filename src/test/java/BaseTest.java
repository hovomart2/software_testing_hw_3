import org.example.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(ScreenshotListener.class)
public class BaseTest {

    protected WebDriver driver;
    protected HomePage homePage;
    private ScreenshotListener screenshotListener;

    @BeforeClass
    public void SetUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.yerevanmall.am/en");
        homePage = new HomePage(driver);
        screenshotListener = new ScreenshotListener();
        screenshotListener.setDriver(driver);
    }


    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}