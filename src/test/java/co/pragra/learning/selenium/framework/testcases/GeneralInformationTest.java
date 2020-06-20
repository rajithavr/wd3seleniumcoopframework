package co.pragra.learning.selenium.framework.testcases;

import co.pragra.learning.selenium.framework.data.ExcelDataProvider;
import co.pragra.learning.selenium.framework.drivermanager.DriverManager;
import co.pragra.learning.selenium.framework.pages.GeneralInformationPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class GeneralInformationTest {

    WebDriver driver = DriverManager.getDriver();

    @Test(enabled = true, dataProviderClass = ExcelDataProvider.class,dataProvider ="generalInfoProvider")

    public void testGeneralInfo(Object [] data) throws InterruptedException {

        GeneralInformationPage page;
        page = new GeneralInformationPage(driver);
        Thread.sleep(9000);

        page.enterStatus((String)data[0]);
        page.enterReason((String)data[1]);
        page.enterESIS_ID(data[2]);
        page.isActive(data[3]);
        page.enterweeks(data[4]);
        page.enterFname((String)data[5]);
        page.enterLname((String)data[6]);
        page.enterNickname((String)data[7]);
        page.enterMiddlename((String)data[8]);
        page.enterstudentCell(data[9]);
        page.enterstudentPhone(data[10]);
        page.enterDOB((String)data[11]);
        page.enterGender((String)data[12]);
        page.enterbirthcountry((String)data[13]);
        page.enterbirthcity((String)data[14]);
        page.enterCitizenship((String)data[15]);
        page.enterlanguage((String)data[16]);
        Thread.sleep(8000);
    }

}