Feature: Deposit Account
  Background:
    Given I go to homepage
    And I login with username 'mngr279494' and password 'bAburyh'
    When I click New Customer
    And I input new customer information
    And I click submit new customer
    Then customer information should be correct
    When I click New Account
    And I input new account information with init deposit 99999
    And I click submit new account
    Then account information should be correct

  Scenario: Validate Create New Account Success
    Given I click Deposit
    When I input account number
    And I input amount 100
    And I input description 'test'
    And I click submit deposit
    Then transaction id should be displayed
    And account number should be correct
    And credited amount should be 100
    And type of transaction should be 'Deposit'
    And description should be 'test'
    And current balance should be correct.



