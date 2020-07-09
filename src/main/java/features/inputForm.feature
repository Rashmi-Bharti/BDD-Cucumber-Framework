Feature: Input form Demo

Scenario: Input Form Submit
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