package com.driver;

import org.openqa.selenium.By;

import com.cucumberRunner.BaseClass;

public class Action extends BaseClass{

	
	public void  updateTextBox(By element, String SearchTerm) {
		driver.findElement(element).clear();
		driver.findElement(element).sendKeys(SearchTerm);
	}
	
	
	
}
