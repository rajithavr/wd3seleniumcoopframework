package co.pragra.learning.selenium.framework.testcases;

import co.pragra.learning.selenium.framework.data.ExcelDataProvider;
import co.pragra.learning.selenium.framework.drivermanager.DriverManager;
import co.pragra.learning.selenium.framework.pages.AIEducationGoals;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AIEducationGoalsTest {

    WebDriver driver = DriverManager.getDriver();
    AIEducationGoals eduGoalsPage = new AIEducationGoals(driver);

    @Test(enabled = true, dataProviderClass = ExcelDataProvider.class,dataProvider ="addInfoEduGoalsProvider")
    public void testAdditionalInfo(Object [] data) throws InterruptedException {
        eduGoalsPage = new AIEducationGoals(driver);
        Thread.sleep(5000);

        eduGoalsPage.clinkOnAddInfoLink();
        eduGoalsPage.enterCGrade(data[0]);
        eduGoalsPage.enterAGrade((String)data[1]);
        eduGoalsPage.clickOnYesBtn();
        eduGoalsPage.Agency((String)data[2]);
        eduGoalsPage.AgencyFName((String)data[3]);
        eduGoalsPage.AgencyEmail((String)data[4]);
        eduGoalsPage.AgencyAddress((String)data[5]);
        eduGoalsPage.AgencyCity((String)data[6]);
        eduGoalsPage.AgencyProvince((String)data[7]);
        eduGoalsPage.AgencyCountry((String)data[8]);
        eduGoalsPage.AgencyPostalCode(data[9]);
        eduGoalsPage.Counsellor((String)data[10]);
        eduGoalsPage.CounsellorEmail(data[11]);
        eduGoalsPage.CounsellorPhone(data[12]);
        eduGoalsPage.CurrentSchool((String)data[13]);
        eduGoalsPage.SchoolWebsite((String)data[14]);
        eduGoalsPage.SeptemberRadioBtn();
        eduGoalsPage.SelectYear(data[15]);
        eduGoalsPage.OthBtn();
        eduGoalsPage.FromDate((String)data[16]);
        eduGoalsPage.ToDate((String)data[17]);
        eduGoalsPage.SchoolAttended((String)data[18]);
        eduGoalsPage.CanadianSchool((String)data[19]);
        eduGoalsPage.SchoolGoal((String)data[20]);
        eduGoalsPage.OtherSchoolGoal((String)data[21]);
        eduGoalsPage.EngYears(data[22]);
        eduGoalsPage.ieltsYesBtn();
        eduGoalsPage.ieltsRslt(data[23]);
        eduGoalsPage.toeflYesBtn();
        eduGoalsPage.toeflRslt(data[24]);
        eduGoalsPage.ooptNoBtn();
        eduGoalsPage.slepNoBtn();
        eduGoalsPage.cambridgeNoBtn();
        eduGoalsPage.placementNoBtn();
        eduGoalsPage.otherNoBtn();
        eduGoalsPage.HearAboutSchool((String)data[25]);
        eduGoalsPage.CompleteHighSchool();
        eduGoalsPage.SpecialLearningNeeds((String)data[26]);
        eduGoalsPage.FrndOrFamily();
        eduGoalsPage.EducationFair();
        eduGoalsPage.CanadianConsulate();
        eduGoalsPage.CanadianEduCenter();
        eduGoalsPage.OtBtn();
        eduGoalsPage.OtherField((String)data[27]);
        eduGoalsPage.Newspaper((String)data[28]);

    }
}
