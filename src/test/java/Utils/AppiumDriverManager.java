package Utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.net.URI;

import java.time.Duration;

public class AppiumDriverManager {

    private static AndroidDriver driver;

    public static AndroidDriver initializeDriver() {
        try {
            UiAutomator2Options cap = new UiAutomator2Options();
            cap.setDeviceName("Phone121");
            cap.setAutomationName("UiAutomator2");
            cap.setUdid("emulator-5554");
         //   cap.setNoReset(true);
            cap.setNewCommandTimeout(Duration.ofSeconds(30));

            driver = new AndroidDriver(new URI("http://127.0.0.1:4723/").toURL(), cap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }

    public static AndroidDriver getDriver() {
        return driver;
    }
}
