$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/AccountCreation.feature");
formatter.feature({
  "line": 2,
  "name": "Account Creation",
  "description": "",
  "id": "account-creation",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@DEMO-4"
    }
  ]
});
formatter.scenarioOutline({
  "comments": [
    {
      "line": 4,
      "value": "#Scenario to the search functionality of the screen"
    }
  ],
  "line": 6,
  "name": "Scenario to create account",
  "description": "",
  "id": "account-creation;scenario-to-create-account",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@DEMO-3"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User Logged into PolicyCenter",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Browse to Create Account Screen",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Entered Require Details for Create Account \u003citeration\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Account is Created Successfully \u003citeration\u003e",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "account-creation;scenario-to-create-account;",
  "rows": [
    {
      "cells": [
        "iteration"
      ],
      "line": 13,
      "id": "account-creation;scenario-to-create-account;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 14,
      "id": "account-creation;scenario-to-create-account;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 4802742369,
  "status": "passed"
});
formatter.before({
  "duration": 21941973,
  "status": "passed"
});
formatter.before({
  "duration": 41806120,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Scenario to create account",
  "description": "",
  "id": "account-creation;scenario-to-create-account;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@DEMO-3"
    },
    {
      "line": 1,
      "name": "@DEMO-4"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User Logged into PolicyCenter",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Browse to Create Account Screen",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Entered Require Details for Create Account 1",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Account is Created Successfully 1",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "POD1_StepDefinitions.user_Logged_into_PolicyCenter()"
});
formatter.embedding("image/png", "embedded0.png");
formatter.result({
  "duration": 12414039208,
  "status": "passed"
});
formatter.match({
  "location": "POD1_StepDefinitions.browse_to_Create_Account_Screen()"
});
formatter.embedding("image/png", "embedded1.png");
formatter.result({
  "duration": 12838660872,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 43
    }
  ],
  "location": "POD1_StepDefinitions.entered_Require_Details_for_Create_Account(int)"
});
formatter.embedding("image/png", "embedded2.png");
formatter.result({
  "duration": 34456169669,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 32
    }
  ],
  "location": "POD1_StepDefinitions.account_is_Created_Successfully(int)"
});
formatter.embedding("image/png", "embedded3.png");
formatter.result({
  "duration": 13189804565,
  "status": "passed"
});
formatter.after({
  "duration": 684187672,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 17,
  "name": "Scenario to test search",
  "description": "",
  "id": "account-creation;scenario-to-test-search",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@DEMO-2"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User Logged into PolicyCenter",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Browse to Create Account Screen",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Entered Require Details for Search \u003citeration\u003e",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Details of Account should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "line": 23,
  "name": "",
  "description": "",
  "id": "account-creation;scenario-to-test-search;",
  "rows": [
    {
      "cells": [
        "iteration"
      ],
      "line": 24,
      "id": "account-creation;scenario-to-test-search;;1"
    },
    {
      "cells": [
        "1"
      ],
      "line": 25,
      "id": "account-creation;scenario-to-test-search;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3815418511,
  "status": "passed"
});
formatter.before({
  "duration": 294513,
  "status": "passed"
});
formatter.before({
  "duration": 1343433,
  "status": "passed"
});
formatter.scenario({
  "line": 25,
  "name": "Scenario to test search",
  "description": "",
  "id": "account-creation;scenario-to-test-search;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 16,
      "name": "@DEMO-2"
    },
    {
      "line": 1,
      "name": "@DEMO-4"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "User Logged into PolicyCenter",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "Browse to Create Account Screen",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Entered Require Details for Search 1",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "Details of Account should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "POD1_StepDefinitions.user_Logged_into_PolicyCenter()"
});
formatter.embedding("image/png", "embedded4.png");
formatter.result({
  "duration": 12301391386,
  "status": "passed"
});
formatter.match({
  "location": "POD1_StepDefinitions.browse_to_Create_Account_Screen()"
});
formatter.embedding("image/png", "embedded5.png");
formatter.result({
  "duration": 12913116023,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 35
    }
  ],
  "location": "POD1_StepDefinitions.entered_Require_Details_for_Search(int)"
});
formatter.embedding("image/png", "embedded6.png");
formatter.result({
  "duration": 15050309994,
  "status": "passed"
});
formatter.match({
  "location": "POD1_StepDefinitions.details_of_Account_should_be_displayed()"
});
formatter.embedding("image/png", "embedded7.png");
formatter.result({
  "duration": 8123088309,
  "status": "passed"
});
formatter.after({
  "duration": 690390947,
  "status": "passed"
});
});