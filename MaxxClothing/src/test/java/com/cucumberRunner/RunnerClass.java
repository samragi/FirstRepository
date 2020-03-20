package com.cucumberRunner;

	import org.junit.runner.RunWith;
	import cucumber.api.CucumberOptions;
	import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "./src/test/resources/features",
			glue = { "com.StepDefination" }
			//tags= {"@smoke"},
		   // plugin = { "html:target/cucumber-html-report", "json:target/cucumber.json" }
			)
	
	public class RunnerClass {
	
}
