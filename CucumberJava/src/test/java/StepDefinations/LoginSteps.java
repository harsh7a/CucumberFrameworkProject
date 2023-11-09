package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	   System.out.println("inside step - user is on login page");
	}

	@When("user enters username and passoword")
	public void user_enters_username_and_passoword() {
		System.out.println("inside step - user enters username and password");
	}

	@And("clicks to login button")
	public void clicks_to_login_button() {
		System.out.println("inside step - clicks on login button");
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
		System.out.println("inside step - user is navigated to home page");
	}
	
	
}
