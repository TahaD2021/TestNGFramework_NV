$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Features/TekSchoolScenarios.feature");
formatter.feature({
  "line": 1,
  "name": "Tek School Scenarios",
  "description": "",
  "id": "tek-school-scenarios",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10265080900,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User is on TekSchool page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User Click on Test Environment link",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "User should see Test Environment page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinitions.user_is_on_TekSchool_page()"
});
formatter.result({
  "duration": 3148052200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_Click_on_Test_Environment_link()"
});
formatter.result({
  "duration": 893997600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinitions.user_should_see_Test_Environment_page()"
});
formatter.result({
  "duration": 7770200,
  "status": "passed"
});
formatter.scenario({
  "line": 64,
  "name": "SDET2019AUG_SDET_Register_Form_Test",
  "description": "",
  "id": "tek-school-scenarios;sdet2019aug-sdet-register-form-test",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 63,
      "name": "@SDET_RF_DBV"
    }
  ]
});
formatter.step({
  "comments": [
    {
      "line": 66,
      "value": "# When User click on myAccount menu on top of the page"
    },
    {
      "line": 67,
      "value": "# And User click on register on myAccount menu"
    },
    {
      "line": 68,
      "value": "# And User fill register form with below information"
    },
    {
      "line": 69,
      "value": "#firstname|lastName|email|phone|password|"
    },
    {
      "line": 70,
      "value": "# |Shaiq|Darwish|austin.cintron@sakilacustomer.org|2021234455| Test123|"
    },
    {
      "line": 71,
      "value": "#And User click on \u0027no\u0027 radio button for Subscribe"
    },
    {
      "line": 72,
      "value": "# And User click on continue button"
    },
    {
      "line": 73,
      "value": "# Then User should see \u0027Your Account Has Been Created!\u0027"
    }
  ],
  "line": 74,
  "name": "User connects to DataBase",
  "keyword": "When "
});
formatter.step({
  "line": 75,
  "name": "User sends query \u0027select * from public.customer where email\u003d\u0027austin.cintron@sakilacustomer.org\u0027\u0027",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "User verify account is created with email \u0027austin.cintron@sakilacustomer.org\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "TekSchoolScenariosStepDefinitions.user_connects_to_DataBase()"
});
formatter.result({
  "duration": 51779399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "select * from public.customer where email\u003d\u0027austin.cintron@sakilacustomer.org\u0027",
      "offset": 18
    }
  ],
  "location": "TekSchoolScenariosStepDefinitions.user_sends_query(String)"
});
formatter.result({
  "duration": 34996300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "austin.cintron@sakilacustomer.org",
      "offset": 43
    }
  ],
  "location": "TekSchoolScenariosStepDefinitions.user_verify_account_is_created_with_email(String)"
});
formatter.result({
  "duration": 376299,
  "status": "passed"
});
formatter.after({
  "duration": 808091400,
  "status": "passed"
});
});