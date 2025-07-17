package stepDefinitions.common;

import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.LoginPage_EC;

public class CommonSteps extends BaseTest {
    
	public LoginPage_EC lp;
	
	
	@Given("User is on login page")
	public void user_is_on_login_page()  throws InterruptedException {
    	    if (lp == null) lp = new LoginPage_EC(driver);
    		driver.activateApp(ExcelCowork);
    		Thread.sleep(3000);   	       
    }
    	
    	//or use valid credentials
    	
    	@When("User enters valid {string} and {string} credentials")
    	public void user_enters_valid_and_credentials(String string, String string2) throws InterruptedException {
    	    if (lp == null) lp = new LoginPage_EC(driver);
    	   lp.Email(string);
    	   lp.Password(string2);
    	   
    	}

    	
    	@When("User enters valid emailId {string}")
    	public void user_enters_valid_emailId(String string) {
    	    if (lp == null) lp = new LoginPage_EC(driver);
    	    lp.Email(string);
    	}
    	@When("User enters valid password {string}")
    	public void user_enters_valid_password(String string) {
    	    if (lp == null) lp = new LoginPage_EC(driver);
    	   lp.Password(string);
    	   driver.hideKeyboard();
    	}
    	
    	@And("User tap on the login button")
    	public void User_tap_on_the_login_button() throws InterruptedException {
    		Thread.sleep(1000);
    		lp.LoginButton();
    		Thread.sleep(2000);

    		
    	//	driver.terminateApp(ExcelCowork);   if you terminate the issue occurs after login  button clciking

    	}
    	
    	@When("User enters valid credentials")
    	public void user_enters_valid_credentials() throws InterruptedException {
    		lp = new LoginPage_EC(driver);
    		lp.Email("4pradeep4@gmail.com");
    		
    		Thread.sleep(5000);
    		lp.Password("@Excel12345");
    		Thread.sleep(5000);

    	}
}
