package com.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumFactory;

public class CustomerRegisterSuccessLocator extends SeleniumFactory {
    @FindBy(how = How.CSS, using = "table#customer p[align='center']")
    protected WebElement lblSuccessMsg;
    @FindBy(how = How.XPATH, using = "//td[text()='Customer ID']/following-sibling::td")
    protected WebElement lblCustomerID;
    @FindBy(how = How.XPATH, using = "//td[text()='Customer Name']/following-sibling::td")
    protected WebElement lblCustomerName;
    @FindBy(how = How.XPATH, using = "//td[text()='Gender']/following-sibling::td")
    protected WebElement lblCustomerGender;
    @FindBy(how = How.XPATH, using = "//td[text()='Birthdate']/following-sibling::td")
    protected WebElement lblCustomerBirthday;
    @FindBy(how = How.XPATH, using = "//td[text()='Address']/following-sibling::td")
    protected WebElement lblCustomerAddress;
    @FindBy(how = How.XPATH, using = "//td[text()='City']/following-sibling::td")
    protected WebElement lblCustomerCity;
    @FindBy(how = How.XPATH, using = "//td[text()='State']/following-sibling::td")
    protected WebElement lblCustomerState;
    @FindBy(how = How.XPATH, using = "//td[text()='Pin']/following-sibling::td")
    protected WebElement lblCustomerPIN;
    @FindBy(how = How.XPATH, using = "//td[text()='Mobile No.']/following-sibling::td")
    protected WebElement lblCustomerMobile;
    @FindBy(how = How.XPATH, using = "//td[text()='Email']/following-sibling::td")
    protected WebElement lblCustomerEmail;


    public CustomerRegisterSuccessLocator(WebDriver driver) {
        super(driver);
    }
}
