Feature: Create New Customer

  Scenario: Validate Create New Customer Success
    Given I go to homepage
    And I login with username 'mngr279494' and password 'bAburyh'
    When I click New Customer
    And I input new customer information
    And I click submit
    Then I should see success message 'Customer Registered Successfully!!!'
    And customer information should be correct
