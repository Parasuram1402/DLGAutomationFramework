@tag
Feature: Title of your feature

  @tag1
  Scenario Outline: Title of your scenario <iteration>
    Given I want to write a step with precondition <iteration>
    And some other precondition <iteration>
    When I complete action <iteration>
    And some other action <iteration>
    Then I validate the outcomes <iteration>
    And check more outcomes <iteration>

  Examples: 
  	|iteration|
  	|		1			|
  	|		2			|