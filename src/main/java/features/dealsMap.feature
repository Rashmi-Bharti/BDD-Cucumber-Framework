Feature: Deal data creation

Scenario: Free CRM login Test Scenario
Given user is already on Login Page
When title of login page is FreeCRM
Then user enters username and password
|username | password |
|batchautomation | Test@12345 |
And user clicks on login button
Then user is on HomePage
Then user moves to new Deal page
Then user enters deal details
 |title|amount|probability|commission| 
 |test deal1| 1000 | 50| 10|
 |test deal2| 2000 | 60| 20|
 |test deal3| 3000 | 70| 30|
Then close the browser