package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Then;
import pageObject.LoginPage_EC;

   
   
public class Tc1_TryToLoginWithNullData {
	public AndroidDriver driver;
	public LoginPage_EC lp;

	@Then("Validate error message need to be displayed below uername and pwd fields")
	public void validate_error_message_need_to_be_displayed_below_uername_and_pwd_fields() throws InterruptedException {
	    lp = new LoginPage_EC(driver);
	    
	    Thread.sleep(5000);
	    lp.EmailValidation();
	    lp.PasswordValidation();
		
	}
}
