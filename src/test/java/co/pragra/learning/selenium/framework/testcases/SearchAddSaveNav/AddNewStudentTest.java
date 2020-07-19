package co.pragra.learning.selenium.framework.testcases.SearchAddSaveNav;

import co.pragra.learning.selenium.framework.drivermanager.DriverManager;
import co.pragra.learning.selenium.framework.pages.SearchandSaveNav;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AddNewStudentTest {
    WebDriver driver= DriverManager.getDriver();

    @Test(enabled=true)
    public void testAddnewstudent() throws InterruptedException {
        SearchandSaveNav page =new SearchandSaveNav(driver);
       Thread.sleep(9000);
       // WebDriverWait wait = new WebDriverWait(driver, 15);
        //wait.until(ExpectedConditions.textToBePresentInElementLocated((By.xpath("//a[@ng-click='$root.newStudent()']")),"Add New"));     //(By.xpath("//a[@ng-click='$root.newStudent()']")));
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        page.clickaddnewstudents();
    }

}
