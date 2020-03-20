package com.StepDefination;


import org.openqa.selenium.WebDriver;

import com.cucumberRunner.BaseClass;

import cucumber.api.java.en.Then;

public class SearchResultSD extends BaseClass{
	
	 WebDriver driver;

	@Then("^I should see the valid search results page$")
	public void i_should_see_the_valid_search_results_page() throws Throwable {
		 searchResultsPage.VerifyValidProductPage();
	}

	@Then("^I should see the error message page ‘Oh No!Nothing Matches’$")
	public void i_should_see_the_error_message_page_Oh_No_Nothing_Matches() throws Throwable {
		searchResultsPage.VerifyInvalidProductPage();
	}
	
}
