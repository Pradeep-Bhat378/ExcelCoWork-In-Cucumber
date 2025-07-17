package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage_EC;
import pageObject.LoginPage_EC;
import pageObject.MyprofilePage;

public class TC1_LoginDataDriven extends BaseTest {

	public String Excel = "com.excel.coworks";
	public LoginPage_EC lp;
	public MyprofilePage p;
	public HomePage_EC hp;
	public MyprofilePage mpp;


	@When("User enters invalid emailId {string}")
	public void user_enters_email_id(String email) {
		lp = new  LoginPage_EC(driver);
		lp.Email(email);
	}

	@When("User enters invalid password {string}")
	public void user_enters_password(String password) {
		lp.Password(password);
	}

	@Then("Login should be {string}")
	public void login_should_be(String string) throws InterruptedException {
		lp.LoginButton();
		Thread.sleep(1000);
	}

}
