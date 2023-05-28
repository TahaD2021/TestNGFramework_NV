package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestStepdefinitions {
	@Given("^user is on the testfile page$")
	public void user_is_on_the_testfile_page() {

		System.out.println("testing being printed");
	}

	@When("^user enters username in the username field$")
	public void user_enters_username_in_the_username_field() {

		System.out.println("testfile is being printed");

	}
	@And("^user enters password in the password field$")
	public void user_enters_password_in_the_password_field() {
		
		System.out.println("test file is sbout get printed");
	}

}
