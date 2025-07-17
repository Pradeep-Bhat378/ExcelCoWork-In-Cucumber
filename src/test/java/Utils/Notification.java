package Utils;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class Notification {

    public static String verify_the_notification(AndroidDriver driver) throws InterruptedException {
      
    	driver.openNotifications();
        Thread.sleep(2000);

        WebElement notificationTitle = driver.findElement(
            AppiumBy.xpath("//android.widget.TextView[@resource-id=\"android:id/big_text\"]")
        );

        System.out.println("Notification title: " + notificationTitle.getText());
       
        return notificationTitle.getText();
    }
    
    
}
