$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Feature/LogIn_Test.feature");
formatter.feature({
  "line": 2,
  "name": "Login Action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "duration": 89885,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Successful Login with Valid Credentials",
  "description": "",
  "id": "login-action;successful-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@tag2"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User Navigate to LogInPage",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters UserName and Password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Message displayed Login Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Case.user_is_on_Home_Page()"
});
formatter.result({
  "duration": 91885821,
  "status": "passed"
});
formatter.match({
  "location": "Test_Case.user_Navigate_to_LogInPage()"
});
formatter.result({
  "duration": 584818,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertFalse(Assert.java:64)\r\n\tat org.junit.Assert.assertFalse(Assert.java:74)\r\n\tat stepDefinition.Test_Case.user_Navigate_to_LogInPage(Test_Case.java:25)\r\n\tat ✽.When User Navigate to LogInPage(Feature/LogIn_Test.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Test_Case.user_enters_UserName_and_Password()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Test_Case.message_displayed_Login_Successfully()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 12515,
  "status": "passed"
});
formatter.before({
  "duration": 18204,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Successful LogOut",
  "description": "",
  "id": "login-action;successful-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@tag3"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "User LogOut from the Application",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "Message displayed LogOut Successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Test_Case.user_LogOut_from_the_Application()"
});
formatter.result({
  "duration": 34133,
  "status": "passed"
});
formatter.match({
  "location": "Test_Case.message_displayed_LogOut_Successfully()"
});
formatter.result({
  "duration": 197973,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertFalse(Assert.java:64)\r\n\tat org.junit.Assert.assertFalse(Assert.java:74)\r\n\tat stepDefinition.Test_Case.message_displayed_LogOut_Successfully(Test_Case.java:49)\r\n\tat ✽.Then Message displayed LogOut Successfully(Feature/LogIn_Test.feature:12)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 10809,
  "status": "passed"
});
});