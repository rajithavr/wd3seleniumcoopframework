package co.pragra.learning.selenium.framework.testcases.dashboardLogin;
import co.pragra.learning.selenium.framework.data.ExcelDataProvider;
import co.pragra.learning.selenium.framework.drivermanager.DriverManager;
import co.pragra.learning.selenium.framework.pages.UserLoginPage;
import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

public class UserLoginTest {
    WebDriver driver =DriverManager.getDriver();

    @Test(enabled = true ,dataProviderClass = ExcelDataProvider.class,dataProvider ="loginProvider")

    public void testLogin(String userName,String password)  {
        UserLoginPage page= new UserLoginPage(driver);
        page.enterUsername(userName).enterPassword(password);
        page.loginbtnenter();
    }

}
