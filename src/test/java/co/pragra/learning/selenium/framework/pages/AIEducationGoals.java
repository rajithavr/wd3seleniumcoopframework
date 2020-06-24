package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AIEducationGoals {
    WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    @FindBy(xpath = "//a[text()='Additional Information']")
    private WebElement AddInfoLink;

    @FindBy(xpath = "//input[@placeholder='Currently in grade']")
    private WebElement currentlyInGrade;

    @FindBy(xpath = "//input[@placeholder='Apply for grade']")
    private WebElement applyForGrade ;

    @FindBy(xpath = "//input[@name='2O0']")
    private WebElement otherRadioBtn;

    @FindBy(xpath = "//div[@class='col-md-3 col-sm-3 p-t-25']//input[@placeholder='Other']")
    private WebElement other;

    @FindBy(xpath = "((//div[@class='col-md-12 col-sm-12'])[2])//input[1]")
    private WebElement yesRadioBtn;

    @FindBy(xpath = "((//div[@class='col-md-12 col-sm-12'])[2])//input[2]")
    private WebElement noRadioBtn;

    @FindBy(xpath = "//input[@placeholder='Agency assisting']")
    private WebElement agency;

    @FindBy(xpath = "//input[@placeholder='Agency Full Name']")
    private WebElement agencyName;

    @FindBy(xpath = "//input[@placeholder='Agency assisting email']")
    private WebElement agencyEmail;

    @FindBy(xpath = "//input[@placeholder='Agency Street address']")
    private WebElement agencyAddress;

    @FindBy(xpath = "//input[@placeholder='Agency City']")
    private WebElement agencyCity;

    @FindBy(xpath = "//input[@placeholder='Agency Province']")
    private WebElement agencyProvince;

    @FindBy(xpath = "//input[@placeholder='Agency Country']")
    private WebElement agencyCountry;

    @FindBy(xpath = "//input[@placeholder='Agency Postal Code']")
    private WebElement agencyPostalCode;

    @FindBy(xpath = "//input[@placeholder=\"Counsellor's Name\"]")
    private WebElement counsellor;

    @FindBy(xpath = "//input[@placeholder=\"Counsellor's Email\"]")
    private WebElement counsellorEmail;

    @FindBy(xpath = "//input[@placeholder=\"Counsellor's Phone\"]")
    private WebElement counsellorPhone;

    @FindBy(xpath = "//input[@placeholder='Name of current school']")
    private WebElement currentSchool;

    @FindBy(xpath = "//input[@placeholder='School Website']")
    private WebElement schoolWebsite;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-6 ng-binding'])[1])//input[1]")
    private WebElement septemberRadioBtn;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-6 ng-binding'])[1])//input[2]")
    private WebElement februaryRadioBtn;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-6 ng-binding'])[1])//input[3]")
    private WebElement julyRadioBtn;

    @FindBy(xpath = "//input[@placeholder='Select year']")
    private WebElement year;

    @FindBy(xpath = "((//div[@class='col-md-offset-1 col-md-2 col-sm-offset-2 col-sm-1 p-t-22'])[1])//input[1]")
    private WebElement otherBtn;

    @FindBy(xpath = "((//div[@class='col-md-3 col-sm-3'])[3])//input")
    private WebElement from;

    @FindBy(xpath = "((//div[@class='col-md-3 col-sm-3'])[4])//input")
    private WebElement to;

    @FindBy(xpath = "//input[@placeholder='Other month']")
    private WebElement otherMonth;

    @FindBy(xpath = "//input[@placeholder='Attend School']")
    private WebElement schoolAttended;

    @FindBy(xpath = "//textarea[@placeholder='Canadian School']")
    private WebElement canadianSchool;

    @FindBy(xpath = "//input[@placeholder='School goal']")
    private WebElement schoolGoal;

    @FindBy(xpath = "//input[@placeholder='Other School goal']")
    private WebElement otherSchoolGoal;

    @FindBy(xpath = "//input[@placeholder='Studied English years']")
    private WebElement studiedEnglishYears;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[1])//input[1]")
    private WebElement ieltsYes;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[1])//input[2]")
    private WebElement ieltsNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[2])//input[1]")
    private WebElement ieltsScore;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[3])//input[1]")
    private WebElement ooptYes;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[3])//input[2]")
    private WebElement ooptNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[4])//input")
    private WebElement ooptScore;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[5])//input[1]")
    private WebElement cambridgeYes;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[5])//input[2]")
    private WebElement cambridgeNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[6])//input")
    private WebElement cambridgeScore;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[2])//input[1]")
    private WebElement toeflYes;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[2])//input[2]")
    private WebElement toeflNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[3])//input[1]")
    private WebElement toeflScore;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[7])//input[1]")
    private WebElement otherYes;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[7])//input[2]")
    private WebElement otherNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[8])//input")
    private WebElement otherScore;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[4])//input[1]")
    private WebElement slepYes;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[4])//input[2]")
    private WebElement slepNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[5])//input")
    private WebElement slepScore;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[6])//input[1]")
    private WebElement placementYes;

    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-8'])[6])//input[2]")
    private WebElement placementNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[7])//input")
    private WebElement placementScore;

    @FindBy(xpath = "((//div[@class='col-md-12 col-sm-12'])[7])//input[1]")
    private WebElement learningCourseYes;

    @FindBy(xpath = "((//div[@class='col-md-12 col-sm-12'])[7])//input[2]")
    private WebElement learningCourseNo;

    @FindBy(xpath = "//input[@placeholder='Hear about our school']")
    private WebElement hearAboutSchool;

    @FindBy(xpath = "((//div[@class='col-md-6 col-sm-6'])[32])//input")
    private WebElement completeHighSchool;

    @FindBy(xpath = "((//div[@class='col-md-6 col-sm-6'])[33])//input")
    private WebElement notCompleteHighSchool;

    @FindBy(xpath = "((//div[@class='col-md-6 col-sm-6'])[34])//input")
    private WebElement vocationalTraining;

    @FindBy(xpath = "((//div[@class='col-md-6 col-sm-6'])[35])//input")
    private WebElement postSecondary;

    @FindBy(xpath = "//input[@placeholder='Describe any special learning needs']")
    private WebElement specialLearningNeeds;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-3'])[1])//input")
    private WebElement friendOrFamily;

    @FindBy(xpath = "((//div[@class='col-md-3 col-sm-3'])[6])//input")
    private WebElement educationFair;

    @FindBy(xpath = "((//div[@class='col-md-5 col-sm-4'])[1])//input")
    private WebElement canadianEduCenter;

    @FindBy(xpath = "((//div[@class='col-md-5 col-sm-4'])[2])//input")
    private WebElement canadianConsulate;

    @FindBy(xpath = "((//div[@class='col-md-3 col-sm-3'])[7])//input")
    private WebElement websiteBtn;

    @FindBy(xpath = "//input[@placeholder='Website']")
    private WebElement website;

    @FindBy(xpath = "((//div[@class='col-md-2 col-sm-2 m-l-50'])[1])//input")
    private WebElement othBtn;

    @FindBy(xpath = "//div[@class='col-md-3 col-sm-3']//input[@placeholder='Other']")
    private WebElement otherField;

    @FindBy(xpath = "//input[@placeholder='Newspaper']")
    private WebElement newspaper;

    @FindBy(xpath = "//input[@placeholder='Magazine']")
    private WebElement magazine;

    public AIEducationGoals (WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public AIEducationGoals clinkOnAddInfoLink() {
        this.AddInfoLink.click();
        return this;
    }

    public AIEducationGoals enterCGrade(Object cGrade) {
       this.currentlyInGrade.sendKeys(String.valueOf(cGrade));
        return this;
    }

    public AIEducationGoals enterAGrade(String aGrade) {
        this.applyForGrade.sendKeys(aGrade);
        return this;
    }

    public AIEducationGoals otherBtn(String obtn) {
        this.otherRadioBtn.sendKeys(obtn);
        return this;
    }

    public AIEducationGoals Other(String oth) {
        this.other.sendKeys(oth);
        return this;
    }

    public AIEducationGoals clickOnYesBtn() {
        this.yesRadioBtn.click();
        return this;
    }

    public AIEducationGoals clickOnNoBtn() {
        this.noRadioBtn.click();
        return this;
    }

    public AIEducationGoals Agency(String agen) {
        this.agency.sendKeys(agen);
        return this;
    }

    public AIEducationGoals AgencyFName(String fName) {
        this.agencyName.sendKeys(fName);
        return this;
    }

    public AIEducationGoals AgencyEmail(String aEmail) {
        this.agencyEmail.sendKeys(aEmail);
        return this;
    }

    public AIEducationGoals AgencyAddress(String aAddress) {
        this.agencyAddress.sendKeys(aAddress);
        return this;
    }

    public AIEducationGoals AgencyCity(String aCity) {
        this.agencyCity.sendKeys(aCity);
        return this;
    }

    public AIEducationGoals AgencyProvince(String aProvince) {
        this.agencyProvince.sendKeys(aProvince);
        return this;
    }

    public AIEducationGoals AgencyCountry(String aCountry) {
        this.agencyCountry.sendKeys(aCountry);
        return this;
    }

    public AIEducationGoals AgencyPostalCode(Object aPostalCode) {
        this.agencyPostalCode.sendKeys(String.valueOf(aPostalCode));
        return this;
    }

    public AIEducationGoals Counsellor(String cName) {
        this.counsellor.sendKeys(cName);
        return this;
    }

    public AIEducationGoals CounsellorEmail(Object cEmail) {
        this.counsellorEmail.sendKeys(String.valueOf(cEmail));
        return this;
    }

    public AIEducationGoals CounsellorPhone(Object cPhone) {
        this.counsellorPhone.sendKeys(String.valueOf(cPhone).trim());
        return this;
    }

    public AIEducationGoals CurrentSchool(String cSchool) {
        this.currentSchool.sendKeys(cSchool);
        return this;
    }

    public AIEducationGoals SchoolWebsite(String sWebsite) {
        this.schoolWebsite.sendKeys(sWebsite);
        return this;
    }

    public AIEducationGoals SeptemberRadioBtn() {
        this.septemberRadioBtn.click();
        return this;
    }

    public AIEducationGoals FebRadioBtn() {
        this.februaryRadioBtn.click();
        return this;
    }

    public AIEducationGoals JulyRadioBtn() {
        this.julyRadioBtn.click();
        return this;
    }

    public AIEducationGoals SelectYear(Object yr) {
        this.year.sendKeys(String.valueOf(yr).trim() + Keys.ENTER);
        return this;
    }

    public AIEducationGoals OthBtn() {
        this.otherBtn.click();
        return this;
    }

    public AIEducationGoals FromDate(String Fromd) {
        this.from.sendKeys(Fromd.trim());
        return this;
    }

    public AIEducationGoals ToDate(String Tod) {
        this.to.sendKeys(Tod.trim());
        return this;
    }

    public AIEducationGoals Othermonth(String oMonth) {
        this.otherMonth.sendKeys(oMonth);
        return this;
    }

    public AIEducationGoals SchoolAttended(String sAttended) {
        this.schoolAttended.sendKeys(sAttended + Keys.ENTER);
        return this;
    }

    public AIEducationGoals CanadianSchool(String canSchool) {
        this.canadianSchool.sendKeys(canSchool);
        return this;
    }

    public AIEducationGoals SchoolGoal(String SGoal) {
        this.schoolGoal.sendKeys(SGoal);
        return this;
    }

    public AIEducationGoals OtherSchoolGoal(String OSGoal) {
        this.otherSchoolGoal.sendKeys(OSGoal);
        return this;
    }

    public AIEducationGoals EngYears(Object EYrs) {
        this.studiedEnglishYears.sendKeys(String.valueOf(EYrs));
        return this;
    }

    public AIEducationGoals ieltsYesBtn() {
        this.ieltsYes.click();
        return this;
    }

    public AIEducationGoals ieltsNoBtn() {
        this.ieltsNo.click();
        return this;
    }

    public AIEducationGoals ieltsRslt(Object ieltsscore) {
        this.ieltsScore.sendKeys(String.valueOf(ieltsscore));
        return this;
    }

    public AIEducationGoals toeflYesBtn() {
        this.toeflYes.click();
        return this;
    }

    public AIEducationGoals toeflNoBtn() {
        this.toeflNo.click();
        return this;
    }

    public AIEducationGoals toeflRslt(Object toeflscore) {
        this.toeflScore.sendKeys(String.valueOf(toeflscore));
        return this;
    }

    public AIEducationGoals ooptYesBtn() {
        this.ooptYes.click();
        return this;
    }

    public AIEducationGoals ooptNoBtn() {
        this.ooptNo.click();
        return this;
    }

    public AIEducationGoals ooptRslt(Object ooptscore) {
        this.ooptScore.sendKeys(String.valueOf(ooptscore));
        return this;
    }

    public AIEducationGoals slepYesBtn() {
        this.slepYes.click();
        return this;
    }

    public AIEducationGoals slepNoBtn() {
        this.slepNo.click();
        return this;
    }

    public AIEducationGoals slepRslt(Object slepscore) {
        this.slepScore.sendKeys(String.valueOf(slepscore));
        return this;
    }

    public AIEducationGoals cambridgeYesBtn() {
        this.cambridgeYes.click();
        return this;
    }

    public AIEducationGoals cambridgeNoBtn() {
        this.cambridgeNo.click();
        return this;
    }

    public AIEducationGoals cambridgeRslt(Object camscore) {
        this.cambridgeScore.sendKeys(String.valueOf(camscore));
        return this;
    }

    public AIEducationGoals placementYesBtn() {
        this.placementYes.click();
        return this;
    }

    public AIEducationGoals placementNoBtn() {
        this.placementNo.click();
        return this;
    }

    public AIEducationGoals placementRslt(Object plascore) {
        this.placementScore.sendKeys(String.valueOf(plascore));
        return this;
    }

    public AIEducationGoals otherYesBtn() {
        this.otherYes.click();
        return this;
    }

    public AIEducationGoals otherNoBtn() {
        this.otherNo.click();
        return this;
    }

    public AIEducationGoals otherRslt(Object otherscore) {
        this.otherScore.sendKeys(String.valueOf(otherscore));
        return this;
    }

    public AIEducationGoals learningCourseYesBtn() {
        this.learningCourseYes.click();
        return this;
    }

    public AIEducationGoals learningCourseNoBtn() {
        this.learningCourseNo.click();
        return this;
    }

    public AIEducationGoals HearAboutSchool(String aboutSchool) {
        this.hearAboutSchool.sendKeys(aboutSchool);
        return this;
    }

    public AIEducationGoals CompleteHighSchool() {
        this.completeHighSchool.click();
        return this;
    }

    public AIEducationGoals NotCompleteHighSchool() {
        this.notCompleteHighSchool.click();
        return this;
    }

    public AIEducationGoals VocationalTraining() {
        this.vocationalTraining.click();
        return this;
    }

    public AIEducationGoals PostSecondary() {
        this.postSecondary.click();
        return this;
    }

    public AIEducationGoals SpecialLearningNeeds(String learningneeds) {
        this.specialLearningNeeds.sendKeys(learningneeds);
        return this;
    }

    public AIEducationGoals FrndOrFamily() {
        this.friendOrFamily.click();
        return this;
    }

    public AIEducationGoals EducationFair() {
        this.educationFair.click();
        return this;
    }

    public AIEducationGoals CanadianEduCenter() {
        this.canadianEduCenter.click();
        return this;
    }

    public AIEducationGoals CanadianConsulate() {
        this.canadianConsulate.click();
        return this;
    }

    public AIEducationGoals WebsiteBtn() {
        this.websiteBtn.click();
        return this;
    }

    public AIEducationGoals Website(String web) {
        this.website.sendKeys(web);
        return this;
    }

    public AIEducationGoals OtBtn() {
        this.othBtn.click();
        return this;
    }

    public AIEducationGoals OtherField(String othfield) {
        this.otherField.sendKeys(othfield);
        return this;
    }

    public AIEducationGoals Newspaper(String paper) {
        this.newspaper.sendKeys(paper);
        return this;
    }

    public AIEducationGoals Magazine(String mag) {
        this.magazine.sendKeys(mag);
        return this;
    }

}
