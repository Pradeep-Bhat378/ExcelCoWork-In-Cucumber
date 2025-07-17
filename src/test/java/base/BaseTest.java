package base;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.net.URI;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.google.common.collect.ImmutableMap;

public class BaseTest {
    public static AndroidDriver driver;
    public static String ExcelCowork = "com.excel.coworks";

   
    public void startAppium() {
        try {
            UiAutomator2Options options = new UiAutomator2Options();
         //   options.setDeviceName("Phone121");
            options.setDeviceName("Pradeep");
       //     options.setUdid("emulator-5554");
             options.setUdid("9b2a222d0dcd");
            options.setAutomationName("UiAutomator2");
            options.setPlatformName("Android");
            options.setNewCommandTimeout(Duration.ofSeconds(30));
        //    options.setNoReset(false);
             options.setFullReset(false);
         //   options.noReset();
        //    options.doesNoReset();
        //    options.setClearSystemFiles(false);
       //     driver.executeScript("mobile: clearApp", ImmutableMap.of("intent","com.excel.coworks"));

    		options.setApp(System.getProperty("user.dir")+"\\src\\test\\resources\\ExcelCo14-7-25.apk");
    		


            driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);

            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
        } catch (Exception e) {
            e.printStackTrace();
        }
  	    
    }

    
 /*   public void quitDriver() {
        if (driver != null) {
            driver.quit();
        }
    }   */
}
