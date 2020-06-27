package co.pragra.learning.selenium.framework.testcases;

import co.pragra.learning.selenium.framework.data.ExcelDataProvider;
import co.pragra.learning.selenium.framework.drivermanager.DriverManager;
import co.pragra.learning.selenium.framework.pages.AIFirstSectionPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AIFirstSectionTest {
    WebDriver driver = DriverManager.getDriver();

    @Test(enabled = true, dataProviderClass = ExcelDataProvider.class,dataProvider ="additionalInfoIstProvider")

    public void testAIFirstSection(Object [] data) throws InterruptedException {

        AIFirstSectionPage page;
        page = new AIFirstSectionPage(driver);
        page.clinkOnAddInfoLink();
        Thread.sleep(3000);
page.enterCitizenshipp((String)data[0]);
page.enterParentAgent((String)data[1]);
page.enterSchoolInvoice((String)data[2]);
page.enterEmailInvoice((String)data[3]);
page.enterMethodInterview((String)data[4]);
page.enteriD((Object) data[5]);
page.entersocialMedia((String)data[6]);
page.enteriDSocialMedia((Object) data[7]);
        Thread.sleep(2000);
        page.medicalInfoSection();

    }

}

