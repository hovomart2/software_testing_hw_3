import org.example.SingleStorePage;
import org.example.StoreOwnPage;
import org.example.StoresPage;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class StorePageTest extends BaseTest{
    @Test
    public void TestingCartFunctionality()
    {
        StoresPage storesPage = homePage.clickOnStoresButton();
        storesPage.enterStoreName("Tuman");
        SingleStorePage singleStorePage = storesPage.clickOnTumanyanShaurma();
        StoreOwnPage storeOwnPage = singleStorePage.clickOnStoreLink();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.tshaurma.com/am");
    }
}
