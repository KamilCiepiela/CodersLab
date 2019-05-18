Feature: Google Search

  Scenario: user can search any keyword in Google
    Given an open browser with Google
    When "Selenium" word has been written into input field and submitted
    Then the first result contains "Selenium"
    And close browser

