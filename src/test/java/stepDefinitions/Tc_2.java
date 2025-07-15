package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.ForgotPasswordPage_EC;
import pageObject.LoginPage_EC;

public class Tc_2 extends BaseTest {
 
	public LoginPage_EC lp;

@Then("Validate error message displayed below email text field")
public void validate_error_message_displayed_below_email_text_field() {
   
	lp = new LoginPage_EC(driver);
	
	lp.E_Validation();
	
	System.out.println("Please enter an email address --- Validate message under email field");
}

@And("Validate error message displayed below password text field")
public void validate_error_message_displayed_below_password_text_field() {
   lp.PasswordValidation();
	System.out.println("Please enter a password --- Validate message under pwd field");

}
}
