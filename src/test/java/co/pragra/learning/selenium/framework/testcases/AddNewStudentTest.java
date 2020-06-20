package co.pragra.learning.selenium.framework.testcases;

import co.pragra.learning.selenium.framework.drivermanager.DriverManager;
import co.pragra.learning.selenium.framework.pages.SearchandSaveNav;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddNewStudentTest {
    WebDriver driver= DriverManager.getDriver();

    @Test(enabled=true)
    public void testAddnewstudent() throws InterruptedException {
        SearchandSaveNav page =new SearchandSaveNav(driver);
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        page.clickaddnewstudents();
    }

}
