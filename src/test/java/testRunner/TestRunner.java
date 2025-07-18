package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
//	features = "src/test/resources/features/",
	features = "src/test/resources/features/",

    glue = {"stepDefinitions"},
    dryRun = false, // Only check if all steps have definitions
 //   tags = "@P4",                       

    		 plugin = { "pretty", "json:CucumberReport/cucumber-report.html", 
	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
  //  plugin = {"pretty", "html:target/cucumber-reports.html"},
    monochrome = true
)
public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
    @DataProvider(parallel = false) // Required for RetryAnalyzer to work properly
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
