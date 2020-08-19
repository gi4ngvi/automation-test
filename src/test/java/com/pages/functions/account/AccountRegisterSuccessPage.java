package com.pages.functions.account;

import com.pages.locators.account.AccountRegisterSuccessLocator;
import org.openqa.selenium.WebDriver;

public class AccountRegisterSuccessPage extends AccountRegisterSuccessLocator {

    public AccountRegisterSuccessPage(WebDriver driver) {
        super(driver);
    }

    public String getSuccessMessage() {
        wait.waitUntilVisibilityOf(lblSuccessMsg);
        return lblSuccessMsg.getText();
    }

    public String getAccountID() {
        wait.waitUntilVisibilityOf(lblAccountID);
        return lblAccountID.getText();
    }

    public String getCustomerID() {
        wait.waitUntilVisibilityOf(lblCustomerID);
        return lblCustomerID.getText();
    }

    public String getCustomerName() {
        return lblCustomerName.getText();
    }

    public String getAccountType() {
        return lblAccountType.getText();
    }

    public String getEmail() {
        return lblEmail.getText();
    }

    public String getOpenDate() {
        return lblOpenDate.getText();
    }

    public String getCurrentAmount() {
        return lblCurrentAmount.getText();
    }
}
