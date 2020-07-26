package com.pages.functions.google;

import com.pages.locators.google.GoogleHomeLocator;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleHomePage extends GoogleHomeLocator {

    public GoogleHomePage(WebDriver driver) {
        super(driver);
    }

    public GoogleSearchResultPage search(String key) {
        wait.waitUntilToBeClickAble(inputSearch);
        inputSearch.click();
        inputSearch.clear();
        inputSearch.sendKeys(key);
        inputSearch.sendKeys(Keys.ENTER);
        wait.waitForPageLoad();

        return new GoogleSearchResultPage(driver);
    }

}
