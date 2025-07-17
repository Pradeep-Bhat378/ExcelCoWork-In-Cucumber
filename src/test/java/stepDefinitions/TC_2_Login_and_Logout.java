package stepDefinitions;

import Utils.Coordinate;
import Utils.Scrollable;
import Utils.ToastMessages;
import base.BaseTest;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageObject.HomePage_EC;
import pageObject.LoginPage_EC;
import pageObject.MyprofilePage;

public class TC_2_Login_and_Logout extends BaseTest {

	public LoginPage_EC lp;
	public MyprofilePage p;
	public HomePage_EC hp;
	public MyprofilePage mpp;
	


	@And("User tap on logout button")
	public void click_tap_on_logout_button() throws InterruptedException {
		
		
		mpp = new MyprofilePage(driver);
		mpp.Logout();
		
		Thread.sleep(3000);
		driver.terminateApp(ExcelCowork);
	}
	
	@Then("Verify the toast message displayed")
	public void verify_the_toast_message_displayed() {
	  
		lp = new LoginPage_EC(driver);
		
		ToastMessages.VerifyToast(driver, 5, "Logout successful");
		
		    driver.terminateApp(ExcelCowork);  

	}
	
	
	
}
