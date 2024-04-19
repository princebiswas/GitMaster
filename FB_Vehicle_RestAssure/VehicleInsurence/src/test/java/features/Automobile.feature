@tag
Feature: Automobile
  I want to use this template for my feature file

  @tag1
  Scenario: Enter Vehicle Data
    Given User enters the url in browser
    Then Click on Automobile Tab
    Then Click on Enter Vehicle Data
    Then Click on Make dropdown
    Then Select "BMW" from dropdown
    Then Enter "1200" in Engine Performance [kW] text box

  @tag2
  Scenario Outline: Engine Performence text box validate
    Given User enters numaric data in the textbox
    When I check for the <value> in step
    Then I verify the <status> in step
    And Validate the error

    Examples: 
      | value | status  |
      |  1200 | success |
      |  3000 | Fail    |
