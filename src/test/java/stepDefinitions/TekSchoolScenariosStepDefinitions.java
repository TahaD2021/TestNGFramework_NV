package stepDefinitions;

import java.util.List;

import org.testng.Assert;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.TekSchoolScenariosPageObject;
import utilities.DBUtilities;
import utilities.Utility;

public class TekSchoolScenariosStepDefinitions extends Base {
	
	/**
	 * This is repo pulling code test  123455667
	 */

	TekSchoolScenariosPageObject tekSchoolScenariosPageObject = new TekSchoolScenariosPageObject();

	@When("^User click on myAccount menu on top of the page$")
	public void user_click_on_myAccount_menu_on_top_of_the_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);
		tekSchoolScenariosPageObject.clickOnMyAccount();

	}

	// replace 'username' and 'password' with (.+)
	@And("^User enter username '(.+)' and password '(.+)' in returning menu$")
	public void user_enter_username_username_and_password_password_in_returning_menu(String userName, String passWord)
			throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.enterEmailAddress(userName);
		tekSchoolScenariosPageObject.enterPassword(passWord);
	}

	@And("^User click on login button$")
	public void user_click_on_login_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);
		tekSchoolScenariosPageObject.clickOnLoginButton();

	}

	@Then("^User should be logined in$")
	public void user_should_be_logined_in() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(true, tekSchoolScenariosPageObject.verifyLoginToMyAccount());
		Utility.screenshot(driver);

	}

	@And("^User click on login on myAccount menu$")
	public void user_click_on_login_on_myAccount_menu() {
		tekSchoolScenariosPageObject.clickOnLogin();
	}

	@And("^User click on register on myAccount menu$")
	public void user_click_on_register_on_myAccount_menu() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		tekSchoolScenariosPageObject.clickonRegister();

	}

	@And("^User fill register form with below information$")
	public void user_fill_register_form_with_below_information(DataTable personalInfo) throws Throwable {
		List<List<String>> dataValues = personalInfo.raw();

		tekSchoolScenariosPageObject.fillFirstName(dataValues.get(0).get(0));
		tekSchoolScenariosPageObject.fillLastName(dataValues.get(0).get(1));
		tekSchoolScenariosPageObject.fillEmail(dataValues.get(0).get(2));
		tekSchoolScenariosPageObject.fillPhone(dataValues.get(0).get(3));
		tekSchoolScenariosPageObject.enterPassword(dataValues.get(0).get(4));
		tekSchoolScenariosPageObject.fillPasswordConfirmation(dataValues.get(0).get(4));

	}

	@And("^User click on '(.+)' radio button for Subscribe$")
	public void user_click_on_yes_radio_button_for_Subscribe(String radioButtonValue) throws Throwable {
		tekSchoolScenariosPageObject.subscribeRadioButton(radioButtonValue);
		Utility.screenshot(driver);

	}

	@And("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		tekSchoolScenariosPageObject.clickOnContinue();

	}

	@Then("^User should see 'Your Account Has Been Created!'$")
	public void user_should_see_Your_Account_Has_Been_Created() throws Throwable {
		// Assert.assertEquals(tekSchoolScenariosPageObject.confirmationMessage(),
		// true);
		Utility.screenshot(driver);

	}

	@When("^User connects to DataBase$")
	public void user_connects_to_DataBase() throws Throwable {
		DBUtilities.setupConnection();

	}

	@When("^User sends query '(.+)'$")
	public void user_sends_query(String query) throws Throwable {
		DBUtilities.runQuery(query);
		System.out.println(query);
		System.out.println(DBUtilities.runQuery(query));

	}

	@Then("^User verify account is created with email '(.+)'$")
	public void user_verify_account_is_created_with_email(String emailValidation) throws Throwable {
		
		Assert.assertEquals(DBUtilities.data(), emailValidation);
	}

}













