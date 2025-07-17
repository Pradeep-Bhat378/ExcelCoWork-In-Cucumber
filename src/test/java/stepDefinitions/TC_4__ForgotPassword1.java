package stepDefinitions;

import org.testng.Assert;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.ForgotPasswordPage_EC;
import pageObject.LoginPage_EC;

public class TC_4__ForgotPassword1 extends BaseTest {
 
	public LoginPage_EC lp;
    public ForgotPasswordPage_EC  fp;
 
	
	@And("User tap on forgot password link")
	public void user_tap_on_forgot_password_link() {
	   lp = new LoginPage_EC(driver);
	   
		driver.activateApp(ExcelCowork);
		lp.ForgotPassword();
		
	}

	@Then("Tap on Verify button without entering data")
	public void tap_on_verify_button_without_entering_data() {
          fp = new ForgotPasswordPage_EC(driver);
          fp.ClickVerifyBUtton();
          
	}

	@And("Validate error message")
	public void validate_error_message() {
	  fp.getEmailAddressErrorMessage();
	  
	
	  Assert.assertTrue(fp.getEmailAddressErrorMessage().isDisplayed(), "Error message is not displayed");

	 String actualError = fp.getEmailAddressErrorMessage().getText();
	    System.out.println(actualError + " -----------------------------");
	    // Then, check the actual text of the error
	//    String actualMessage = fp.getEmailAddressErrorMessage().getText();
	//    String expectedMessage = "Please enter an email address";

	//    Assert.assertEquals(actualMessage, expectedMessage, "Error message text does not match");
	
	}

}
