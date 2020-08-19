package com.pages.functions.deposit;

import com.pages.functions.TransactionDetailsPage;
import com.pages.locators.deposit.DepositLocator;
import org.openqa.selenium.WebDriver;

public class DepositPage extends DepositLocator {

    public DepositPage(WebDriver driver) {
        super(driver);
    }

    public void inputAccountNumber(String accountNumber) {
        wait.waitUntilToBeClickAble(txtAccountNumber);
        txtAccountNumber.clear();
        txtAccountNumber.sendKeys(accountNumber);
    }

    public void inputAmount(int deposit) {
        wait.waitUntilToBeClickAble(txtAmount);
        txtAmount.clear();
        txtAmount.sendKeys(String.valueOf(deposit));
    }

    public void inputDescription(String description) {
        wait.waitUntilToBeClickAble(txtDescription);
        txtDescription.clear();
        txtDescription.sendKeys(description);
    }

    public TransactionDetailsPage submit() {
        wait.waitUntilToBeClickAble(btnSubmit);
        btnSubmit.click();
        wait.waitForPageLoad();
        return new TransactionDetailsPage(driver);
    }
}
