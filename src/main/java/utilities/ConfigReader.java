package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    static {
	String path = System.getProperty("user.dir") + File.separator + "src" + File.separator + "test" + File.separator
		+ "resources" + File.separator + "config" + File.separator + "config.properties";

	FileInputStream fis;
	try {
	    fis = new FileInputStream(path);

	    prop.load(fis);

	} catch (IOException e) {
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}

    }

    public static String getProperties(String key) {
	return prop.getProperty(key);
    }
}
