package com.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumFactory;

public class TransactionDetailsLocator extends SeleniumFactory {
    @FindBy(how = How.XPATH, using = "//td[text()='Transaction ID']/following-sibling::td")
    protected WebElement lblTransactionID;
    @FindBy(how = How.XPATH, using = "//td[text()='Account No']/following-sibling::td")
    protected WebElement lblAccountNumber;
    @FindBy(how = How.XPATH, using = "//td[text()='Amount Credited']/following-sibling::td")
    protected WebElement lblAmountCredited;
    @FindBy(how = How.XPATH, using = "//td[text()='Type of Transaction']/following-sibling::td")
    protected WebElement lblTypeOfTransaction;
    @FindBy(how = How.XPATH, using = "//td[text()='Description']/following-sibling::td")
    protected WebElement lblDescription;
    @FindBy(how = How.XPATH, using = "//td[text()='Current Balance']/following-sibling::td")
    protected WebElement lblCurrentBalance;

    public TransactionDetailsLocator(WebDriver driver) {
        super(driver);
    }
}
