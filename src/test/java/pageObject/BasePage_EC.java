package pageObject;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage_EC {

//	public AndroidDriver driver;
	
//	public BasePage_EC(AndroidDriver driver) {
		
	//	this.driver = driver;
     //   PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);


	public static AppiumDriver driver;
	
	public BasePage_EC(AppiumDriver driver) {
		this.driver = driver;
		
	

	}
}
