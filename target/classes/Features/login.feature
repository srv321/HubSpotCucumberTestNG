Feature: HubSpot Login Feature 

Scenario Outline: HubSpot Login Test Scenario

	Given user is already on Login Page 
	When title of login page is HubSpot Login 
	Then  user enters "<username>" and "<password>" 
	Then user clicks on login button 
	Then user is on home page 
	Then Close the browser 
	
	
	Examples: 
		| username           | password    |
		| srv321@gmail.com   | usabI009@@# |