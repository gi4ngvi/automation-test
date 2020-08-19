package com.pages.functions;

import com.pages.locators.CustomerRegisterSuccessLocator;
import org.openqa.selenium.WebDriver;

public class CustomerRegisterSuccessPage extends CustomerRegisterSuccessLocator {

    public CustomerRegisterSuccessPage(WebDriver driver) {
        super(driver);
    }

    public String getSuccessMessage() {
        wait.waitUntilVisibilityOf(lblSuccessMsg);
        return lblSuccessMsg.getText();
    }
}
