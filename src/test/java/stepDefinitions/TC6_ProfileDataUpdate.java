package stepDefinitions;

import io.cucumber.java.en.Then;
import pageObject.MyprofilePage;

public class TC6_ProfileDataUpdate extends BaseTest {

	public MyprofilePage mp;

	@Then("User tap on profile")
	public void user_tap_on_profile() {
		mp = new MyprofilePage(driver);
		mp.TapOnProfile();
	}

	@Then("User tap on edit icon")
	public void user_tap_on_edit_icon() throws InterruptedException {
		mp.ClickOnEdit();
		Thread.sleep(1000);

	}

	@Then("Clear name field")
	public void clear_name_field() throws InterruptedException {

		mp.ClearOldName();
		Thread.sleep(500);

	}

	@Then("Clear company name field")
	public void clear_company_name_field() throws InterruptedException {
		mp.ClearCompanyOldName();
		Thread.sleep(500);
	}

	@Then("User EnterName {string}")
	public void user_enter_name(String string) {
		mp.EnterYourNewName(string);
	}

	@Then("User EnterCompanyname {string}")
	public void user_enter_companyname(String string) {
		mp.EnterCompanyName(string);
	}

	@Then("Click on save button")
	public void click_on_save_button() throws InterruptedException {

		mp.TapOnSaveButton();
		Thread.sleep(500);
	}
}
