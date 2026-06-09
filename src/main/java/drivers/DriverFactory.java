package drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
    private static WebDriver driver;

    public static WebDriver getBrowser(String browserName) {
	if (browserName.equalsIgnoreCase("chrome")) {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	} else if (browserName.equalsIgnoreCase("edge")) {
	    WebDriverManager.edgedriver().setup();
	    driver = new EdgeDriver();
	} else if (browserName.equalsIgnoreCase("firefox")) {
	    WebDriverManager.firefoxdriver().setup();
	    driver = new FirefoxDriver();
	} else {
	    throw new IllegalArgumentException("Browser is not supported " + browserName);
	}
	return driver;
    }
}
