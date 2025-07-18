package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
		
	    features = "src/test/resources/features/",
	    glue = {"stepDefinitions", "stepDefinitions.common"},  
	    plugin = {"pretty"},
	    tags = "not @Ignore",
	    monochrome = true
	)
public class SerialExecution_Igonre extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider(parallel = false) // ⛔ SERIAL execution
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
