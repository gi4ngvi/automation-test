package com.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumFactory;

public class MainMenuLocator extends SeleniumFactory {
    @FindBy(how = How.CSS, using = "a[href='addcustomerpage.php']")
    protected WebElement lnkNewCustomer;
    @FindBy(how = How.CSS, using = "a[href='addAccount.php']")
    protected WebElement lnkNewAccount;
    @FindBy(how = How.CSS, using = "a[href='DepositInput.php']")
    protected WebElement lnkDeposit;

    public MainMenuLocator(WebDriver driver) {
        super(driver);
    }

}
