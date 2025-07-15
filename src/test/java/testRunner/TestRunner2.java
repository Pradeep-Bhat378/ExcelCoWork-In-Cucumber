package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src/test/resources/features/",
    glue = {"stepDefinitions"},
    dryRun = false, // Only check if all steps have definitions
    tags = "@P2",                        // <<<<<< TAG FILTER HERE
    plugin = {"pretty", "html:target/cucumber-reports.html"},
    
  //  plugin = {"summary", "html:target/cucumber.html"},    
    monochrome = true
)
public class TestRunner2 extends AbstractTestNGCucumberTests {
}
