package com.pages.functions;

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
}
