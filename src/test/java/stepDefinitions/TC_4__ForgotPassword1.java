package stepDefinitions;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utils.Notification;
import base.BaseTest;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.ForgotPasswordPage_EC;
import pageObject.LoginPage_EC;
import pageObject.OTP_Code_Page;

public class TC_4__ForgotPassword1 extends BaseTest {
 
	public LoginPage_EC lp;
    public ForgotPasswordPage_EC  fp;
    public OTP_Code_Page ot;
 
	
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
	
	@Then("verify the notification")
	public void verify_the_notification() throws InterruptedException {
	   
		

	     //Notification.verify_the_notification(driver);
	  Notification.verify_the_notification(driver);
	}
	
	@Then("Put the Generated OTP in the textfield.")
	public void put_the_generated_otp_in_the_textfield() throws InterruptedException {
		
	   ot = new OTP_Code_Page(driver);
		Thread.sleep(1000);
		String otp = Notification.verify_the_notification(driver);
		
		 driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		ot.OtpField(otp);
		Thread.sleep(1000);
		ot.VerifyButton();
		
		
		
	}

}
