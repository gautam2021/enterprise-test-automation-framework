package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utilities.LoggerUtil;

public class LoginPage extends BasePage {

    private By usernameInput = By.name("username");
    private By passwordInput = By.name("password");
    private By loginBtn = By.xpath("//button[contains(.,'Login')]");

    private static final Logger logger = LoggerUtil.getLogger(LoginPage.class);

    public void enterUsername(String username) {
	wait.until(ExpectedConditions.elementToBeClickable(usernameInput));
	logger.info("Entering username " + username);
	driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
	wait.until(ExpectedConditions.elementToBeClickable(passwordInput));
	logger.info("entering password " + password);
	driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginBtn() {
	wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
	logger.info("Clicking login button on LoginPage");
	driver.findElement(loginBtn).click();
    }

    public void login(String username, String password) {
	enterUsername(username);
	enterPassword(password);
	clickLoginBtn();
    }

}
