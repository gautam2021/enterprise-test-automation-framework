package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtil {

    private LoggerUtil() {
	// Prevent object creation
    }
    
    public static Logger getLogger(Class<?> classname) {
	return LogManager.getLogger(classname);
    }
}
