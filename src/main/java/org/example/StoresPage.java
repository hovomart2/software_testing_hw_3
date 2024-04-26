package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StoresPage {
    private final WebDriver driver;
    private WebDriverWait wait;

    public StoresPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void enterStoreName(String name){
        WebElement storeSearchField = wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.STORE_SEARCH_FIELD));
        storeSearchField.clear();
        storeSearchField.sendKeys(name);
    }

    public SingleStorePage clickOnTumanyanShaurma(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.TUMANYAN_SHAURMA_BUTTON)).click();
        return new SingleStorePage(driver);
    }
}
