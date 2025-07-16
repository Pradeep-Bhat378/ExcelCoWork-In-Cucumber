package testRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src/test/resources/features/",
    glue = {"stepDefinitions"},
    dryRun = false, // for running tc
  //  dryRun = true, // for generating snippets

   // tags = "@P1 or @P2",   
    tags = "@P0",
    		
    		 
    plugin = {"summary", "html:CucumberReport/cucumber1.html",
		      "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},   
    monochrome = true
)
public class TestRunner2 extends AbstractTestNGCucumberTests {

	 static {
	        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
	        String reportPath = "test-output/ExtentReport/Report_" + timestamp + ".html";
	        System.setProperty("report.path", reportPath);
	    }	
}