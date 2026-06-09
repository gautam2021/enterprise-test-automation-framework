package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestListener implements ITestListener {

    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    public void onTestStart(ITestResult result) {
	ExtentReports test = ExtentManager.getInstance();
	ExtentTest extest = test.createTest(result.getName());
	extentTest.set(extest);
    }

    public void onTestSuccess(ITestResult result) {
	extentTest.get().pass("Test Passed");
    }

    public void onTestFailure(ITestResult result) {
	extentTest.get().fail(result.getThrowable());
    }

    public void onFinish(ITestContext context) {
	ExtentManager.getInstance().flush();
    }

}
