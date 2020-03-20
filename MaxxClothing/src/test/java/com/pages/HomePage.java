package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;



import com.cucumberRunner.BaseClass;

public class HomePage extends BaseClass {
	
	public static By SEARCHTEXTBOX=By.cssSelector("#js-site-search-input");
    public static By SEARCHBUTTON=By.cssSelector(".hidden-xs.hidden-sm.header-submit-search-button");
	
	public void VerifyHomePage() {

		Assert.assertEquals("https://www.tkmaxx.com/uk/en/",driver.getCurrentUrl());
	} 
	
	public void VerifySearchButton() {
		driver.findElement(By.cssSelector("form[name='search_form_TjxSearchBox']")).click();
	
	}
	
	public void VerifyValidProductName() {
	    action.updateTextBox(SEARCHTEXTBOX, "tops");
		driver.findElement(SEARCHBUTTON).click();
	
	}
    public void VerifyInvalidProductName() {
    	action.updateTextBox(SEARCHTEXTBOX, "cdzmyhjnf");
		driver.findElement(SEARCHBUTTON).click();
	}
    }
