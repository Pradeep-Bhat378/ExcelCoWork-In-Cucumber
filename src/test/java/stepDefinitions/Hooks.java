package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseTest {

    @Before
    public void setUp() {
        startAppium(); // Starts Appium before each scenario
    }

   
    @After
    public void tearDown() {
        quitDriver(); // Quits driver after each scenario
    }
}
