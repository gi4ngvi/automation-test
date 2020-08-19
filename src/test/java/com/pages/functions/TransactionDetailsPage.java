package com.pages.functions;

import com.pages.locators.TransactionDetailsLocator;
import org.openqa.selenium.WebDriver;

public class TransactionDetailsPage extends TransactionDetailsLocator {

    public TransactionDetailsPage(WebDriver driver) {
        super(driver);
    }

    public String getTransactionID() {
        wait.waitUntilVisibilityOf(lblTransactionID);
        return lblTransactionID.getText();
    }

    public String getAccountNumber() {
        wait.waitUntilVisibilityOf(lblAccountNumber);
        return lblAccountNumber.getText();
    }

    public String getAmountCredited() {
        wait.waitUntilVisibilityOf(lblAmountCredited);
        return lblAmountCredited.getText();
    }

    public String getTypeOfTransaction() {
        return lblTypeOfTransaction.getText();
    }

    public String getDescription() {
        return lblDescription.getText();
    }

    public String getCurrentBalance() {
        return lblCurrentBalance.getText();
    }
}
