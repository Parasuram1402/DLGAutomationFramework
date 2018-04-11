@DEMO-7
Feature: Test Billing Summary API

  @DEMO-6
  Scenario Outline: Test Multiple items
    Given Get the required API <iteration>
    When request is sent with required policy number and term <iteration>
    Then verify different billing summary response attributes <iteration>
    
    		Examples:
		    | iteration |
		    |	1					|	