package pageObject;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MyprofilePage extends BasePage_EC {

	public MyprofilePage(AndroidDriver driver) {
		super(driver);
	}
	
	
	@AndroidFindBy(accessibility = "Log Out")
	WebElement logout;
	
	
	
	public void Logout() {
		logout.click();
	}

}
