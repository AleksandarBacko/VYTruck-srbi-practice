$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/login.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "  Description: This is login functionality test",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Wrong credentials input",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@NegWip"
    }
  ]
});
formatter.step({
  "name": "user enters wrong \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "user should see error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "driver_username",
        "fake_negScenario_password"
      ]
    },
    {
      "cells": [
        "sales_manager_username",
        "fake_negScenario_password"
      ]
    },
    {
      "cells": [
        "store_manager_username",
        "fake_negScenario_password"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter login module",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.login_StepDef.user_enter_login_module()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Wrong credentials input",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@NegWip"
    }
  ]
});
formatter.step({
  "name": "user enters wrong \"driver_username\" and \"fake_negScenario_password\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.login_StepDef.userEntersWrongAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.login_StepDef.userShouldSeeErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter login module",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.login_StepDef.user_enter_login_module()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Wrong credentials input",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@NegWip"
    }
  ]
});
formatter.step({
  "name": "user enters wrong \"sales_manager_username\" and \"fake_negScenario_password\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.login_StepDef.userEntersWrongAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.login_StepDef.userShouldSeeErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User enter login module",
  "keyword": "When "
});
formatter.match({
  "location": "com.vytrack.step_definitions.login_StepDef.user_enter_login_module()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Wrong credentials input",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@wip"
    },
    {
      "name": "@NegWip"
    }
  ]
});
formatter.step({
  "name": "user enters wrong \"store_manager_username\" and \"fake_negScenario_password\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.login_StepDef.userEntersWrongAnd(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should see error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.login_StepDef.userShouldSeeErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});