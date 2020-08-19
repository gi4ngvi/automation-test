package com.pages.functions.customer;

import com.pages.locators.customer.CustomerRegisterSuccessLocator;
import org.openqa.selenium.WebDriver;

public class CustomerRegisterSuccessPage extends CustomerRegisterSuccessLocator {

    public CustomerRegisterSuccessPage(WebDriver driver) {
        super(driver);
    }

    public String getSuccessMessage() {
        wait.waitUntilVisibilityOf(lblSuccessMsg);
        return lblSuccessMsg.getText();
    }

    public String getCustomerID() {
        wait.waitUntilVisibilityOf(lblCustomerID);
        return lblCustomerID.getText();
    }

    public String getCustomerName() {
        wait.waitUntilVisibilityOf(lblCustomerName);
        return lblCustomerName.getText();
    }

    public String getCustomerGender() {
        return lblCustomerGender.getText();
    }

    public String getCustomerBirthDate() {
        return lblCustomerBirthday.getText();
    }

    public String getCustomerAddress() {
        return lblCustomerAddress.getText();
    }

    public String getCustomerCity() {
        return lblCustomerCity.getText();
    }

    public String getCustomerState() {
        return lblCustomerState.getText();
    }

    public String getCustomerPin() {
        return lblCustomerPIN.getText();
    }

    public String getCustomerMobile() {
        return lblCustomerMobile.getText();
    }

    public String getCustomerEmail() {
        return lblCustomerEmail.getText();
    }
}
