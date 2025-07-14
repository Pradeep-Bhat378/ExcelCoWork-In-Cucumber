package stepDefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URI;
import java.time.Duration;

public class BaseTest {
    public static AndroidDriver driver;

    public void startAppium() {
        try {
            UiAutomator2Options options = new UiAutomator2Options();
            options.setDeviceName("Phone121");
            options.setUdid("emulator-5554");
            options.setAutomationName("UiAutomator2");
            options.setPlatformName("Android");
            options.setNewCommandTimeout(Duration.ofSeconds(30));
            options.setNoReset(true);

            driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }
}
