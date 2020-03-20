package com.cucumberRunner;

import org.openqa.selenium.WebDriver;

import com.driver.Action;
import com.pages.HomePage;
import com.pages.SearchResultsPage;

public class BaseClass {

	public static WebDriver driver;
	public static HomePage homePage=new HomePage();
	public static SearchResultsPage searchResultsPage=new SearchResultsPage();
	public static Action action=new Action();
	
}
