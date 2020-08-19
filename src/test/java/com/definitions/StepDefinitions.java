package com.definitions;

import com.pages.functions.CreateNewCustomerPage;
import com.pages.functions.CustomerRegisterSuccessPage;
import com.pages.functions.HomePage;
import com.pages.functions.MainMenu;
import entity.Customer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.DataTest;
import utils.SeleniumUtils;

public class StepDefinitions {
    private static final String HOME_URL = "http://demo.guru99.com/v4";
    private HomePage homePage;
    private MainMenu mainMenu;
    private CreateNewCustomerPage createNewCustomerPage;
    private CustomerRegisterSuccessPage customerRegisterSuccessPage;
    private Customer testCustomer;
    private String customerID;

    @Given("I go to homepage")
    public void i_go_to_homepage() {
        SeleniumUtils.getWebDriver().get(HOME_URL);
        homePage = new HomePage(SeleniumUtils.getWebDriver());
    }

    @Given("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String id, String password) {
        mainMenu = homePage.login(id, password);
    }

    @When("I click New Customer")
    public void i_click_New_Customer() {
        createNewCustomerPage = mainMenu.goToCreateNewCustomer();
    }

    @When("I input new customer information")
    public void i_input_new_customer_information() {
        testCustomer = DataTest.createRandomCustomer();
        createNewCustomerPage.inputCustomerInformation(testCustomer);
    }

    @When("I click submit")
    public void i_click_submit() {
        customerRegisterSuccessPage = createNewCustomerPage.submit();
    }

    @Then("I should see success message {string}")
    public void i_should_see_success_message(String successMsg) {
        Assert.assertEquals(successMsg, customerRegisterSuccessPage.getSuccessMessage());
    }


    @Then("customer information should be correct")
    public void customer_information_should_be_correct() {
        // Write code here that turns the phrase above into concrete actions
    }
}
