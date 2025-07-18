package testRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/resources/features/1_LoginScenario.feature",
    glue = {"stepDefinitions", "stepDefinitions.common"},  
  //  dryRun = true,   //for generating snippets
   dryRun = false, // for running tests
  //  tags = "@Regression",
  // tags = "@Personal",
    monochrome = true,
    plugin = {
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
    }
)
public class TestRunner2 extends AbstractTestNGCucumberTests {

    static {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        String reportPath = "test-output/ExtentReport/Report_" + timestamp + ".html";
        System.setProperty("report.path", reportPath);
    }
}
