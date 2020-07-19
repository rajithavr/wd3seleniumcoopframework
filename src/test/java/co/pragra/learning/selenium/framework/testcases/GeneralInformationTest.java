package co.pragra.learning.selenium.framework.testcases;

import co.pragra.learning.selenium.framework.data.ExcelDataProvider;
import co.pragra.learning.selenium.framework.drivermanager.DriverManager;
import co.pragra.learning.selenium.framework.pages.GIHomestayPage;
import co.pragra.learning.selenium.framework.pages.GIPlacementandSummaryInfoPage;
import co.pragra.learning.selenium.framework.pages.GeneralInformationPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GeneralInformationTest {

    WebDriver driver = DriverManager.getDriver();

    @Test(enabled = true, dataProviderClass = ExcelDataProvider.class,dataProvider ="generalInfoProvider")

    public void testGeneralInfo(Object [] data) throws InterruptedException {

        GeneralInformationPage page;
        GIHomestayPage Homestaypage;
        page = new GeneralInformationPage(driver);
        Homestaypage= new GIHomestayPage(driver);
        //Thread.sleep(9000);

        page.enterStatus((String) data[0]);
        page.enterReason((String) data[1]);
        page.enterESIS_ID(data[2]);
        page.isActive(data[3]);
        page.enterweeks(data[4]);
        page.enterFname((String) data[5]);
        page.enterLname((String) data[6]);
        page.enterNickname((String) data[7]);
        page.enterMiddlename((String) data[8]);
        page.enterstudentCell(data[9]);
        page.enterstudentPhone(data[10]);
        page.enterDOB((String) data[11]);
        page.enterGender((String) data[12]);
        page.enterbirthcountry((String) data[13]);
        page.enterbirthcity((String) data[14]);
        page.enterCitizenship((String) data[15]);
        page.enterlanguage((String) data[16]);

        //page.scrollpage();

        Thread.sleep(6000);

        Homestaypage.HomestaySection();
        Homestaypage.enterHomestayRequired((String)data[17]);
        Homestaypage.enteranotherHomestayRequired((String)data[18]);
        Homestaypage.enterHomestayCoordinator((String)data[19]);
        //Thread.sleep(8000);
    }

        @Test(enabled = true, dataProviderClass = ExcelDataProvider.class,dataProvider ="PlacementTestingProvider")

        public void testPlacementTesting(Object[] data) throws InterruptedException {
            GIPlacementandSummaryInfoPage page;
            page= new GIPlacementandSummaryInfoPage(driver);

            Thread.sleep(5000);
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

           page.enterStructure(data[0]);
           page.enterListening(data[1]);
           page.enterReading(data[2]);
           page.enterWriting(data[3]);
           page.enterOverwrittingLevel(data[6]);
           //Thread.sleep(10000);
           page.enterRetesting(data[7]);
           page.enterManualPlacement(data[8]);

        }




}