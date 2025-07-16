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
	
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").instance(6)")
	WebElement  ProfileIcon;
	
	public void TapOnProfile() {
		ProfileIcon.click();
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Edit\")")
	WebElement edit;
	
	public void ClickOnEdit() {
		edit.click();
	}
	
	@AndroidFindBy(uiAutomator ="new UiSelector().text(\"Pradeep bhat\")")	
	WebElement OName;
	
	public String getOldName() {
		return OName.getText();
	}
	
	
	public void ClearOldName() throws InterruptedException {
		OName.click();
		Thread.sleep(1000);
		OName.clear();
		Thread.sleep(1000);

	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().text(\"WizzBox\")")
	WebElement OldCompanyName;
	
	public void ClearCompanyOldName() {
		OldCompanyName.click();
		OldCompanyName.clear();
	}
	
    @AndroidFindBy(xpath = "//android.widget.ScrollView/android.widget.EditText[1]")	
	WebElement NameN;
	
	public void EnterYourNewName(String name) {
		NameN.click();
		NameN.clear();
		NameN.sendKeys(name);
	}
	
	
	@AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.EditText\").instance(1)")
	WebElement CompanyNewName;
	
	public void EnterCompanyName(String companyName) {
		CompanyNewName.click();
		CompanyNewName.clear();
		CompanyNewName.sendKeys(companyName);
	}
	
	
	
	@AndroidFindBy(uiAutomator = "new UiSelector().descriptionContains(\"Log Out\")")	
	WebElement logout;
	
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Save\")")
	WebElement Save;
	
	public void TapOnSaveButton() {
		Save.click();
	}
	
	public void Logout() {
		logout.click();
	}

}
