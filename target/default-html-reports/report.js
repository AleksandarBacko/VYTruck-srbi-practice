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
  "name": "Wrong email in forget password module",
  "description": "",
  "keyword": "Scenario",
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
  "name": "User click forget passsword button",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.login_StepDef.userClickForgetPassswordButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter wrong \"\u003cusername\u003e\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.vytrack.step_definitions.login_StepDef.userEnterWrong(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see wrong username error message",
  "keyword": "Then "
});
formatter.match({
  "location": "com.vytrack.step_definitions.login_StepDef.userShouldSeeWrongUsernameErrorMessage()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});