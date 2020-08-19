package com.pages.functions;

import com.pages.locators.CreateNewCustomerLocator;
import entity.Customer;
import org.openqa.selenium.WebDriver;

public class CreateNewCustomerPage extends CreateNewCustomerLocator {

    public CreateNewCustomerPage(WebDriver driver) {
        super(driver);
    }

    public void inputCustomerInformation(Customer customer) {
        inputCustomerName(customer.getName());
        selectGender(customer.getGender());
        inputDateOfBirth(customer.getDateOfBirth());
        inputAddress(customer.getAddress());
        inputCity(customer.getCity());
        inputState(customer.getState());
        inputPIN(customer.getPin());
        inputMobile(customer.getMobile());
        inputEmail(customer.getEmail());
        inputPassword(customer.getPassword());
    }

    private void inputCustomerName(String key) {
        wait.waitUntilToBeClickAble(txtCustomerName);
        txtCustomerName.clear();
        txtCustomerName.sendKeys(key);
    }

    private void selectGender(String key) {
        if (key.equals("male")) {
            wait.waitUntilToBeClickAble(radMale);
            radMale.click();
        } else {
            wait.waitUntilToBeClickAble(radFemale);
            radFemale.click();
        }
    }

    private void inputDateOfBirth(String key) {
        wait.waitUntilToBeClickAble(txtDateOfBirth);
        txtDateOfBirth.clear();
        txtDateOfBirth.sendKeys(key);
    }

    private void inputAddress(String key) {
        wait.waitUntilToBeClickAble(txtAddress);
        txtAddress.clear();
        txtAddress.sendKeys(key);
    }

    private void inputCity(String key) {
        wait.waitUntilToBeClickAble(txtCity);
        txtCity.clear();
        txtCity.sendKeys(key);
    }

    private void inputState(String key) {
        wait.waitUntilToBeClickAble(txtState);
        txtState.clear();
        txtState.sendKeys(key);
    }

    private void inputPIN(String key) {
        wait.waitUntilToBeClickAble(txtPIN);
        txtPIN.clear();
        txtPIN.sendKeys(key);
    }

    private void inputMobile(String key) {
        wait.waitUntilToBeClickAble(txtMobileNumber);
        txtMobileNumber.clear();
        txtMobileNumber.sendKeys(key);
    }

    private void inputEmail(String key) {
        wait.waitUntilToBeClickAble(txtEmail);
        txtEmail.clear();
        txtEmail.sendKeys(key);
    }

    private void inputPassword(String key) {
        wait.waitUntilToBeClickAble(txtPassword);
        txtPassword.clear();
        txtPassword.sendKeys(key);
    }

    public CustomerRegisterSuccessPage submit() {
        wait.waitUntilToBeClickAble(btnSubmit);
        btnSubmit.click();
        wait.waitForPageLoad();
        return new CustomerRegisterSuccessPage(driver);
    }
}
