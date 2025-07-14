package stepDefination;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class Configuration_Emulator {

	public AndroidDriver driver;
	
	public void setup() throws MalformedURLException, URISyntaxException {
		
		UiAutomator2Options cap =new UiAutomator2Options();
		cap.setUdid("emulator-5554");
		cap.setDeviceName("Phone121");
		cap.setPlatformName("Android");
		cap.setAutomationName("UiAutomator2");
		cap.setAutoGrantPermissions(true);
		cap.setNewCommandTimeout(Duration.ofSeconds(30));
		
		driver = new AndroidDriver(new URI("https://127.0.0.1:4723").toURL(),cap);
				
	}
	
	 public AndroidDriver getDriver() {
	        return driver;
	    }
	
	public void tearDown() {
		
		if (driver !=null) {
			driver.quit();
		}
	}
}
