package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {

    private By dashboardText = By.xpath("//h6[contains(.,'Dashboard')]");

    public boolean isDashboardDisplayed() {
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dashboardText));
	return driver.findElement(dashboardText).isDisplayed();
    }
}
