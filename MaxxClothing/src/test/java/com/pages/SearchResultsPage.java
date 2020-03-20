package com.pages;

import org.junit.Assert;

import com.cucumberRunner.BaseClass;

public class SearchResultsPage extends BaseClass {
	
	public void VerifyValidProductPage() {
		 Assert.assertEquals("Search tops - TK Maxx", driver.getTitle());
		
	}
	
	public void VerifyInvalidProductPage() {
		Assert.assertEquals("Search cdzmyhjnf - TK Maxx", driver.getTitle());
	}
	

}
