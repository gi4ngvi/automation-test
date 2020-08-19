package com.pages.locators.deposit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumFactory;

public class DepositLocator extends SeleniumFactory {
    @FindBy(how = How.CSS, using = "input[name='accountno']")
    protected WebElement txtAccountNumber;
    @FindBy(how = How.CSS, using = "input[name='ammount']")
    protected WebElement txtAmount;
    @FindBy(how = How.CSS, using = "input[name='desc']")
    protected WebElement txtDescription;
    @FindBy(how = How.CSS, using = "input[name='AccSubmit']")
    protected WebElement btnSubmit;

    public DepositLocator(WebDriver driver) {
        super(driver);
    }
}
