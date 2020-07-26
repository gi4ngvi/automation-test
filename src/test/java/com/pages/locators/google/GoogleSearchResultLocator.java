package com.pages.locators.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumFactory;

public class GoogleSearchResultLocator extends SeleniumFactory {
    protected static final String LIST_RESULT = "//div[contains(@data-async-context, '%s')]/div[@class]//h3";
    @FindBy(how = How.CSS, using = "input[name='q']")
    protected WebElement inputSearch;
    @FindBy(how = How.XPATH, using = "//a[contains(@href,'youtube.com')]/div[@class]")
    protected WebElement lnkYoutube;

    public GoogleSearchResultLocator(WebDriver driver) {
        super(driver);
    }
}
