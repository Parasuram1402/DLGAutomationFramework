@DEMO-4
Feature: Account Creation

	#Scenario to the search functionality of the screen	
	@DEMO-3
	Scenario Outline: Scenario to create account
		Given User Logged into PolicyCenter
		And Browse to Create Account Screen
		When Entered Require Details for Create Account <iteration>
		Then Account is Created Successfully <iteration>
		
		Examples:
		    | iteration |
		    |	1					|
		    	    
	@DEMO-2
	Scenario Outline: Scenario to test search
		Given User Logged into PolicyCenter
		And Browse to Create Account Screen
		When Entered Require Details for Search <iteration>
		Then Details of Account should be displayed
		
		Examples:
		    | iteration |
		    |	1					|	
		    