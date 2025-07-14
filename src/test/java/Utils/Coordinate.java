package Utils;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.interactions.Pause;

import java.time.Duration;
import java.util.Collections;

import static org.openqa.selenium.interactions.PointerInput.MouseButton.LEFT;

public class Coordinate {

    public static void tapOnCoordinate(int x, int y, AndroidDriver driver) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence tap = new Sequence(finger, 1)
                .addAction(finger.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), x, y))
                .addAction(finger.createPointerDown(LEFT.asArg()))
                .addAction(new Pause(finger, Duration.ofMillis(200)))
                .addAction(finger.createPointerUp(LEFT.asArg()));

        driver.perform(Collections.singletonList(tap));
    }
}
