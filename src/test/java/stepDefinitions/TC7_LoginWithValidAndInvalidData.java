package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage_EC;

public class TC7_LoginWithValidAndInvalidData extends BaseTest {

	public LoginPage_EC lp;
	
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {
	   lp = new LoginPage_EC(driver);
	   driver.activateApp(ExcelCowork);
	   Thread.sleep(1000);
	   
	}
	@When("User enters emailId {string}")
	public void user_enters_emailId(String string) {
	    lp.Email(string);
	}
	@When("User enters password {string}")
	public void user_enters_password(String string) {
	   lp.Password(string);
	   driver.hideKeyboard();
	}
	@Then("Login should be {string}")
	public void login_should_be(String string) throws InterruptedException {
	    lp.LoginButton();
	    Thread.sleep(2500);
	}
}
