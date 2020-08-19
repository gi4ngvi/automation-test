package com.pages.functions;

import com.pages.functions.account.CreateNewAccountPage;
import com.pages.functions.customer.CreateNewCustomerPage;
import com.pages.functions.deposit.DepositPage;
import com.pages.locators.MainMenuLocator;
import org.openqa.selenium.WebDriver;

public class MainMenu extends MainMenuLocator {

    public MainMenu(WebDriver driver) {
        super(driver);
    }

    public CreateNewCustomerPage goToCreateNewCustomer() {
        wait.waitUntilToBeClickAble(lnkNewCustomer);
        lnkNewCustomer.click();
        wait.waitForPageLoad();
        return new CreateNewCustomerPage(driver);
    }

    public CreateNewAccountPage goToCreateNewAccount() {
        wait.waitUntilToBeClickAble(lnkNewAccount);
        lnkNewAccount.click();
        wait.waitForPageLoad();
        return new CreateNewAccountPage(driver);
    }

    public DepositPage goToDeposit() {
        wait.waitUntilToBeClickAble(lnkDeposit);
        action.scrollToElement(lnkDeposit);
        lnkDeposit.click();
        wait.waitForPageLoad();
        return new DepositPage(driver);
    }
}
