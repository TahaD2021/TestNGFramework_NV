Feature: Login

  #this is name of scenario
  @RegressionTest @smokeTest
  Scenario: Login test to TekSchool Test Environment page
    Given User is on TekSchool page
    When User Click on Test Environment link
    Then User should see Test Environment page
