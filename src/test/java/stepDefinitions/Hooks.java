package stepDefinitions;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

import base.BaseTest;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks extends BaseTest {

    @Before
    public void setUp() throws InterruptedException {
        startAppium(); // Starts Appium before each scenario
        
    }

   
	   @After
	    public void tearDown() throws IOException {
	        saveRecording(driver);   // Call method to save recording
	        quitDriver();            // Then quit driver
	    }

	    public static void saveRecording(AndroidDriver driver) {
	        try {
	            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
	            String video = driver.stopRecordingScreen(); // Get Base64
	            byte[] data = Base64.getDecoder().decode(video);

	            File destFile = new File("Recording" + timestamp + ".mp4");
	            Files.createDirectories(destFile.getParentFile().toPath()); // Ensure folder exists
	            Files.write(destFile.toPath(), data);

	            System.out.println("Recording saved to: " + destFile.getAbsolutePath());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    
	/*    static {
	        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
	        System.setProperty("report.path", "Reports/Run_" + timestamp + ".html");
	    } */


   
   @BeforeStep
   public void Recording() {
	 //  driver.startRecordingScreen();
   }
   
   @AfterStep
   public void Screenshot() throws IOException {
	   
	  Utils.Screenshot.takesScreenshot(driver);	 
	  
   }
}
