package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

	@Given("user navigates to Facebook")
	public void user_navigates_to_Facebook() {
		System.out.println("TEST");
	}

	@When("I enter Username as {string} and Password as {string}")
	public void i_enter_Username_as_username1_and_Password_as_password1(String username, String password) {
		System.out.println(username + password);
	}

	@Then("login should be unsuccessful")
	public void login_should_be_unsuccessful() {
		System.out.println("Success");
	}
}
