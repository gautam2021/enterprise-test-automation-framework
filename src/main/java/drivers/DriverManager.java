package drivers;

import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static ThreadLocal<WebDriver> tDriver = new ThreadLocal<>();

    // getdriver
    public static WebDriver getDriver() {
	return tDriver.get();
    }

    // setdriver
    public static void setDriver(WebDriver driverInstance) {
	tDriver.set(driverInstance);
    }

    // remove
    public static void remove() {
	if(tDriver.get()!=null) {
	    tDriver.get().quit();
	    tDriver.remove();
	}
    }

}
