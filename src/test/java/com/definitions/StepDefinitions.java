package com.definitions;

import com.pages.functions.*;
import com.pages.functions.account.AccountRegisterSuccessPage;
import com.pages.functions.account.CreateNewAccountPage;
import com.pages.functions.customer.CreateNewCustomerPage;
import com.pages.functions.customer.CustomerRegisterSuccessPage;
import com.pages.functions.deposit.DepositPage;
import entity.Account;
import entity.Customer;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.DataTest;
import utils.SeleniumUtils;
import utils.StringUtils;

public class StepDefinitions {
    private static final String HOME_URL = "http://demo.guru99.com/v4";
    private HomePage homePage;
    private MainMenu mainMenu;
    private CreateNewCustomerPage createNewCustomerPage;
    private CustomerRegisterSuccessPage customerRegisterSuccessPage;
    private CreateNewAccountPage createNewAccountPage;
    private AccountRegisterSuccessPage accountRegisterSuccessPage;
    private DepositPage depositPage;
    private TransactionDetailsPage transactionDetailsPage;
    private Customer testCustomer;
    private Account testAccount;

    @Given("I go to homepage")
    public void i_go_to_homepage() {
        SeleniumUtils.getWebDriver().get(HOME_URL);
        homePage = new HomePage(SeleniumUtils.getWebDriver());
    }

    @Given("I login with username {string} and password {string}")
    public void i_login_with_username_and_password(String id, String password) {
        mainMenu = homePage.login(id, password);
    }

    @Given("I click New Account")
    public void i_click_New_Account() {
        createNewAccountPage = mainMenu.goToCreateNewAccount();
    }

    @Given("I click Deposit")
    public void i_click_Deposit() {
        depositPage = mainMenu.goToDeposit();
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

    @When("I input new account information with init deposit {int}")
    public void i_input_new_account_information_with_init_deposit(Integer deposit) {
        testAccount = DataTest.createAccountForCustomer(testCustomer);
        testAccount.setDeposit(deposit);
        createNewAccountPage.inputAccountInformation(testAccount);
    }

    @When("I input account number")
    public void i_input_account_number() {
        depositPage.inputAccountNumber(testAccount.getAccountID());
    }

    @When("I input amount {int}")
    public void i_input_amount(Integer amount) {
        depositPage.inputAmount(amount);
        testAccount.setDeposit(testAccount.getDeposit() + amount);
    }

    @When("I input description {string}")
    public void i_input_description(String description) {
        depositPage.inputDescription(description);
    }

    @When("I click submit new customer")
    public void i_click_submit_new_customer() {
        customerRegisterSuccessPage = createNewCustomerPage.submit();
    }

    @When("I click submit new account")
    public void i_click_submit_new_account() {
        accountRegisterSuccessPage = createNewAccountPage.submit();
    }

    @When("I click submit deposit")
    public void i_click_submit_deposit() {
        transactionDetailsPage = depositPage.submit();
    }

    @Then("I should see customer success message {string}")
    public void i_should_see_customer_success_message(String successMsg) {
        Assert.assertEquals(successMsg, customerRegisterSuccessPage.getSuccessMessage());
    }

    @Then("I should see account success message {string}")
    public void i_should_see_account_success_message(String successMsg) {
        Assert.assertEquals(successMsg, accountRegisterSuccessPage.getSuccessMessage());
    }

    @Then("customer information should be correct")
    public void customer_information_should_be_correct() {
        String birthday = StringUtils.changeDateFormat(testCustomer.getDateOfBirth(), "dd/MM/yyyy", "yyyy-MM-dd");
        Assert.assertNotNull(customerRegisterSuccessPage.getCustomerID());
        Assert.assertEquals(testCustomer.getName(), customerRegisterSuccessPage.getCustomerName());
        Assert.assertEquals(testCustomer.getGender(), customerRegisterSuccessPage.getCustomerGender());
        Assert.assertEquals(birthday, customerRegisterSuccessPage.getCustomerBirthDate());
        Assert.assertEquals(testCustomer.getAddress(), customerRegisterSuccessPage.getCustomerAddress());
        Assert.assertEquals(testCustomer.getCity(), customerRegisterSuccessPage.getCustomerCity());
        Assert.assertEquals(testCustomer.getState(), customerRegisterSuccessPage.getCustomerState());
        Assert.assertEquals(testCustomer.getPin(), customerRegisterSuccessPage.getCustomerPin());
        Assert.assertEquals(testCustomer.getMobile(), customerRegisterSuccessPage.getCustomerMobile());
        Assert.assertEquals(testCustomer.getEmail(), customerRegisterSuccessPage.getCustomerEmail());
        testCustomer.setId(customerRegisterSuccessPage.getCustomerID());
    }

    @Then("account information should be correct")
    public void account_information_should_be_correct() {
        Assert.assertNotNull(accountRegisterSuccessPage.getAccountID());
        Assert.assertEquals(testAccount.getCustomerID(), accountRegisterSuccessPage.getCustomerID());
        Assert.assertEquals(testAccount.getName(), accountRegisterSuccessPage.getCustomerName());
        Assert.assertEquals(testAccount.getEmail(), accountRegisterSuccessPage.getEmail());
        Assert.assertEquals(testAccount.getAccountType(), accountRegisterSuccessPage.getAccountType());
        Assert.assertEquals(testAccount.getOpenDate(), accountRegisterSuccessPage.getOpenDate());
        Assert.assertEquals(String.valueOf(testAccount.getDeposit()), accountRegisterSuccessPage.getCurrentAmount());
        testAccount.setAccountID(accountRegisterSuccessPage.getAccountID());
    }

    @Then("transaction id should be displayed")
    public void transaction_id_should_be_displayed() {
        Assert.assertNotNull(transactionDetailsPage.getTransactionID());
    }

    @Then("account number should be correct")
    public void account_number_should_be_correct() {
        Assert.assertEquals(testAccount.getAccountID(), transactionDetailsPage.getAccountNumber());
    }

    @Then("credited amount should be {int}")
    public void credited_amount_should_be(Integer creditedAmount) {
        Assert.assertEquals(String.valueOf(creditedAmount), transactionDetailsPage.getAmountCredited());
    }

    @Then("type of transaction should be {string}")
    public void type_of_transaction_should_be(String type) {
        Assert.assertEquals(type, transactionDetailsPage.getTypeOfTransaction());
    }

    @Then("description should be {string}")
    public void description_should_be(String description) {
        Assert.assertEquals(description, transactionDetailsPage.getDescription());
    }

    @Then("current balance should be correct.")
    public void current_balance_should_be_correct() {
        Assert.assertEquals(String.valueOf(testAccount.getDeposit()), transactionDetailsPage.getCurrentBalance());
    }

}
