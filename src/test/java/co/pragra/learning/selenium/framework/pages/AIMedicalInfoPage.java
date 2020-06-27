package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AIMedicalInfoPage {
    WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor) driver;

//    @FindBy(xpath = "//a[text()='Additional Information']")
//     WebElement AddInfoLink;
    @FindBy(xpath="//div[@class='row']//fieldset/legend[text()='Medical Information']")
WebElement medicalInformationSection;
    @FindBy(xpath = "((//div[@class='col-md-12 col-sm-12'])[13])//input[1]")
   public WebElement allergiesYes;
@FindBy(xpath="((//div[@class='col-md-12 col-sm-12'])[13])//input[2]")
WebElement allergiesNo;
@FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])//input[@class='ng-pristine ng-valid'])[12]")
WebElement foodCheckbox;
@FindBy(xpath="//div[@class='col-md-6 col-sm-6']//textarea[@placeholder='Food']")
WebElement foodTextarea;
@FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])//input[@class='ng-pristine ng-valid'])[13]")
WebElement animalCheckbox;
    @FindBy(xpath="//div[@class='col-md-6 col-sm-6']//textarea[@placeholder='Animals']")
    WebElement animalTextarea;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])//input[@class='ng-pristine ng-valid'])[14]")
    WebElement medicationsCheckbox;
    @FindBy(xpath="//div[@class='col-md-6 col-sm-6']//textarea[@placeholder='Medications']")
    WebElement medicationsTextarea;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])//input[@class='ng-pristine ng-valid'])[15]")
    WebElement insectAllergiesCheckbox;
    @FindBy(xpath="//div[@class='col-md-6 col-sm-6']//textarea[@placeholder='Insect']")
    WebElement insectTextarea;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])//input[@class='ng-pristine ng-valid'])[16]")
    WebElement otherCheckbox;
    @FindBy(xpath="//div[@class='col-md-6 col-sm-6']//textarea[@placeholder='Other']")
    WebElement otherTextarea;
@FindBy(xpath="((//div[@class='col-md-12 col-sm-12'])[14])//input[1]")
WebElement studentAfraidYes;
    @FindBy(xpath="((//div[@class='col-md-12 col-sm-12'])[14])//input[2]")
    WebElement studentAfraidNo;
    @FindBy(xpath="((//div[@class='col-md-12 col-sm-12'])[15])//input[1]")
    WebElement epiPenYes;
    @FindBy(xpath = "((//div[@class='col-md-12 col-sm-12'])[15])//input[2]")
    WebElement epiPenNo;
    @FindBy (xpath = "((//div[@class='col-md-12 col-sm-12'])[16])//input[1]")
    WebElement analyticReactionYes;
    @FindBy(xpath="((//div[@class='col-md-12 col-sm-12'])[16])//input[2]")
    WebElement analyticReactionNo;
    @FindBy(xpath="((//div[@class='col-md-12 col-sm-12'])[17])//input[1]")
    WebElement healthConcernYes;
    @FindBy(xpath="((//div[@class='col-md-12 col-sm-12'])[17])//input[2]")
    WebElement healthConcernNo;
    @FindBy(xpath="//div[@class='col-md-12 col-sm-12']//textarea[@ng-model='$root.student.data.studentAdditionalGeneralInformation.ConcernsIllnessesDescription']")
    WebElement concernExplanation;
    @FindBy(xpath = "((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[18])//input[1]")
    WebElement mentalIllinessYes;
@FindBy(xpath="((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[18])//input[2]")
WebElement mentalIllinessNo;
@FindBy(xpath="//div[@class='col-md-12 col-sm-12']//textarea[@ng-model='$root.student.data.studentAdditionalGeneralInformation.HaveMentalIllnessDescription']")
WebElement mentalExplanation;
@FindBy(xpath="((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[20])//input[1]")
WebElement concernLifeThreatingYes;
@FindBy(xpath="((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[20])//input[2]")
WebElement concernLifeThreatingNo;
@FindBy(xpath="//div[@class='col-md-12 col-sm-12']//textarea[@ng-model='$root.student.data.studentAdditionalGeneralInformation.HealthConcernsDescription']")
WebElement healthConcernsLifeThretgExplanation;
@FindBy(xpath = "((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[22])//input[1]")
WebElement medicationRegularlyYes;
@FindBy(xpath = "((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[22])//input[2]")
WebElement medicationRegularlyNo;
@FindBy(xpath = "//div[@class='col-md-12 col-sm-12']//textarea[@ng-model='$root.student.data.studentAdditionalGeneralInformation.MedicationRegularyDescription']")
WebElement medicationRegularlyExplanation;

