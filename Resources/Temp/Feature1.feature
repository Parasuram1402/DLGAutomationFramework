@MYXRPRJ-34
@MYXRPRJ-18
Feature: MyEpic2

	@MYXRPRJ-11 @MYXRPRJ-19 @MYXRPRJ-12 @MYXRPRJ-16
	Scenario Outline: Automated Test Google Search
			Given Google is Open <iteration>
			When Search for "Selenium" <iteration>
			Then Validate Search Results <iteration>
Examples:
    | iteration |
    |	1					|
    |	2					|
			
			
	@MYXRPRJ-30 @MYXRPRJ-19 @MYXRPRJ-12 @MYXRPRJ-16
	Scenario Outline: Automated Test Google Search 2
			Given Google is Open <iteration>
			When Search for "Selenium" <iteration>
			Then Validate Search Results <iteration>
Examples:
    | iteration |
    |	1					|