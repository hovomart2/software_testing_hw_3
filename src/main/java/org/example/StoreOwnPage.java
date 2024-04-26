package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class StoreOwnPage {
    private final WebDriver driver;
    WebDriverWait wait;

    public StoreOwnPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public String getUrl() {
        for(String winHandle : driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }
        return this.driver.getCurrentUrl();
    }
}
