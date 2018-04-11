package com.dlg.stepdefinitions.acceptancetests;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class sampleClass {

	@Given("^I want to write a step with precondition (\\d+)$")
	public void i_want_to_write_a_step_with_precondition(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given 1" + "\t" + arg1);
	    
	}

	@Given("^some other precondition (\\d+)$")
	public void some_other_precondition(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Given 2" + "\t" + arg1);
	}

	@When("^I complete action (\\d+)$")
	public void i_complete_action(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When 1" + "\t" + arg1);
	}

	@When("^some other action (\\d+)$")
	public void some_other_action(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("When 2" + "\t" + arg1);
	}

	@Then("^I validate the outcomes (\\d+)$")
	public void i_validate_the_outcomes(int arg1)throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then 1" + "\t" + arg1);
	}

	@Then("^check more outcomes (\\d+)$")
	public void check_more_outcomes(int arg1)  throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Then 2" + "\t" + arg1);
	}

	
	
}
