#Before Hooks
#Background
#Scenario
#After Hooks

Feature: Login functionality.
Background: 
Given The user goes to the application landing page
And The user goes to the login page

@Keerthi
Scenario: Admin login
When then admin user enters "keerthi" and 123456
Then user accounts page is displayed

@Smoke
Scenario Outline: user login
When then user enters "<username>" and "<password>"
Then user accounts page is displayed

Examples:

|username|password|
|keer|1234|
|nihi|12345|
|xyz|123456|

#@Unit
#Scenario Outline: user login
#Given The user goes to the application landing page
#And The user goes to the Sign up page
#When then user enters
#|Fname|
#|Lname|
#|Mobile|
#|email|
#|pincode|
#|password|
#|confirmPassword|
#Then user accounts is created