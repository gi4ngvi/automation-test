package com.pages.functions;

import com.pages.locators.HomeLocator;
import org.openqa.selenium.WebDriver;

public class HomePage extends HomeLocator {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public MainMenu login(String id, String password) {
        inputID(id);
        inputPassword(password);
        submit();
        wait.waitForPageLoad();
        return new MainMenu(driver);
    }

    private void inputID(String id) {
        wait.waitUntilToBeClickAble(txtID);
        txtID.clear();
        txtID.sendKeys(id);
    }

    private void inputPassword(String password) {
        wait.waitUntilToBeClickAble(txtPassword);
        txtPassword.clear();
        txtPassword.sendKeys(password);
    }

    private void submit() {
        wait.waitUntilToBeClickAble(btnLogin);
        btnLogin.click();
    }
}
