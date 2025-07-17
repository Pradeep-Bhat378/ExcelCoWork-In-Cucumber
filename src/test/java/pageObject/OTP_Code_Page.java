package pageObject;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class OTP_Code_Page extends BasePage_EC{

	public OTP_Code_Page(AppiumDriver driver) {
		super(driver);
		PageFactory.initElements(new AppiumFieldDecorator(driver,Duration.ofSeconds(30)), this);

	}
	
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\")")
	WebElement OTPCODE;
	
	public void OtpField(String otp) throws InterruptedException {
		OTPCODE.click();
		Thread.sleep(1000);
		OTPCODE.sendKeys(otp);
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Verify\")")
	WebElement verify;
	
	public void VerifyButton() throws InterruptedException {
		Thread.sleep(1000);
		verify.click();
	}

}
