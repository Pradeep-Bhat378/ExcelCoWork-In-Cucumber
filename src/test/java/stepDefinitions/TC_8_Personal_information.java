package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.en.*;
import pageObject.LoginPage_EC;
import pageObject.PersonalInformation;

public class TC_8_Personal_information extends BaseTest {
	public LoginPage_EC lp;
	public PersonalInformation pi;

	@When("User tap on CreateAccount Link")
	public void user_tap_on_create_account_link() {
		lp = new LoginPage_EC(driver);
		driver.activateApp(ExcelCowork);
		lp.createAccount();

	}

	@Then("Enter full name {string}")
	public void enter_full_name(String string) {
		pi = new PersonalInformation(driver);
		pi.EnterFullName(string);

	}

	@Then("Enter Company name {string}")
	public void enter_company_name(String string) {
		pi.EnterCompanyName(string);
	}

	@Then("Enter email address {string}")
	public void enter_email_address(String string) {
		pi.EnterEmailAddress(string);
	}

	@Then("Mobile number {string}")
	public void mobile_number(String string) {
		pi.EnterMobileno(string);

	}

	@Then("Tap on Next button")
	public void tap_on_next_button() {
		pi.TapOnNext();
	}
}
