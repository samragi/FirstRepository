package com.StepDefination;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumberRunner.BaseClass;

public class Hooks extends BaseClass {
	
	@Before
	public void start() {
		System.setProperty("webdriver.chrome.driver", "/Users/samragi/Desktop/Automation/chromedriver");
	    driver=new ChromeDriver();
		driver.get("https://www.tkmaxx.com/uk/en/");	
	}
	
	
	@After
	public void close() {
		driver.close();
	}
	

}
