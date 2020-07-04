package co.pragra.learning.selenium.framework.testcases.dashboardLogin;

import co.pragra.learning.selenium.framework.config.Config;
import co.pragra.learning.selenium.framework.drivermanager.DriverManager;
import co.pragra.learning.selenium.framework.pages.ISPMainPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ISPMainPageTest {
    WebDriver driver;

    @BeforeSuite(enabled =true)
    public void setUp(){
        driver = DriverManager.getDriver();
        driver.get(Config.getProperty("url"));
    }

    @Test(enabled = true)
    public void  testISPCloud(){
        ISPMainPage page= new ISPMainPage(driver);
        page.clickOnUserDashboard();
    }

    @AfterSuite(enabled = true)
    public void tearDown() throws InterruptedException {
        //Thread.sleep(8000);
        //WebDriverWait driverWait = new WebDriverWait(driver, 2000);
        //driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
        //driver.quit();
    }
}
