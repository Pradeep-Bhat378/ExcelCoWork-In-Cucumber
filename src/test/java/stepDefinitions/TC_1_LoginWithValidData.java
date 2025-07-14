package stepDefinitions;

import static stepDefinitions.BaseTest.driver;
import io.cucumber.java.en.*;
import pageObject.LoginPage_EC;



public class TC_1_LoginWithValidData {

    public String Excel = "com.excel.coworks";
    public LoginPage_EC lp;

    @Given("the app is launched")
    public void app_is_launched() throws InterruptedException {
        driver.activateApp(Excel);
        Thread.sleep(3000);
    }

    @When("the user enters username and password")
    public void enter_credentials() {
        lp = new LoginPage_EC(driver);
        lp.Email("4prap4@gmail.com");
        lp.Password("@Ex");
    }

    @And("clicks the login button")
    public void click_login() {
        lp.LoginButton();
    }

    @Then("the user should be logged in")
    public void verify_login() throws InterruptedException {
        lp.ExcelLogo();
        Thread.sleep(1000);
        driver.terminateApp(Excel);
    }
}
