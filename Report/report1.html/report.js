$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/LoginDataTable.feature");
formatter.feature({
  "name": "open orangehrm.com feature with data table without header",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "open OrangeHrm website and login with data tables without header",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Positive"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is entering \"https://www.saucedemo.com/\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef1.user_is_entering(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters the given credentials below",
  "rows": [
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDef1.user_enters_the_given_credentials_below(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks  And gets login",
  "keyword": "When "
});
formatter.match({
  "location": "StepDef1.the_user_clicks_And_gets_login()"
});
formatter.result({
  "error_message": "java.lang.Error: Unresolved compilation problems: \n\tThe method click() is undefined for the type By\n\tSyntax error, insert \")\" to complete Expression\n\r\n\tat dataTables.StepDef1.the_user_clicks_And_gets_login(StepDef1.java:40)\r\n\tat ✽.the user clicks  And gets login(src/test/java/features/LoginDataTable.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "close the browser window",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef1.close_the_browser_window()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});