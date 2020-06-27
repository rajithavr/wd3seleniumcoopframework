package co.pragra.learning.selenium.framework.testcases;

import co.pragra.learning.selenium.framework.data.ExcelDataProvider;
import co.pragra.learning.selenium.framework.drivermanager.DriverManager;
import co.pragra.learning.selenium.framework.pages.AIMedicalInfoPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class AIMedicalInfoTest {
    WebDriver driver = DriverManager.getDriver();

    @Test(enabled = true, dataProviderClass = ExcelDataProvider.class, dataProvider ="additionalInfoMedicalProvider")

    public void testAIMedicalInfo(Object[] data) throws InterruptedException {

        AIMedicalInfoPage medicalInfoPage;
        medicalInfoPage = new AIMedicalInfoPage(driver);
driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
//medicalInfoPage.clinkOnAddInfoLink();
medicalInfoPage.medicalInfoSection();
        medicalInfoPage.clickOnAllerYesBtn();
        medicalInfoPage.foodCheckbox();
        medicalInfoPage.foodTextarea((String) data[0]);
        medicalInfoPage.animalCheckbox();
        medicalInfoPage.animalTextarea((String) data[1]);
        medicalInfoPage.medicationsCheckbox();
        medicalInfoPage.medicationsTextarea((String)data[2]);
        medicalInfoPage.insectAllerCheckbox();
        medicalInfoPage.insectAllerTextarea((String)data[3]);
        medicalInfoPage.otherCheckbox();
        medicalInfoPage.otherTextarea((String)data[4]);
        medicalInfoPage.clickstudAfYesBtn();
        medicalInfoPage.clickEpiPenYesBtn();
        medicalInfoPage.clickAnalReacYesBtn();
        medicalInfoPage.clickHealthConcernYesBtn();
        medicalInfoPage.clickHealthConcernExp((String)data[5]);
        medicalInfoPage.clickMentalYesBtn();
        medicalInfoPage.clickMentalExp((String)data[6]);
        medicalInfoPage.clickConcernLifeYesBtn();
        medicalInfoPage.clickConcernLifeExpl((String)data[7]);
        medicalInfoPage.clickMedicatYesBtn();
        medicalInfoPage.clickMedicatRegExp((String)data[8]);
        medicalInfoPage.clickSelfMedYesBtn();
        medicalInfoPage.clickSmokeYesBtn();
        medicalInfoPage.FromDateTetnusShot((String)data[9]);
        medicalInfoPage.clickAnyOfTheFollowingYesBtn();
        medicalInfoPage.clickVision();
        medicalInfoPage.clickDigestiveTroubles();
        medicalInfoPage.clickAsthmaRespiratory();
        medicalInfoPage.clickDiabetes();
        medicalInfoPage.clickEpilepsys();
        medicalInfoPage.clickFrequentHeadaches();
        medicalInfoPage.clickHistoryOfSeizures();
        medicalInfoPage.clickSkinDisorder();
        medicalInfoPage.clickIllnessesNone();
        medicalInfoPage.clickMeasles();
        medicalInfoPage.clickScarletFever();
        medicalInfoPage.clickCancerTumors();
        medicalInfoPage.clickMumps();
        medicalInfoPage.clickThyroidDisease();
        medicalInfoPage.clickRheumaticFever();
        medicalInfoPage.clickRubella();
        medicalInfoPage.clickChickenPox();
        medicalInfoPage.clickOtherIllnessesCheck();
        medicalInfoPage.clickOtherIllnessesField((String)data[10]);
        medicalInfoPage.clickOtherIllnessesDescription((String)data[11]);
        medicalInfoPage.clickSufferedCheckYesBtn();
        medicalInfoPage.clickDepression();
        medicalInfoPage.clickSevereMoodSwings();
        medicalInfoPage.clickEatingDis();
        medicalInfoPage.clickObsessiveCompulsive();
        medicalInfoPage.clickDifficultiesConcentrating();
        medicalInfoPage.clickLearningDisability();
        medicalInfoPage.clickDrugAlcoholDependency();
        medicalInfoPage.clickMoreInformation((String)data[12]);
        medicalInfoPage.clickOtherMedicalConditionsYes();
        medicalInfoPage.clickOtherMedicalConditionExpl((String)data[13]);
        medicalInfoPage.clickHealthIssues((String)data[14]);
        medicalInfoPage.clickFamilyDoctorNames((String)data[15]);
        medicalInfoPage.clickFamilyPhoneNumber(data[16]);
        medicalInfoPage.clickDentistName((String)data[17]);
        medicalInfoPage.clickDentistPhoneNumber(data[18]);
        medicalInfoPage.clickDPTBHIBHIB();
        medicalInfoPage.DPTBHIBHIBDate((String)data[19]);
        medicalInfoPage.clickBooster();
        medicalInfoPage.BoosterDate((String)data[20]);
        medicalInfoPage.clickMMR();
        medicalInfoPage.MMRDate((String)data[21]);
        medicalInfoPage.clickhepatitisB();
        medicalInfoPage.HepatitisBDate((String)data[22]);
        medicalInfoPage.clickDisclosureAgreeInfor();
        medicalInfoPage.clickDisclosureContactIf();
        medicalInfoPage.clickDisclosureAwareOutbrake();
        medicalInfoPage.clickDisclosureAwareChildNeeds();
       medicalInfoPage.clickDisclosureAwareUpdate();

        Thread.sleep(5000);
    }
}