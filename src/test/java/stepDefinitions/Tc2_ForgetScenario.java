package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.ForgotPasswordPage_EC;

public class Tc2_ForgetScenario extends BaseTest {
	public ForgotPasswordPage_EC fp;
	
	
	@And("User enter email")
	public void user_enter_email() {
		fp = new ForgotPasswordPage_EC(driver);
		fp.EnterEmailaddress("4pradeep4@gmail.com");
		
	}
	
	
	@Then("Tap on Verify button")
	public void tap_on_verify_button() {
		fp.ClickVerifyBUtton();
	}
	
	@And("Tap on Done button in new page")
	public void tap_on_done_button_in_new_page() throws InterruptedException {
		Thread.sleep(1000);
	    fp.ClickOnDone();
	}

}