@FindBy(xpath="((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[24])//input[1]")
WebElement selfMedicationYes;
@FindBy(xpath="((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[24])//input[2]")
WebElement selfMedicationNo;

@FindBy(xpath = "((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[25])//input[1]")
WebElement smokeCigarettesYes;
@FindBy(xpath = "((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[25])//input[2]")
WebElement smokeCigarettesNo;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-4 col-sm-4'])//input[@placeholder='Date of last Tetanus shot']")
WebElement DateOfLastTetanusShot;

@FindBy(xpath = "((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[25])//input[1]")
WebElement anyOfTheFollowingYes;
@FindBy(xpath = "((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[25])//input[2]")
WebElement anyOfTheFollowingNo;

@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-3 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.VisionProblems']")
WebElement vision  ;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-4 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.DigestiveTroubles']")
WebElement digestiveTroubles;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-5 col-sm-4'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.AsthmaRespiratoryProblems']")
WebElement asthmaRespiratoryProblems;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-3 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.Diabetes']")
WebElement diabetes;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-3 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.Epilepsy']")
WebElement epilepsy;
@FindBy(xpath="(//div[@class='row']//div[@class='col-md-4 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.FrequentHeadaches']")
WebElement frequentHeadachesMigraines;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-4 col-sm-4'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.HistorySeizures']")
WebElement historyOfSeizures;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-4 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.SkinDisorder']")
WebElement skinDisorderEczema;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-3 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.noneIllness']")
WebElement illnessesNone;
@FindBy(xpath="(//div[@class='row']//div[@class='col-md-3 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.Measles']")
WebElement Measles;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-4 col-sm-4'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.ScarletFever']")
WebElement scarletFever;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-3 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.CancerTumors']")
WebElement cancerTumors;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-3 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.Mumps']")
WebElement mumps;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-4 col-sm-4'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.ThyroidDesease']")
WebElement thyroidDisease;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-3 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.RheumaticFever']")
WebElement rheumaticFever;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-3 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.Hepatitis']")
WebElement hepatitis;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-3 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.Rubella']")
WebElement rubella;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-3 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.ChickenPox']")
WebElement chickenPox;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-3 col-sm-3'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.OtherIllnessesCheck']")
WebElement oOtherIllnessesCheck;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='name' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.OtherIllnessesDescription']")
WebElement otherIllnessesField;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-12 col-sm-12'])//textarea[@placeholder='Other Illness Description']")
WebElement otherIllnessesDescription;
@FindBy(xpath = "((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[28])//input[1]")
WebElement sufferedCheckYes;
@FindBy(xpath = "((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[28])//input[2]]")
WebElement sufferedCheckNo;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.Depression']")
WebElement depression;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.SevereMoodSwings']")
WebElement severeMoodSwings;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.EatingDisorders']")
WebElement eatingDisorders;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.ObsessiveDisorder']")
WebElement obsessiveCompulsiveDisorder;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.DifficultiesConcentrating']")
WebElement difficultiesConcentrating;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.LearningDisability']")
WebElement learningDisability;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.DrugOrAlcoholDependency']")
WebElement DrugAlcoholDependency;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-12 col-sm-12'])//textarea[@placeholder='Information']")
WebElement moreInformation;
@FindBy(xpath = "((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[30])//input[1]")
WebElement otherMdicalConditionsYes;
@FindBy(xpath = "((//div[@class='row']//div[@class='col-md-12 col-sm-12'])[30])//input[2]")
WebElement otherMdicalConditionsNo;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-12 col-sm-12'])//textarea[@placeholder='Explanation' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.OtherMedicalCondition']")
WebElement OtherMedicalConditionExpl;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-12 col-sm-12'])//textarea[@placeholder='Health issues']")
WebElement healthIssues;

@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@placeholder='Family Doctor Name']")
WebElement familyDoctorName;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@placeholder='Family Doctor Phone Number']")
WebElement familyDoctorPhoneNumber;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@placeholder='Family Dentist Name']")
WebElement familyDentistName;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@placeholder='Family Dentist Phone Number']")
WebElement familyDentistPhoneNumber;

