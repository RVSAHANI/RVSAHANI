Feature: Login feature

Background:
When user should be on login page.

@test1
Scenario: Valid Login
Then user enters the valid login credential 
And user click on login button
Then user navigate the Home page
And user can click on logout link

@test2
Scenario Outline: Invalid Login
Then user enters the invalid userid as "<userid>" and password as "<password>"
And user click on login button
Then user get the error message on login page
Examples: 
|userid      |    password  |
|admin1      |    admin1    |
|admin2      |    admin2    |
|admin3      |    admin3    |


