package com.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumFactory;

public class HomeLocator extends SeleniumFactory {
    @FindBy(how = How.CSS, using = "input[name='uid']")
    protected WebElement txtID;
    @FindBy(how = How.CSS, using = "input[name='password']")
    protected WebElement txtPassword;
    @FindBy(how = How.CSS, using = "input[name='btnLogin']")
    protected WebElement btnLogin;

    public HomeLocator(WebDriver driver) {
        super(driver);
    }
}
