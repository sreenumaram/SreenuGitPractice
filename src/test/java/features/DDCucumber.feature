
Feature: Datadriven trough data table


@Regression @smoke
Scenario: Print passed data
	Given User is on records page
	When User need all the information in records
	|sreenu|
	|Ravi|
	|Jeevan|
	|Ganesh|

	
	
@Regression
Scenario: Print passed data
	Given User is on records page
	When User need all the information in records
	|sreenu1|
	|Ravi1|
	|Jeevan1|
	|Ganesh1|
	
	
	@smoke
	Scenario: Print passed data
	Given User is on records page
	When User need all the information in records
	|sreenu2|
	|Ravi2|
	|Jeevan2|
	|Ganesh2|
	
	
	
	
	