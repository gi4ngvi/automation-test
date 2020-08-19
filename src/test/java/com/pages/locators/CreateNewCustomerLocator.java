package com.pages.locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utils.SeleniumFactory;

public class CreateNewCustomerLocator extends SeleniumFactory {
    @FindBy(how = How.CSS, using = "input[name='name']")
    protected WebElement txtCustomerName;
    @FindBy(how = How.CSS, using = "input[value='m']")
    protected WebElement radMale;
    @FindBy(how = How.CSS, using = "input[value='f']")
    protected WebElement radFemale;
    @FindBy(how = How.CSS, using = "input[name='dob']")
    protected WebElement txtDateOfBirth;
    @FindBy(how = How.CSS, using = "textarea[name='addr']")
    protected WebElement txtAddress;
    @FindBy(how = How.CSS, using = "input[name='city']")
    protected WebElement txtCity;
    @FindBy(how = How.CSS, using = "input[name='state']")
    protected WebElement txtState;
    @FindBy(how = How.CSS, using = "input[name='pinno']")
    protected WebElement txtPIN;
    @FindBy(how = How.CSS, using = "input[name='telephoneno']")
    protected WebElement txtMobileNumber;
    @FindBy(how = How.CSS, using = "input[name='emailid']")
    protected WebElement txtEmail;
    @FindBy(how = How.CSS, using = "input[name='password']")
    protected WebElement txtPassword;
    @FindBy(how = How.CSS, using = "input[name='sub']")
    protected WebElement btnSubmit;

    public CreateNewCustomerLocator(WebDriver driver) {
        super(driver);
    }
}
