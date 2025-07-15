package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class MyprofilePage extends BasePage_EC {

	public MyprofilePage(AppiumDriver driver) {
		super(driver);
	  PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

		
	}



	/*public MyprofilePage(AndroidDriver driver) {
		super(driver);
	   PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}*/
	
	
	
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Log Out\")")	
	WebElement logout;
	
	
	
	public void Logout() {
		logout.click();
	}

}
