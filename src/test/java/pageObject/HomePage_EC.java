package pageObject;

import java.time.Duration;  

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage_EC extends BasePage_EC{

	
	
	public HomePage_EC(AppiumDriver driver) {
		super(driver);
		  PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
	WebElement Homelogo;
	
	public void HomeLogoDispalyed() {
		boolean isLogovisible = Homelogo.isDisplayed();
		System.out.println(isLogovisible+"- - App logged in and HomepageIcon etc displayed ");
		
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(5)")
    WebElement ProfileIcon;
    
    
    public void ProfileIcon() {
    	ProfileIcon.click();
    }
    
    public boolean profileIconDisplayed() {
    return	ProfileIcon.isDisplayed();
    }
    
    
    @AndroidFindBy(uiAutomator = "new UiSelector().className('android.view.View').instance(16)" )
    WebElement Addicon;
    
    public void TapOnAddIcon() {
    	Addicon.click();
    }

}
