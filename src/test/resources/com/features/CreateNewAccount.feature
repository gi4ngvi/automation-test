Feature: Create New Account
  Background:
    Given I go to homepage
    And I login with username 'mngr279494' and password 'bAburyh'
    When I click New Customer
    And I input new customer information
    And I click submit new customer
    Then customer information should be correct

  Scenario: Validate Create New Account Success
    Given I click New Account
    And I input new account information with init deposit 999999
    And I click submit new account
    Then I should see account success message 'Account Generated Successfully!!!'
    And account information should be correct
