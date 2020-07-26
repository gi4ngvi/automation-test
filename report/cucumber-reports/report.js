$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/features/ValidateGoogleSearch.feature");
formatter.feature({
  "name": "Validate Google Search Result",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Validate Google search result",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to Google site \u0027https://www.google.com/\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_go_to_Google_site(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search with keyword \u0027the beatles\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_search_with_keyword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should see all results are contains \u0027the beatles\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_should_see_all_results_are_contains(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "my inputted string \u0027the beatles\u0027 still remained on the search box",
  "keyword": "And "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.my_inputted_string_still_remained_on_the_search_box(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Validate Youtube result from Google search",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I go to Google site \u0027https://www.google.com/\u0027",
  "keyword": "Given "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_go_to_Google_site(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I search with keyword \u0027the beatles\u0027",
  "keyword": "When "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_search_with_keyword(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I get first Youtube link result",
  "keyword": "And "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_get_first_Youtube_link_result()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click first Youtube link",
  "keyword": "And "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_click_first_Youtube_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the video title should be same with result on Google page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.the_video_title_should_be_same_with_result_on_Google_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I play the video",
  "keyword": "When "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_play_the_video()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the video should be played",
  "keyword": "Then "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.the_video_should_be_played()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I pause the video after 10 seconds",
  "keyword": "When "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.i_pause_the_video_after_seconds(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the video should be paused",
  "keyword": "Then "
});
formatter.match({
  "location": "com.definitions.StepDefinitions.the_video_should_be_paused()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});