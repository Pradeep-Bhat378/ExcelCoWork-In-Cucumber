package stepDefinitions;


import static stepDefinitions.BaseTest.driver;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

import Utils.Coordinate;
import Utils.Scrollable;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.*;
import pageObject.HomePage_EC;
import pageObject.LoginPage_EC;
import pageObject.MyprofilePage;

public class TC_1_LoginWithValidCredentails {

	public String Excel = "com.excel.coworks";
	public LoginPage_EC lp;
	public MyprofilePage p;
	public HomePage_EC hp;
	public MyprofilePage mpp;

	@Given("Launch the app")
	public void Launch_the_app() throws InterruptedException {
		driver.activateApp(Excel);
		Thread.sleep(3000);
	}

	@When("User enters valid username and password")
	public void enter_credentials() {
		lp = new LoginPage_EC(driver);
		lp.Email("4pradeep4@gmail.com");
		lp.Password("@Excel12345");
	}

	@And("User tap on the login button")
	public void User_tap_on_the_login_button() {
		lp = new LoginPage_EC(driver);

		lp.LoginButton();
	}

	@Then("the user should be logged in")
	public void verify_login() throws InterruptedException {
		hp = new HomePage_EC(driver);

			hp.HomeLogoDispalyed();
			Thread.sleep(1000);
	}


	@And("User tap on profile icon")
	public void User_tap_on_profile_icon() throws InterruptedException {
		  Coordinate.tapOnCoordinate(989, 133, driver);
	      Thread.sleep(1000);
	      
	      Scrollable.swipeUp(1, driver, 1000);
	      
	      System.out.println("scrolled till logout");
	      
	}

	@And("User tap on logout button")
	public void click_tap_on_logout_button() throws InterruptedException {
		
		
		mpp = new MyprofilePage(driver);
		mpp.Logout();
		
		Thread.sleep(1000);
		driver.terminateApp(Excel); 
	}

}

