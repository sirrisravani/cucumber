package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Stepdefinition {
	@Given("Enter userid")
	public void enter_userid() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("userid enetered");
	    
	}

	@And("Enter password")
	public void enter_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("password entered");
	    
	}

	@Then("click login button")
	public void click_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("login button clicked");
	    	}

}
