package stepDefinitions;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.ForgotPasswordPage_EC;

public class TC_5__ForgetScenario2 extends BaseTest {
	public ForgotPasswordPage_EC fp;
	
	
	@And("User enter previous emailId")
	public void User_enter_previous_emailId() {
		fp = new ForgotPasswordPage_EC(driver);
		fp.EnterEmailaddress("4pradeep4@gmail.com");
		
	}
	
	
	@Then("Tap on Verify button")
	public void tap_on_verify_button() {
		fp.ClickVerifyBUtton();
	}
	
	@And("Tap on Done button in OTP CODE page")
	public void tap_on_done_button_in_OTP_CODE_page() throws InterruptedException {
		Thread.sleep(1000);
	    fp.ClickOnDone();
	}

}
