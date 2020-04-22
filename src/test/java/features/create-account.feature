Feature: Create Sales force Account 


@smoke1 @regression 
Scenario Outline: Verify user is able to create salesforce account successfully 
	Given "<user>" logs into the salesforce application 
	And user navigates to createAccount page
	When user clicks on SignIn button 
	Then user should be logged in successfully 
	Examples: 
		|user|
		|admin|