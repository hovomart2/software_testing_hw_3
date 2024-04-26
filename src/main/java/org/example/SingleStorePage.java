package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SingleStorePage {
    private final WebDriver driver;
    WebDriverWait wait;

    public SingleStorePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public StoreOwnPage clickOnStoreLink(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Locators.STORE_LINK)).click();
        return new StoreOwnPage(driver);
    }
}
