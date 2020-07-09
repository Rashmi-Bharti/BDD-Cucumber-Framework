Feature: Deal data creation

Scenario: Free CRM login Test Scenario
Given user is already on Login Page
When title of login page is FreeCRM
Then user enters username and password
|batchautomation | Test@12345 |
And user clicks on login button
Then user is on HomePage
Then user moves to new Deal page
Then user enters deal details 
 | test deal| 1000 | 10 | 50 |
Then close the browser