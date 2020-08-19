Feature: Create New Customer

  Scenario: Validate Create New Customer Success
    Given I go to homepage
    And I login with username 'mngr279494' and password 'bAburyh'
    When I click New Customer
    And I input new customer information
    And I click submit new customer
    Then I should see customer success message 'Customer Registered Successfully!!!'
    And customer information should be correct
