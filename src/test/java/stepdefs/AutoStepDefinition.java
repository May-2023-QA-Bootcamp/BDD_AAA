package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AutoStepDefinition {

	@Given("homepage title is {string}")
	public void homepage_title_is(String string) {
		System.out.println("homepage title is {string}");
	}

	@Given("sub-title is {string}")
	public void sub_title_is(String string) {
		System.out.println("sub-title is {string}");
	}

	@Given("footer is {string}")
	public void footer_is(String string) {
		System.out.println("footer is {string}");
	}

	@When("user click submit button")
	public void user_click_submit_button() {
		System.out.println("user click submit button");
	}

	@Then("verify zipcode error message is {string}")
	public void verify_zipcode_error_message_is(String string) {
		System.out.println("verify zipcode error message is {string}");
	}

	@When("user input zipcode {string}")
	public void user_input_zipcode(String string) {
		System.out.println("user input zipcode {string}");
	}

	@Then("verify zipcode length is {string}")
	public void verify_zipcode_length_is(String string) {
	    System.out.println("verify zipcode length is {string}");
	}

	@When("user clear zipcode field")
	public void user_clear_zipcode_field() {
	    System.out.println("user clear zipcode field");
	}

	@Then("verify homepage title is {string}")
	public void verify_homepage_title_is(String string) {
	    System.out.println("verify homepage title is {string}");
	}
}
