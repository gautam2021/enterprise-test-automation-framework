package ui.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import listeners.RetryAnalyzer;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ConfigReader;

public class LoginTest extends BaseTest{

    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void verifyLogin() {
	LoginPage loginPage=new LoginPage();
	loginPage.login(ConfigReader.getProperties("username"), ConfigReader.getProperties("password"));
	
	DashboardPage dashboardPage=new DashboardPage();
	boolean isDisplayed=dashboardPage.isDashboardDisplayed();
	Assert.assertTrue(isDisplayed,"Dashboard is not displayed after login");
    }
}
