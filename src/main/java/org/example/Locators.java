package org.example;

import org.openqa.selenium.By;

public class Locators {
    public static final By STORES_BUTTON = By.cssSelector("#__next > section > header > div:nth-child(1) > div:nth-child(2) > ul > li:nth-child(2) > a");
    public static final By STORE_SEARCH_FIELD = By.cssSelector("#__next > div:nth-child(2) > div > div > div:nth-child(2) > div.shop_main_content > div > div > div > div > div > div.shop_shop_content_main__2zfp4 > div > div.shop_shop_search__d8sJz > input[type=search]");
    public static final By TUMANYAN_SHAURMA_BUTTON = By.cssSelector("#__next > div:nth-child(2) > div > div > div:nth-child(2) > div.shop_main_content > div > div > div > div > div > div:nth-child(3) > div.img");
    public static final By STORE_LINK = By.cssSelector("body > div.jss7 > div.jss8.modal_body > div.shop_md_content__2FNU3 > div.shop_shop_modal_part2__2PA8w > div.shop_modal_info__1VVrx > a:nth-child(1)");
}
