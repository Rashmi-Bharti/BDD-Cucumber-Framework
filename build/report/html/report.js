$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/R/eclipse-workspace/cucumber/src/main/java/features/inputForm.feature");
formatter.feature({
  "line": 1,
  "name": "Input form Demo",
  "description": "",
  "id": "input-form-demo",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Input Form Submit",
  "description": "",
  "id": "input-form-demo;input-form-submit",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is already in selenium demo page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters details",
  "rows": [
    {
      "cells": [
        "Rashmi",
        "Bharti",
        "rsb@gmail.com",
        "9876543123",
        "pune",
        "Vishalnagar"
      ],
      "line": 6
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user Select State from the dropdown",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enters rest  details",
  "rows": [
    {
      "cells": [
        "858521",
        "Fedex"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user Clicks the checkBox",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User enters \"Fedex Pricing\"",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "user Clicks the Send Button",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User Close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "InputFormStepDefination.user_already_Selenium_Demo_Page()"
});
formatter.result({
  "duration": 8404649100,
  "status": "passed"
});
formatter.match({
  "location": "InputFormStepDefination.user_enters_details(DataTable)"
});
formatter.result({
  "duration": 726166699,
  "status": "passed"
});
formatter.match({
  "location": "InputFormStepDefination.user_select_state_from_Dropdown()"
});
formatter.result({
  "duration": 121635700,
  "status": "passed"
});
formatter.match({
  "location": "InputFormStepDefination.user_enters_rest_details(DataTable)"
});
formatter.result({
  "duration": 197069701,
  "status": "passed"
});
formatter.match({
  "location": "InputFormStepDefination.user_Clicks_the_checkBox()"
});
formatter.result({
  "duration": 106709600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Fedex Pricing",
      "offset": 13
    }
  ],
  "location": "InputFormStepDefination.User_enters_ProjectDesc(String)"
});
formatter.result({
  "duration": 135059000,
  "status": "passed"
});
formatter.match({
  "location": "InputFormStepDefination.user_clicks_the_send_button()"
});
formatter.result({
  "duration": 254006800,
  "status": "passed"
});
formatter.match({
  "location": "InputFormStepDefination.Close_the_browser()"
});
formatter.result({
  "duration": 644325400,
  "status": "passed"
});
});