package utilities;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import drivers.DriverManager;

public class ScreenshotUtils {

    public static String captureScreenshot(WebDriver driver, String testName) {
	String timeStamp=new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	String path=System.getProperty("user.dir")+
		File.separator+
		"screenshots"+
		File.separator+
		testName+
		File.separator+
		"_"+
		File.separator+
		timeStamp+
		File.separator+
		".png";
	
	TakesScreenshot ts=(TakesScreenshot)driver;
	
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File(path);
	
	try {
	    FileUtils.copyFile(source, destination);
	} catch (IOException e) {
	    throw new RuntimeException("Unable to capture screenshot for "+testName);
	}
	return path;
		
    }
}
