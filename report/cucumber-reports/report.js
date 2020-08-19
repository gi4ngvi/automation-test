$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/features/CreateNewCustomer.feature");
formatter.feature({
  "name": "Create New Customer",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Create New Customer Success",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_go_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login with username \u0027mngr279494\u0027 and password \u0027bAburyh\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_login_with_username_and_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click New Customer",
  "keyword": "When "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_click_New_Customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I input new customer information",
  "keyword": "And "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_input_new_customer_information()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click submit",
  "keyword": "And "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_click_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see success message \u0027Customer Registered Successfully!!!\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_should_see_success_message(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "customer information should be correct",
  "keyword": "And "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.customer_information_should_be_correct()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});