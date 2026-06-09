package base;

import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import drivers.DriverFactory;
import drivers.DriverManager;
import drivers.WaitManager;
import utilities.ConfigReader;
import utilities.LoggerUtil;

public class BaseTest {

    private static Logger logger=LoggerUtil.getLogger(BaseTest.class);
    @BeforeMethod
    public void setup() {
	DriverManager.setDriver(DriverFactory.getBrowser(ConfigReader.getProperties("browser")));
	logger.info("Launching browser ");
	DriverManager.getDriver().get(ConfigReader.getProperties("url"));
	DriverManager.getDriver().manage().window().maximize();
    }
    
    @AfterMethod
    public void tearDown() {
	WaitManager.removeWait();
	DriverManager.remove();
    }
}
