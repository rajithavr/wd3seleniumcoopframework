package co.pragra.learning.selenium.framework.testcases;

import co.pragra.learning.selenium.framework.data.ExcelDataProvider;
import co.pragra.learning.selenium.framework.drivermanager.DriverManager;
import co.pragra.learning.selenium.framework.pages.SearchandSaveNav;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SearchStudentTest {



    WebDriver driver= DriverManager.getDriver();

    @Test(enabled = true, dataProviderClass = ExcelDataProvider.class,dataProvider ="studentProvider")
    public void testsearchStudent(Object [] data) throws InterruptedException {
        // driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
        Thread.sleep(8000);
        SearchandSaveNav page=new SearchandSaveNav(driver);
        Thread.sleep(5000);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        page.searchStudent((String)data[0]);
        Thread.sleep(10000);
//        page.clickFirstSearch();
    }

}




