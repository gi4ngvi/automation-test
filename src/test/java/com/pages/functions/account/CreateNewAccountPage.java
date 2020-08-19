package com.pages.functions.account;

import com.pages.locators.account.CreateNewAccountLocator;
import entity.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccountPage extends CreateNewAccountLocator {

    public CreateNewAccountPage(WebDriver driver) {
        super(driver);
    }

    public void inputAccountInformation(Account account) {
        inputCustomerId(account.getCustomerID());
        selectAccountType(account.getAccountType());
        inputInitDeposit(String.valueOf(account.getDeposit()));
    }

    private void inputCustomerId(String key) {
        wait.waitUntilToBeClickAble(txtCustomerId);
        txtCustomerId.clear();
        txtCustomerId.sendKeys(key);
    }

    private void selectAccountType(String key) {
        wait.waitUntilToBeClickAble(selectAccountType);
        Select selectType = new Select(selectAccountType);
        selectType.selectByVisibleText(key);
    }

    private void inputInitDeposit(String key) {
        wait.waitUntilToBeClickAble(txtInitDeposit);
        txtInitDeposit.clear();
        txtInitDeposit.sendKeys(key);
    }

    public AccountRegisterSuccessPage submit() {
        wait.waitUntilToBeClickAble(btnSubmit);
        btnSubmit.click();
        wait.waitForPageLoad();
        return new AccountRegisterSuccessPage(driver);
    }

}
