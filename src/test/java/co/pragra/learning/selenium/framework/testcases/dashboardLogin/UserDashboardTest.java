package co.pragra.learning.selenium.framework.testcases.dashboardLogin;

import co.pragra.learning.selenium.framework.drivermanager.DriverManager;
import co.pragra.learning.selenium.framework.pages.UserDashboardPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class UserDashboardTest {
    WebDriver driver = DriverManager.getDriver();

    @Test(enabled = true)
    public void  testUserDashboard() throws InterruptedException {
        UserDashboardPage page =new UserDashboardPage(driver);
        WebDriver.Window window = driver.manage().window();
        window.fullscreen();
        Thread.sleep(5000);
        WebDriverWait driverWait = new WebDriverWait(driver, 500);
        page.clickOnStudents();

    }
}
