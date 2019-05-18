Feature: Form Test

  Scenario: user can register on the page http://aavtrain.com/
    Given there is browser opened with page "http://aavtrain.com/"
    When user clicks on registration button
    Then user is on registration page
    When user fill all mandatory fields
      | Karol    |
      | Kowalski |
