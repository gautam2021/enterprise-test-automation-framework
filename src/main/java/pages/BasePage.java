package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriverManager;
import drivers.WaitManager;

public class BasePage {

    protected  WebDriverWait wait;
    protected WebDriver driver;
    
    public BasePage() {
	driver=DriverManager.getDriver();
	wait=WaitManager.getWait();
    }
}
