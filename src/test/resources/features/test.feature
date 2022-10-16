Feature: To show how to use BDD Cucumber Framework

  @wip @smoke
  Scenario: simple print test1
    Given User go to print page
    When User enters what he wants to print
    Then the result should be printed

    @smoke
  Scenario: simple print test2
    Given User go to print page
    When User enters what he wants to print
    Then the result should be printed

      @regression
  Scenario: simple print test3
    Given User go to print page
    When User enters what he wants to print
    Then the result should be printed

  Scenario: simple print test4
    Given User go to print page
    When User enters what he wants to print
    Then the result should be printed
