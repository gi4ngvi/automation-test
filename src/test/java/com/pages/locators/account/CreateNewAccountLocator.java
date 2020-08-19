package com.pages.locators.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumFactory;

public class CreateNewAccountLocator extends SeleniumFactory {
    @FindBy(how = How.CSS, using = "input[name='cusid']")
    protected WebElement txtCustomerId;
    @FindBy(how = How.CSS, using = "select[name='selaccount']")
    protected WebElement selectAccountType;
    @FindBy(how = How.CSS, using = "input[name='inideposit']")
    protected WebElement txtInitDeposit;
    @FindBy(how = How.CSS, using = "input[type='submit']")
    protected WebElement btnSubmit;

    public CreateNewAccountLocator(WebDriver driver) {
        super(driver);
    }
}
