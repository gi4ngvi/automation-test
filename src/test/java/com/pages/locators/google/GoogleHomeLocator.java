package com.pages.locators.google;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumFactory;

public class GoogleHomeLocator extends SeleniumFactory {
    @FindBy(how = How.CSS, using = "input[name='q']")
    protected WebElement inputSearch;

    public GoogleHomeLocator(WebDriver driver) {
        super(driver);
    }
}
