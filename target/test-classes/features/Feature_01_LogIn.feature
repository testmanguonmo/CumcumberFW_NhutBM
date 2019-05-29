@LogInGuruBank 
Feature: Payment feature 
    As an automation tester
  I want a payment function 
  So that I want to make sure payment correctly

@CreateAccountAndLogin 
Scenario: Create account, login and verify login successfully 
	Given I navigate to Guru bank and click Here link 
	When I input email "Nhutbm" 
	And I click to submit account 
	And I get email and password 
	And I navigate to Log In page "http://demo.guru99.com/v4/" 
	And I log in system 
	Then Verify successfully with message "Welcome To Manager"
		
	