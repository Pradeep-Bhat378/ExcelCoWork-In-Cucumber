package Utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.appium.java_client.android.AndroidDriver;

public class Screenshot {

	public static void takesScreenshot(AndroidDriver driver) throws IOException {
		String  timestamp = java.time.LocalDateTime.now().format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd_HH-mm-ss"));
	
	File str = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File dest = new File("Screenshot/"+timestamp+".png");
   
	FileUtils.copyFile(str, dest);
	}
}
