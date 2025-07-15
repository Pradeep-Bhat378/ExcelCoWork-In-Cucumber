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

public class TC_1_LoginWithValidData {

	public String Excel = "com.excel.coworks";
	public LoginPage_EC lp;
	public MyprofilePage p;
	public HomePage_EC hp;
	public MyprofilePage mpp;

	@Given("the app is launched")
	public void app_is_launched() throws InterruptedException {
		driver.activateApp(Excel);
		Thread.sleep(3000);
	}

	@When("the user enters username and password")
	public void enter_credentials() {
		lp = new LoginPage_EC(driver);
		lp.Email("4pradeep4@gmail.com");
		lp.Password("@Excel12345");
	}

	@And("clicks the login button")
	public void click_login() {
		lp.LoginButton();
	}

	@Then("the user should be logged in")
	public void verify_login() throws InterruptedException {
		hp = new HomePage_EC(driver);

			hp.HomeLogoDispalyed();
			Thread.sleep(1000);
	}


	@Then("Click on profile icon")
	public void click_on_profile_icon() throws InterruptedException {
		  Coordinate.tapOnCoordinate(989, 133, driver);
	      Thread.sleep(1000);
	      
	      Scrollable.swipeUp(1, driver, 1000);
	      
	      System.out.println("scrolled till logout");
	      
	}

	@Then("Click on logout button")
	public void click_on_logout_button() throws InterruptedException {
		
	//	mpp = new MyprofilePage(driver);
	//	mpp.Logout();
		
		Thread.sleep(1000);
	//	driver.terminateApp(Excel); 
	}
}
