package com.cucumber.MavenCucumberPrototype;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepExecution {
	
	@Given("^Would like to see basic printing step$")
	public void Would_like_to_see_basic_printing_step() throws Throwable {
	    System.out.println("SAMPLE EXECUTION OF MAVEN-CUCUMBER PROTOTYPE");
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" as input$")
	public void User_enters_and_as_input(String First, String Last) throws Throwable {
		System.out.println("FIRST NAME:" + First + " " + "LAST NAME:" + Last);
	}

	@Then("^Expected result as \"([^\"]*)\"$")
	public void Expected_result_as(String fullname) throws Throwable {
		System.out.println("THE FULL NAME IS: " + fullname);
	}


}