@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.dptbHibImmunizationsCheck']")
WebElement DPTBHIBHIB;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='text' and @placeholder='DPTBHIB-HIB']")
WebElement DPTBHIBHIBDate;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.BoosterCheck']")
WebElement Booster ;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='text' and @placeholder='Booster']")
WebElement  boosterDate;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.mmrImmunizationsCheck']")
WebElement  MMR;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='text' and @placeholder='MMR']")
WebElement MMRDate;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.hepatitisBImmunizationsCheck']")
WebElement hepatitisB;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='text' and @placeholder='Hepatitis B']")
WebElement  HepatitisBDate;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.DisclosureAgreeInformation']")
WebElement DisclosureAgreeInformation;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.DisclosureContactIfChangesOccur']")
WebElement DisclosureContactIf;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.DisclosureAwareOutbrake']")
WebElement DisclosureAwareOutbrake ;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.DisclosureAwareChildNeeds']")
WebElement  DisclosureAwareChildNeeds;
@FindBy(xpath = "(//div[@class='row']//div[@class='col-md-6 col-sm-6'])//input[@type='checkbox' and @ng-model='$root.student.data.studentAdditionalGeneralInformation.DisclosureAwareUpdate']")
WebElement DisclosureAwareUpdate;

    public AIMedicalInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
