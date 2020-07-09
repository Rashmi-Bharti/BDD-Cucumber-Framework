Feature: Free CRM create a new scenario
#with Example keyword
Scenario Outline: Free CRM login Test Scenario
Given user is already on Login Page
When title of login page is FreeCRM
Then user enters "<username>" and "<password>"
And user clicks on login button
Then user is on HomePage
Then user move to new contact page
Then user enters contact details "<firstname>" and "<lastname>" and "<position>"
Then close the browser

Examples:

 |username | password | firstname | lastname | position|
 |batchautomation |Test@12345 | rashmi | Bharti | TestAnalyst|
 |batchautomation |Test@12345 | Davuid | das | director|
 