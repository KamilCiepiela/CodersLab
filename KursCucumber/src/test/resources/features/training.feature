Feature: training

  Scenario: a test without a purpose
    Given something is done
    When "sample word" is printed
    And 22 is printed correctly
    But we can use a list as well
      | cat  |
      | dog  |
      | lion |

  Scenario Outline: singing
    Given people trying singing
    When now <person> trying
    Then sings <how>
    Examples:
      | how       | person |
      | ugly      | me     |
      | beautiful | you    |

