import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.OutputType;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class ScreenshotListener implements ITestListener {

    private WebDriver driver;

    public void setDriver(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test failed: " + result.getName());
        captureScreenshot(result.getName());
    }

    private void captureScreenshot(String testName) {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File srcFile = ts.getScreenshotAs(OutputType.FILE);
        String destPath = System.getProperty("user.dir") + "/screenshots/" + testName + ".png";
        File destFile = new File(destPath);
        try {
            FileUtils.copyFile(srcFile, destFile);
            System.out.println("Screenshot captured: " + destPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
