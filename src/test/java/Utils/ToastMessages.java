package Utils;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class ToastMessages {

	public static void VerifyToast (AndroidDriver driver, int duration,String ExpectedToastMessage ) {
	
	  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(duration));
	    WebElement toastMessage = wait.until(ExpectedConditions.presenceOfElementLocated(
	        AppiumBy.accessibilityId(ExpectedToastMessage))); // as per locator change it

	    String actualMessage = toastMessage.getAttribute("content-desc");  // Or use getText() if needed

	    System.out.println("Toast Message: " + actualMessage);
	    Assert.assertEquals(actualMessage.trim(), ExpectedToastMessage);
	    
	   

}
}