package com.pages.locators.account;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumFactory;

public class AccountRegisterSuccessLocator extends SeleniumFactory {
    @FindBy(how = How.CSS, using = "table#account p[align='center']")
    protected WebElement lblSuccessMsg;
    @FindBy(how = How.XPATH, using = "//td[text()='Account ID']/following-sibling::td")
    protected WebElement lblAccountID;
    @FindBy(how = How.XPATH, using = "//td[text()='Customer ID']/following-sibling::td")
    protected WebElement lblCustomerID;
    @FindBy(how = How.XPATH, using = "//td[text()='Customer Name']/following-sibling::td")
    protected WebElement lblCustomerName;
    @FindBy(how = How.XPATH, using = "//td[text()='Email']/following-sibling::td")
    protected WebElement lblEmail;
    @FindBy(how = How.XPATH, using = "//td[text()='Account Type']/following-sibling::td")
    protected WebElement lblAccountType;
    @FindBy(how = How.XPATH, using = "//td[text()='Date of Opening']/following-sibling::td")
    protected WebElement lblOpenDate;
    @FindBy(how = How.XPATH, using = "//td[text()='Current Amount']/following-sibling::td")
    protected WebElement lblCurrentAmount;

    public AccountRegisterSuccessLocator(WebDriver driver) {
        super(driver);
    }
}
