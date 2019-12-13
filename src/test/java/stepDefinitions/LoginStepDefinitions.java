package stepDefinitions;

import org.testng.Assert;

import core.Base;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LoginPageObject;

public class LoginStepDefinitions extends Base {
	
	
	LoginPageObject loginpage;
	/**
	 * This method will open Tek School page 
	 * and verify title
	 */

	@Given("^User is on TekSchool page$")
	public void user_is_on_TekSchool_page() {
		Base.initializeDriver();
		loginpage = new LoginPageObject();

		String expectedTitle = "TEK School – Knowledge is power";
		// verify title of the Tek School page
		// This is hard Assertion and if expected does not meet actual result it will
		// fail the execution
		Assert.assertEquals(loginpage.pageTitle(), expectedTitle);

	}
	
	/**
	 * This method will click on Test Environment link 
	 * @throws Throwable
	 */

	@When("^User Click on Test Environment link$")
	public void user_Click_on_Test_Environment_link() throws Throwable {
		loginpage = new LoginPageObject();
		loginpage.clickOnTestEnvironmentLink();

	}
	
	/**
	 * This method will verify Test Environment titile
	 * @throws Throwable
	 */

	@Then("^User should see Test Environment page$")
	public void user_should_see_Test_Environment_page() throws Throwable {
		Assert.assertEquals(driver.getTitle(), "TEK SCHOOL");
	}

}
