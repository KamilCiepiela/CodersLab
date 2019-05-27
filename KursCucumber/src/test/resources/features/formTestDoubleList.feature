Feature: Form Test

  Scenario: User can register on the webside
    Given there is browser opened with page "http://aavtrain.com/"
    When user clicks on registration button
    Then user is on registration page
    When user fills all mandatory fields with values:
      | first_name | Karol                         |
      | last_name  | Kowalski                      |
      | email      | karol.kowalski@mailinator.com |
      | user_name  | KowalskiK                     |
      | address1   | Prosta	51                     |
      | city       | Warsaw                        |
      | prov       | mazowiecki                    |
      | zip        | 00-020                        |
      | password   | Pass123                       |
    Then submit the form
    And close the browser