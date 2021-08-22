$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/Work.feature");
formatter.feature({
  "name": "Work",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "User should able to login",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.todomvc.step_definitions.WorkStepDefs.theUserIsOnTheLoginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the javaScript",
  "keyword": "And "
});
formatter.match({
  "location": "com.todomvc.step_definitions.WorkStepDefs.clickTheJavaScript()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the polymer",
  "keyword": "And "
});
formatter.match({
  "location": "com.todomvc.step_definitions.WorkStepDefs.clickThePolymer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "send \"Todo1\" İtems",
  "keyword": "When "
});
formatter.match({
  "location": "com.todomvc.step_definitions.WorkStepDefs.sendİtems(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "send \"Todo2\" İtems",
  "keyword": "And "
});
formatter.match({
  "location": "com.todomvc.step_definitions.WorkStepDefs.sendİtems(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "removes the second text",
  "keyword": "Then "
});
formatter.match({
  "location": "com.todomvc.step_definitions.WorkStepDefs.removesTheSecondText()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});