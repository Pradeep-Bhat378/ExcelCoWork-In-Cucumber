package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/features/LaunchApp.feature",
//		features = "src/test/resources/features/ForgotPassword.feature",

	    glue = {"stepDefinitions"},
	    dryRun = true, // Only check if all steps have definitions
	  //  tags = "Test",   
	    plugin = { "pretty", "json:target/cucumber-report.json", 
	    		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
  // tags = "@FP",                        // <<<<<< TAG FILTER HERE
	    monochrome = true
	)
	public class ExtentReport extends AbstractTestNGCucumberTests {
	}
