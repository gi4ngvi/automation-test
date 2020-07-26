Feature: Validate Google Search Result

  Scenario: Validate Google search result
    Given I go to Google site 'https://www.google.com/'
    When I search with keyword 'the beatles'
    Then I should see all results are contains 'the beatles'
    And my inputted string 'the beatles' still remained on the search box

  Scenario: Validate Youtube result from Google search
    Given I go to Google site 'https://www.google.com/'
    When I search with keyword 'the beatles'
    And I get first Youtube link result
    And I click first Youtube link
    Then the video title should be same with result on Google page
    When I play the video
    Then the video should be played
    When I pause the video after 10 seconds
    Then the video should be paused
