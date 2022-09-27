$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/SandeepKaur/IdeaProjects/demo/ThursdayTask/src/test/java/Features/UserLogin.feature");
formatter.feature({
  "name": "Applying for leave",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User applying for leave and then logout",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "navigate to Orange HRM website",
  "keyword": "Given "
});
formatter.match({
  "location": "Leave.navigate_to_Orange_HRM_website()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on Login Page and enter the Valid Credentials and verify",
  "keyword": "When "
});
formatter.match({
  "location": "Leave.user_is_on_Login_Page_and_enter_the_Valid_Credentials_and_verify()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will apply for leave",
  "keyword": "Then "
});
formatter.match({
  "location": "Leave.userWillApplyForLeave()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user will log out",
  "keyword": "And "
});
formatter.match({
  "location": "Leave.user_will_log_out()"
});
formatter.result({
  "status": "passed"
});
});