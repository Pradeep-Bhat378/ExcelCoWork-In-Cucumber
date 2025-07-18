package stepDefinitions;

import org.testng.Assert;

import Utils.Coordinate;
import Utils.Scrollable;
import base.BaseTest;
import io.cucumber.java.en.*;
import pageObject.HomePage_EC;
import pageObject.LoginPage_EC;
import pageObject.MyprofilePage;

public class TC_1_LoginScenario_TC extends BaseTest {

	public String Excel = "com.excel.coworks";
	public LoginPage_EC lp;
	public MyprofilePage p;
	public HomePage_EC hp;
	public MyprofilePage mpp;

	@And("User tap on profile icon and scroll till end")
	public void User_tap_on_profile_icon_and_scroll_till_end() throws InterruptedException {
		Coordinate.tapOnCoordinate(989, 133, driver);
		// Thread.sleep(1000);

		Scrollable.swipeUp(1, driver, 1000);

		System.out.println("scrolled till logout");

	}

	@Then("Validate error message displayed below email text field")
	public void validate_error_message_displayed_below_email_text_field() {

		lp = new LoginPage_EC(driver);

		lp.E_Validation();
		lp.P_Validation();

		System.out.println("Please enter an email address --- Validate message under email field");
		System.out.println("Please enter a password --- Validate message under pwd field");

	}

	@When("User enters invalid credentials")
	public void user_enters_valid_credentials() throws InterruptedException {
		lp = new LoginPage_EC(driver);
		lp.Email("abc@gmail.com");
		Thread.sleep(2500);
		lp.Password("12345");
		Thread.sleep(2500);

		lp.LoginButton();

	}

	@Then("Login should fail and user should be on login page")
	public void login_should_fail_and_user_should_be_on_login_page() {
            
	}

	@Then("Validate HomePage is displayed")
	public void validate_home_page_is_displayed() {
		hp = new HomePage_EC(driver);

		Assert.assertTrue(hp.profileIconDisplayed(), "Profile icon should be displayed");
	}

}
