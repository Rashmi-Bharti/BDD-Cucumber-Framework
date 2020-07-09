Feature: Free Selenium Demo

Scenario: Simple Form Demo
Given user is already in selenium demo page
Then user enters details
| Rashmi | Bharti | rsb@gmail.com | 9876543123 | pune | Vishalnagar |
Then user Select State from the dropdown
Then user enters rest  details
| 858521 | Fedex |
Then user Clicks the checkBox
Then User enters "Fedex Pricing"
Then user Clicks the Send Button
Then User Close the browser


#without Example keyword
#Scenario: Simple Form Demo

#Given User is already in Selenium Demo page
#Then User enters "Rashmi just stay strong everything will be fine"
#Then User clicks on Show Message button
#Then close the browser

#with example keyword
#Scenario Outline: Simple Form Demo

#Given User is in Selenium Demo page
#Then User enters "<msg>"
#Then User will Close the browser

#Examples:
 
#| msg | 
#| Rashmi just stay strong everything will be fine |
#| Rashmi you will get very good offer soon | 
