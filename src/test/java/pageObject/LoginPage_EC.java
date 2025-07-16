package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage_EC extends BasePage_EC{

	
	public LoginPage_EC(AppiumDriver driver) {
		super(driver);
		  PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);

	}
	
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
	WebElement emailField;
	
	public void Email(String email) {
		emailField.click();
		emailField.clear();
		emailField.sendKeys(email);
		return;
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
	WebElement password;
	
	public void Password(String pass) {
		password.click();
		password.clear();
		password.sendKeys(pass);
		return;
	}
	
	@AndroidFindBy(accessibility ="Login")
	WebElement Login;
	
	public void LoginButton() {
		Login.click();
	}
	
	
	
    @AndroidFindBy(accessibility = "Please enter an email address")
    WebElement EmailValidateMessage;
    
    public void EmailValidation() {
    	
    	System.out.println(EmailValidateMessage.isDisplayed());
    }
    
    @AndroidFindBy(accessibility = "Please enter a password")
    WebElement PassValidateMessage;
    
    public void PasswordValidation() {
    	
    	System.out.println(PassValidateMessage.isDisplayed());
    }
    
    @AndroidFindBy(uiAutomator = "new UiSelector().description(\"Forgot Password?\")")
    WebElement ForgotPassword;
    
    public void ForgotPassword() {
    	
    	ForgotPassword.click();
    }
    
    @AndroidFindBy(accessibility = "Please enter an email address")
    WebElement EmailValidation;
    
    public void E_Validation() {
    	
    	if(EmailValidation.isDisplayed()) {
    		System.out.println("Enter a valid password");
    	} else {
    		System.out.println("Validate message is not matching");
    	}
    	
    //	Assert.assertEquals(EmailValidation.isDisplayed(), true, "Email validation error is not displayed");
    }
    @AndroidFindBy(accessibility = "Please enter a password")
    WebElement PassValidation;
    
    public void P_Validation() {
    	
    	
    	if(PassValidation.isDisplayed()) {
    		System.out.println("Enter a valid password");
    	} else {
    		System.out.println("Validate message is not matching");
    	}
    	
    //	Assert.assertEquals(PassValidation.isDisplayed(),true, "Pass validation error is not displayed");

    	
    	
    }
    
}