//   public AIMedicalInfoPage clinkOnAddInfoLink() {
//        this.AddInfoLink.click();
//        return this;
//    }

        public AIMedicalInfoPage medicalInfoSection()
    {
        this.medicalInfoSection();
        Actions action=new Actions(driver);
        action.moveToElement(medicalInformationSection).build().perform();
return this;
    }
    public AIMedicalInfoPage clickOnAllerYesBtn()
    {
        WebDriverWait driverWait = new WebDriverWait(driver,100);
        driverWait.until(ExpectedConditions.elementToBeClickable(allergiesYes));
        this.allergiesYes.click();

        return this;
    }
    public AIMedicalInfoPage clickOnAllerNoBtn()
    {
        this.allergiesNo.click();
        return this;
    }
    public AIMedicalInfoPage foodCheckbox ()
    {
        this.foodCheckbox.click();
        return this;
    }
    public AIMedicalInfoPage foodTextarea (String fdtxt)
    {
        this.foodTextarea.sendKeys(fdtxt);
        return this;
    }
    public AIMedicalInfoPage animalCheckbox ()
    {
        this.animalCheckbox.click();
        return this;
    }
    public AIMedicalInfoPage animalTextarea (String antxt)
    {
        this.animalTextarea.sendKeys(antxt);
        return this;
    }
    public AIMedicalInfoPage medicationsCheckbox ()
    {
        this.medicationsCheckbox.click();
        return this;
    }
    public AIMedicalInfoPage medicationsTextarea (String medtxt)
    {
        this.medicationsTextarea.sendKeys(medtxt);
        return this;
    }
    public AIMedicalInfoPage insectAllerCheckbox ()
    {
        this.insectAllergiesCheckbox.click();
        return this;
    }
    public AIMedicalInfoPage insectAllerTextarea (String intxt)
    {
        this.insectTextarea.sendKeys(intxt);
        return this;
    }
    public AIMedicalInfoPage otherCheckbox ()
    {
        this.otherCheckbox.click();
        return this;
    }
    public AIMedicalInfoPage otherTextarea (String othtxt)
    {
        this.otherTextarea.sendKeys(othtxt);
        return this;
    }
    public AIMedicalInfoPage clickstudAfYesBtn ()
    {
        this.studentAfraidYes.click();
        return this;
    }
    public AIMedicalInfoPage clickstudAfNoBtn ()
    {
        this.studentAfraidNo.click();
        return this;
    }
    public AIMedicalInfoPage clickEpiPenYesBtn ()
    {
        this.epiPenYes.click();
        return this;
    }
    public AIMedicalInfoPage clickEpiPenNoBtn ()
    {
        this.epiPenNo.click();
        return this;
    }
    public AIMedicalInfoPage clickAnalReacYesBtn ()
    {
        this.analyticReactionYes.click();
        return this;
    }
    public AIMedicalInfoPage clickAnalReacNoBtn ()
    {
        this.analyticReactionNo.click();
        return this;
    }
    public AIMedicalInfoPage clickHealthConcernYesBtn ()
    {
        this.healthConcernYes.click();
        return this;
    }
    public AIMedicalInfoPage clickHealthConcernNoBtn()
    {
        this.healthConcernNo.click();
        return this;
    }
    public AIMedicalInfoPage clickHealthConcernExp(String conExpl)
    {
        this.concernExplanation.sendKeys(conExpl);
        return this;
    }
    public AIMedicalInfoPage clickMentalYesBtn ()
    {
        this.mentalIllinessYes.click();
        return this;
    }
    public AIMedicalInfoPage clickMentalNoBtn ()
    {
        this.mentalIllinessNo.click();
        return this;
    }
    public AIMedicalInfoPage clickMentalExp (String mentalExpl)
    {
        this.mentalExplanation.sendKeys(mentalExpl);
        return this;
    }
    public AIMedicalInfoPage clickConcernLifeYesBtn ()
    {
        this.concernLifeThreatingYes.click();
        return this;
    }
    public AIMedicalInfoPage clickConcernLifeNoBtn ()
    {
        this.concernLifeThreatingNo.click();
        return this;
    }
    public AIMedicalInfoPage clickConcernLifeExpl(String healConcLifeThr)
    {
        this.healthConcernsLifeThretgExplanation.sendKeys(healConcLifeThr);
        return this;
    }
    public AIMedicalInfoPage clickMedicatYesBtn ()
    {
        this.medicationRegularlyYes.click();
        return this;
    }
    public AIMedicalInfoPage clickMedicatNoBtn ()
    {
        this.medicationRegularlyNo.click();
        return this;
    }
    public AIMedicalInfoPage clickMedicatRegExp (String medRegExp)
    {
        this.medicationRegularlyExplanation.sendKeys(medRegExp);
        return this;
    }
    public AIMedicalInfoPage clickSelfMedYesBtn ()
    {
        this.selfMedicationYes.click();
        return this;
    }
    public AIMedicalInfoPage clickSelfMedNoBtn ()
    {
        this.selfMedicationNo.click();
        return this;
    }

    public AIMedicalInfoPage clickSmokeYesBtn ()
    {
        this.smokeCigarettesYes.click();
        return this;
    }
    public AIMedicalInfoPage clickSmokeNoBtn ()
    {
        this.smokeCigarettesNo.click();
        return this;
    }
    public AIMedicalInfoPage FromDateTetnusShot(String Fromd) {
        this.DateOfLastTetanusShot.sendKeys(Fromd.trim());
        return this;
    }
    public AIMedicalInfoPage clickAnyOfTheFollowingYesBtn ()
    {
        this.anyOfTheFollowingYes.click();
        return this;
    }
    public AIMedicalInfoPage clickAnyOfTheFollowingNoBtn ()
    {
        this.anyOfTheFollowingNo.click();
        return this;
    }
    public AIMedicalInfoPage clickVision()
    {
        this.vision.click();
        return this;
    }
    public AIMedicalInfoPage clickDigestiveTroubles()
    {
        this.digestiveTroubles.click();
        return this;
    }
    public AIMedicalInfoPage clickAsthmaRespiratory()
    {
        this.asthmaRespiratoryProblems.click();
        return this;
    }
    public AIMedicalInfoPage clickDiabetes()
    {
        this.diabetes.click();
        return this;
    }
    public AIMedicalInfoPage clickEpilepsys()
    {
        this.epilepsy.click();
        return this;
    }
    public AIMedicalInfoPage clickFrequentHeadaches()
    {
        this.frequentHeadachesMigraines.click();
        return this;
    }
    public AIMedicalInfoPage clickHistoryOfSeizures()
    {
        this.historyOfSeizures.click();
        return this;
    }
    public AIMedicalInfoPage clickSkinDisorder()
    {
        this.skinDisorderEczema.click();
        return this;
    }
    public AIMedicalInfoPage clickIllnessesNone()
    {
        this.illnessesNone.click();
        return this;
    }
    public AIMedicalInfoPage clickMeasles()
    {
        this.Measles.click();
        return this;
    }
    public AIMedicalInfoPage clickScarletFever()
    {
        this.scarletFever.click();
        return this;
    }
    public AIMedicalInfoPage clickCancerTumors()
    {
        this.cancerTumors.click();
        return this;
    }

    public AIMedicalInfoPage clickMumps()
    {
        this.mumps.click();
        return this;
    }
    public AIMedicalInfoPage clickThyroidDisease()
    {
        this.thyroidDisease.click();
        return this;
    }
    public AIMedicalInfoPage clickRheumaticFever()
    {
        this.rheumaticFever.click();
        return this;
    }
    public AIMedicalInfoPage clickRubella()
    {
        this.rubella.click();
        return this;
    }
    public AIMedicalInfoPage clickChickenPox()
    {
        this.chickenPox.click();
        return this;
    }
    public AIMedicalInfoPage clickOtherIllnessesCheck()
    {
        this.oOtherIllnessesCheck.click();
        return this;
    }
    public AIMedicalInfoPage clickOtherIllnessesField(String othIllField)
    {
        this.otherIllnessesField.sendKeys(othIllField);
        return this;
    }
    public AIMedicalInfoPage clickOtherIllnessesDescription(String illDesc)
    {
        this.otherIllnessesDescription.sendKeys(illDesc);
        return this;
    }
    public AIMedicalInfoPage clickSufferedCheckYesBtn()
    {
        this.sufferedCheckYes.click();
        return this;
    }
    public AIMedicalInfoPage clickSufferedCheckNoBtn()
    {
        this.sufferedCheckNo.click();
        return this;
    }
    public AIMedicalInfoPage clickDepression()
    {
        this.depression.click();
        return this;
    }
    public AIMedicalInfoPage clickSevereMoodSwings()
    {
        this.severeMoodSwings.click();
        return this;
    }
    public AIMedicalInfoPage clickEatingDis()
    {
        this.eatingDisorders.click();
        return this;
    }
    public AIMedicalInfoPage clickObsessiveCompulsive()
    {
        this.obsessiveCompulsiveDisorder.click();
        return this;
    }
    public AIMedicalInfoPage clickDifficultiesConcentrating()
    {
        this.difficultiesConcentrating.click();
        return this;
    }
    public AIMedicalInfoPage clickLearningDisability()
    {
        this.learningDisability.click();
        return this;
    }
    public AIMedicalInfoPage clickDrugAlcoholDependency()
    {
        this.DrugAlcoholDependency.click();
        return this;
    }
    public AIMedicalInfoPage clickMoreInformation(String morInf)
    {
        this.moreInformation.sendKeys(morInf);
        return this;
    }
    public AIMedicalInfoPage clickOtherMedicalConditionsYes()
    {
        this.otherMdicalConditionsYes.click();
        return this;
    }
    public AIMedicalInfoPage clickOtherMedicalConditionsNo()
    {
        this.otherMdicalConditionsNo.click();
        return this;
    }
    public AIMedicalInfoPage clickOtherMedicalConditionExpl(String othMedIllDes)
    {
        this.OtherMedicalConditionExpl.sendKeys(othMedIllDes);
        return this;
    }
    public AIMedicalInfoPage clickHealthIssues(String healthIssu)
    {
        this.healthIssues.sendKeys(healthIssu);
        return this;
    }
    public AIMedicalInfoPage clickFamilyDoctorNames(String famDocName)
    {
        this.familyDoctorName.sendKeys(famDocName);
        return this;
    }
    public AIMedicalInfoPage clickFamilyPhoneNumber(Object famDocPhNo)
    {
        this.familyDoctorPhoneNumber.sendKeys(String.valueOf(famDocPhNo));
        return this;
    }
    public AIMedicalInfoPage clickDentistName(String FamDenName)
    {
        this.familyDentistName.sendKeys(FamDenName);
        return this;
    }
    public AIMedicalInfoPage clickDentistPhoneNumber(Object famDenPhNo)
    {
        this.familyDentistPhoneNumber.sendKeys(String.valueOf(famDenPhNo));
        return this;
    }
    public AIMedicalInfoPage clickDPTBHIBHIB()
    {
        this.DPTBHIBHIB.click();
        return this;
    }
    public AIMedicalInfoPage DPTBHIBHIBDate(String DPTBHIBHIBDate)
    {
        this.DPTBHIBHIBDate.sendKeys(DPTBHIBHIBDate.trim());
        return this;
    }
    public AIMedicalInfoPage clickBooster()
    {
        this.Booster.click();
        return this;
    }
    public AIMedicalInfoPage BoosterDate(String BoostDate)
    {
        this.boosterDate.sendKeys(BoostDate.trim());
        return this;
    }
    public AIMedicalInfoPage clickMMR()
    {
        this.MMR.click();
        return this;
    }
    public AIMedicalInfoPage MMRDate(String MMRDate)
    {
        this.MMRDate.sendKeys(MMRDate.trim());
        return this;
    }
    public AIMedicalInfoPage clickhepatitisB()
    {
        this.hepatitisB.click();
        return this;
    }
    public AIMedicalInfoPage HepatitisBDate(String HepatitDate)
    {
        this.HepatitisBDate.sendKeys(HepatitDate.trim());
        return this;
    }
    public AIMedicalInfoPage clickDisclosureAgreeInfor()
    {
        this.DisclosureAgreeInformation.click();
        return this;
    }
    public AIMedicalInfoPage clickDisclosureContactIf()
    {
        this.DisclosureContactIf.click();
        return this;
    }
    public AIMedicalInfoPage clickDisclosureAwareOutbrake()
    {
        this.DisclosureAwareOutbrake.click();
        return this;
    }
    public AIMedicalInfoPage clickDisclosureAwareChildNeeds()
    {
        this.DisclosureAwareChildNeeds.click();
        return this;
    }
    public AIMedicalInfoPage clickDisclosureAwareUpdate()
    {
        this.DisclosureAwareUpdate.click();
        return this;
    }
}

