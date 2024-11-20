Feature: User login functionality

#Scenario: Valid login
#Given User is on login page
#When User enters credentials
#Then Should display home page

#Scenario: Valid login
#Given User is on login page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display home page

#Scenario Outline: Valid login
#Given User is on login page
#When User enters "<userName>" and "<password>"
#Then Should display home page
#
#Examples:
#|userName|password|
#|tom|abcsd|
#|tomsmith|SuperSecretPassword!|
#|test1|pswd1ce|

#Scenario: Valid login
#Given User is on login page
#When User enters credentials in step
#	|tomsmith|SuperSecretPassword!|
#Then Should display home page with msg
#	|You logged into a secure area!|

	
	Scenario: Valid login
Given User is on login page
When User enters credentials in step as Map
  |userName|pswd|
	|tomsmith|SuperSecretPassword!|
Then Should display home page with msg
	|You logged into a secure area!|