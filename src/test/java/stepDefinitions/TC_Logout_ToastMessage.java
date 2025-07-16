package stepDefinitions;

import static stepDefinitions.BaseTest.driver;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utils.ToastMessages;
import io.appium.java_client.AppiumBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageObject.LoginPage_EC;
import pageObject.MyprofilePage;

public class TC_Logout_ToastMessage extends BaseTest {

	public MyprofilePage mp;
	public LoginPage_EC lp;
	
	@Given("Launch the app wait for few seconds")
	public void Launch_the_app_wait_for_few_seconds() throws InterruptedException {
		driver.activateApp(ExcelCowork);
		Thread.sleep(3000); 
	}
	
@Then("Verify the toast message displayed")
public void verify_the_toast_message_displayed() {
  
	lp = new LoginPage_EC(driver);
	
	ToastMessages.VerifyToast(driver, 5, "Logout successful");
	
	/*  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	    WebElement toastMessage = wait.until(ExpectedConditions.presenceOfElementLocated(
	        AppiumBy.accessibilityId("Logout successful")));

	    String actualMessage = toastMessage.getAttribute("content-desc");  // Or use getText() if needed

	    System.out.println("Toast Message: " + actualMessage);
	    Assert.assertEquals(actualMessage.trim(), "Logout successful"); */

	  

	    driver.terminateApp(ExcelCowork);  

}
}
