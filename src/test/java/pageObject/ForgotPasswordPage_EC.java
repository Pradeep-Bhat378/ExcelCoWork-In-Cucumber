package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ForgotPasswordPage_EC extends BasePage_EC {

	public ForgotPasswordPage_EC(AppiumDriver driver) {
		super(driver);
		  PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}

	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
	WebElement EnterYourEmailAddress ;
	
	public void EnterEmailaddress(String email) {
		EnterYourEmailAddress.click();
		EnterYourEmailAddress.clear();
		EnterYourEmailAddress.sendKeys(email);
	}
	
	@AndroidFindBy(accessibility = "Verify")
	WebElement Verify;
	
	public void ClickVerifyBUtton() {
		Verify.click();
	}
	
	@AndroidFindBy(accessibility="Please enter an email address")
	WebElement PleaseEnterEmailAddress ;

       public WebElement getEmailAddressErrorMessage() {
    	   return PleaseEnterEmailAddress;
    	   
       }
       
       @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Done\")")
        WebElement  Done;
    	   
       public void ClickOnDone() {
    	   Done.click();
       }
       
       }

