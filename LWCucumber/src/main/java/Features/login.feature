Feature: Test LW website

Scenario Outline: Login Functionality

Given user is to be on Lw Page
When Title of LawyerWangu page
Then User Enters "<email>" and "<password>"
Then Click on submit button
And User is succesfully Login

Examples:
	| email | password |
	| lwtesterindi@gmail.com | tester@123 |
	
	| lwtesterindi123@gmail.com | tester@124 | 

