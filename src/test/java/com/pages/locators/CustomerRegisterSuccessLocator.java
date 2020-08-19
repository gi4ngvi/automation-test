package com.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumFactory;

public class CustomerRegisterSuccessLocator extends SeleniumFactory {
    @FindBy(how = How.CSS, using = "table#customer p[align='center']")
    protected WebElement lblSuccessMsg;


    public CustomerRegisterSuccessLocator(WebDriver driver) {
        super(driver);
    }
}
