package pageObject;

import org.openqa.selenium.WebElement; 

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage_EC extends BasePage_EC{

	
	public LoginPage_EC(AndroidDriver driver) {
		
		super(driver);
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
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.ImageView\").instance(3)")
	WebElement Homelogo;
	
	public void ExcelLogo() {
		boolean isLogovisible = Homelogo.isDisplayed();
		System.out.println(isLogovisible);
		
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
}
