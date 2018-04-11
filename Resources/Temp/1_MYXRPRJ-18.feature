@MYXRPRJ-32
@MYXRPRJ-10
Feature: MyEpic
			
	@MYXRPRJ-11	@MYXRPRJ-19	@MYXRPRJ-12 @MYXRPRJ-13
	Scenario Outline: Automated Test Google Search 1
			Given Google is Open <iteration>
			When Search for "Selenium" <iteration>
			Then Validate Search Results <iteration>
Examples:
    | iteration |
    |	1					|