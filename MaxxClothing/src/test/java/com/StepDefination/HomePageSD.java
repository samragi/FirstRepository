package com.StepDefination;




import com.cucumberRunner.BaseClass;

import cucumber.api.java.en.Given;

import cucumber.api.java.en.When;

public class HomePageSD extends BaseClass{

	
	
	@Given("^I am in homepage$")
	public void i_am_in_homepage() throws Throwable {
       homePage.VerifyHomePage();
	} 

	@When("^I click on search button$")
	public void i_click_on_search_button() throws Throwable {
	   homePage.VerifySearchButton();
	}

	@When("^I enter valid product name$")
	public void i_enter_valid_product_name() throws Throwable {
	  homePage.VerifyValidProductName();
	}

	@When("^I enter invalid product name$")
	public void i_enter_invalid_product_name() throws Throwable {
	   homePage.VerifyInvalidProductName();  
	}

	
}
