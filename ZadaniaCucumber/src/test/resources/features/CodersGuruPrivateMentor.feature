Feature: Registration on CodersGuru as a private user

  Scenario Outline: User registers as a private user
    Given an open browser with page "https://men-men-s-01.codersguru.pl/"
    When user clicks on "Załóż konto" button
    Then user moves to registration subpage
    Then inputs field email with field <emailparameter>
    Then inputs field firstname with field <firstnameparameter>
    Then inputs field lastname with field <lastnameparameter>
    Then inputs field password with field <passwordparameter>
    Then inputs field repeat password with field <repeatpasswordparameter>
    Then inputs field city with field <cityparameter>
    Then inputs field zip with field <zipparameter>
    Then inputs field street with field <streetparameter>
    Then inputs field appartment with field <appartmentparameter>
    When user fills checkbox with regulations agreement
    Then submits the filled form and confirms logging in
    When
    And closes the browser
    Examples:
      | emailparameter                | firstnameparameter | lastnameparameter | passwordparameter | repeatpasswordparameter | cityparameter | zipparameter | streetparameter | appartmentparameter |
      | karol.kowalski@mailinator.com | Karol              | Kowalski          | Pass123           | Pass123                 | Warszawa      | 00-020       | Prosta          | 51/69               |
      | adam.nowak@mailinator.com     | Adam               | Nowak             | 321Pass           | 321Pass                 | Warszawa      | 00-050       | Krzywa          | 1/4                 |