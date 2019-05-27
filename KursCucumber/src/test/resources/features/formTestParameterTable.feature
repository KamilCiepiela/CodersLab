Feature: Form test

    Scenario Outline: many user cen register
      Given there is browser opened with page "http://aavtrain.com/"
      When user clicks on registration button
      Then user is on registration page
      When input field firstname is field with <firstnameparameter>
      When input field lasttname is field with <lastnameparameter>
      When input field email is field with <emailparameter>
      When input field username is field with <usernameparameter>
      When input field address is field with <addressparameter>
      When input field city is field with <cityparameter>
      When input field prov is field with <provparameter>
      When input field zip is field with <zipparameter>
      When input field password is field with <passwordparameter>
      Then submit the form
      And close the browser
  Examples:
    | firstnameparameter | lastnameparameter | emailparameter                | usernameparameter | addressparameter | cityparameter | provparameter | zipparameter | passwordparameter |
    | Karol              | Kowalski          | karol.kowalski@mailinator.com | KowalskiK         | Prosta	51      | Warsaw        | mazowiecki    | 00-020       | Pass123           |
    | Adam               | Nowak             | adam.nowak@mailinator.com     | ANow              | Krzywa 1         | Warsaw        | mazowiecki    | 00-020       | 321Pass           |
