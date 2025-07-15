package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features = "src/test/resources/features/",
//	features = "src/test/resources/features/ForgotPassword.feature",

    glue = {"stepDefinitions"},
    dryRun = false, // Only check if all steps have definitions
    plugin = {"pretty", "html:target/cucumber-reports.html"},
  // tags = "@FP",                        // <<<<<< TAG FILTER HERE
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
