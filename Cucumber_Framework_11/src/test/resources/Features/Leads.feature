Feature: Lead functionality

Background:


@test3
Scenario: Create Lead with mandatory fields
When user should be on login page.
Then user enters the valid login credential 
And user click on login button
When user click on new lead link
And then fill all mandatory fields and click on save button
Then lead should be created succesfully


@test4
Scenario: Create Lead with mandatory fields with step parameterization
When user should be on login page.
Then user enters the valid login credential 
And user click on login button
When user click on new lead link
When user creates multiple leads with "<lastname>" and "<company>" and verified
|  lastname     | company  |
|  Modi         | BJP      |
|  rahul        | congress |
|  Sharad       | NCP      |

Then lead should be created succesfully






