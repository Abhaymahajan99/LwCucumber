$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Test LW website",
  "description": "",
  "id": "test-lw-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Functionality",
  "description": "",
  "id": "test-lw-website;login-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is to be on Lw Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Title of LawyerWangu page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User Enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "User is succesfully Login",
  "keyword": "And "
});
formatter.match({
  "location": "Logintest.user_is_to_be_on_lw_pages()"
});
formatter.result({
  "duration": 15299038813,
  "status": "passed"
});
formatter.match({
  "location": "Logintest.Title_of_LawyerWangu_page()"
});
formatter.result({
  "duration": 19905559,
  "status": "passed"
});
formatter.match({
  "location": "Logintest.User_Enter_username_and_password()"
});
formatter.result({
  "duration": 17774990510,
  "status": "passed"
});
formatter.match({
  "location": "Logintest.Click_on_submit_button()"
});
formatter.result({
  "duration": 3784942578,
  "status": "passed"
});
formatter.match({
  "location": "Logintest.User_is_succesfully_Login()"
});
formatter.result({
  "duration": 293187091,
  "status": "passed"
});
});