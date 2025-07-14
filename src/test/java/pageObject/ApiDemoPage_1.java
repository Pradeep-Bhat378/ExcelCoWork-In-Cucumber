package pageObject;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ApiDemoPage_1 extends BasePage{

	public ApiDemoPage_1(AndroidDriver driver) {
		super(driver);
	}

	@AndroidFindBy(xpath = "//android.widget.TextView[@content-desc=\"Access'ibility\"]")
	public WebElement accessibility1;

	public void E1Accissibility() {
		accessibility1.click();
	}

	// Correct locator using accessibility id
	@AndroidFindBy(accessibility = "Animation")
	private WebElement animation;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Views']")

	WebElement View;
	
	public void view() {
		View.click();
	}

	public void clickAnimation() {
		animation.click();
	}
}
