package pageObject;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class WorkspacePage extends BasePage_EC{

	public WorkspacePage(AppiumDriver driver) {
		super(driver);	
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().description('Daily Pass Day pass for access to all facilities')")
	WebElement DailyPass;
	
	public void TapOnDailyPass() {
		DailyPass.click();
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().description('Meeting Rooms Conference room for meetings and presentations')")
        WebElement MeetingRooms;
	
	public void TapOnMettingRooms() {
		MeetingRooms.click();
	}
	
	@AndroidFindBy(uiAutomator= "new UiSelector().description('Hot Desk Flexible workspace available on first-come, first-served basis')")
        WebElement HotDesk;
	
	public void TapOnHotDesk() {
		HotDesk.click();
	}

	@AndroidFindBy(accessibility = "Dedicated Desk\nReserved desk for exclusive use")
	WebElement DedicatedDesk;
	
	public void TapOnDedicatedDesk() {
		DedicatedDesk.click();
	}
	
	@AndroidFindBy(xpath = "//android.widget.Button[@content-desc=\"Private Cabins Enclosed private office space\"]")
         WebElement PrivateCabins;
	
	public void TapOnPrivateCabins() {
		PrivateCabins.click();
	}
	
	@AndroidFindBy(uiAutomator = "new UiSelector().description(\"Post Maker Create & share posts instantly!\")")
      WebElement PostMaker;
	
	public void TapOnPostMaker() {
		PostMaker.click();
	}
	
	
}
