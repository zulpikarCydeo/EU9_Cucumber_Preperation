Feature:

  Background:
    Given run background for one time

  Scenario: simple print test5
    Given User go to print page
    When User enters what he wants to print
    Then the result should be printed