package Utils;

import java.io.File;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import io.appium.java_client.android.AndroidDriver;

public class Recording {

    public static void saveRecording(AndroidDriver driver) {
        try {
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            String video = driver.stopRecordingScreen(); // Get Base64
            byte[] data = java.util.Base64.getDecoder().decode(video);

            File destFile = new File("Recording" + timestamp + ".mp4");
            Files.createDirectories(destFile.getParentFile().toPath()); // Ensure folder exists
            Files.write(destFile.toPath(), data);

            System.out.println("Recording saved to: " + destFile.getAbsolutePath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
