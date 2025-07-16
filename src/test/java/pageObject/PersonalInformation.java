package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class PersonalInformation extends BasePage_EC {

	public PersonalInformation(AppiumDriver driver) {
		super(driver);
		
		  PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);	
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(0)")
		WebElement Enterfullname;
	
	
	public void EnterFullName(String fname) {
		Enterfullname.sendKeys(fname);
	}

	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
	WebElement EnterCompanyName;
	
	
	public void EnterCompanyName(String Cname) {
		EnterCompanyName.sendKeys(Cname);
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(2)")
     WebElement EnterEmailAddress;
	
	public void EnterEmailAddress(String email) {
		EnterEmailAddress.sendKeys(email);
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(3)")
     WebElement EnterMobileNo;
	
	public void EnterMobileno(Integer numbers) {
		EnterMobileNo.sendKeys(String.valueOf(numbers));
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Next\")")
	WebElement Next;
	
	public void TapOnNext() {
		Next.click();
	}
}
