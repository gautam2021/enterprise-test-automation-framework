package drivers;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitManager {

    private static ThreadLocal<WebDriverWait> tWait = new ThreadLocal<>();

    // get wait
    public static WebDriverWait getWait() {
	if (tWait.get() == null) {
	    WebDriver driver = DriverManager.getDriver();
	    tWait.set(new WebDriverWait(driver, Duration.ofSeconds(20)));
	}
	return tWait.get();
    }

    // remove wait
    public static void removeWait() {
	if (tWait.get() != null) {
	    tWait.remove();
	}
    }
}
