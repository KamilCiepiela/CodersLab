Feature: Form Test

  Scenario: a new user can register on the page http://aavtrain.com/
    Given there is browser opened with page "http://aavtrain.com/"
    When user clicks on registration button
    Then user is on registration page
    When user fills all mandatory fields
      | Karol                         |
      | Kowalski                      |
      | karol.kowalski@mailinator.com |
      | Kowalski                      |
      | Prosta	51                    |
      | Warsaw                        |
      | mazowiecki                    |
      | 00-020                        |
      | Pass123                       |
    Then submit the form
    And close the browser