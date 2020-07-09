Feature: Free CRM login feature

#without Examples keyword
#Scenario: Free CRM login Test Scenario
#Given user is already on Login Page
#When title of login page is FreeCRM
#Then user enters "batchautomation" and "Test@12345"
#And user clicks on login button
#Then user is on HomePage
#Then close the browser

#with Example keyword
Scenario Outline: Free CRM login Test Scenario
Given user is already on Login Page
When title of login page is FreeCRM
Then user enters "<username>" and "<password>"
And user clicks on login button
Then user is on HomePage
Then close the browser

Examples:

| username | password |
|batchautomation| Test@12345|
|tom| test123|




