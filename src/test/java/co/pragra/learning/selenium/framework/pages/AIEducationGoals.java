package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AIEducationGoals {
    WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    @FindBy(xpath = "//input[@placeholder='Currently in grade']")
    private WebElement currentlyInGrade;

    @FindBy(xpath = "//input[@placeholder='Apply for grade']")
    private WebElement applyForGrade ;

    @FindBy(xpath = "//input[@name='2O0']")
    private WebElement otherRadioBtn;

    @FindBy(xpath = "//div[@class='col-md-3 col-sm-3 p-t-25']//input[@placeholder='Other']")
    private WebElement other;

    @FindBy(xpath = "//input[@name='2O1']")
    private WebElement yesRadioBtn;

    @FindBy(xpath = "//input[@name='2O2']")
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

    @FindBy(xpath = "//input[@value='September']")
    private WebElement septemberRadioBtn;

    @FindBy(xpath = "//input[@value='February']")
    private WebElement februaryRadioBtn;

    @FindBy(xpath = "//input[@value='July']")
    private WebElement julyRadioBtn;

    @FindBy(xpath = "//input[@placeholder='Select year']")
    private WebElement year;

    @FindBy(xpath = "//input[@name='0CR']")
    private WebElement otherBtn;

    @FindBy(xpath = "//input[@placeholder='From']")
    private WebElement from;

    @FindBy(xpath = "//input[@placeholder='To']")
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

    @FindBy(xpath = "//input[@name='0CT']")
    private WebElement ieltsYes;

    @FindBy(xpath = "//input[@name='0CU']")
    private WebElement ieltsNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[2])//input")
    private WebElement ieltsScore;

    @FindBy(xpath = "//input[@name='0CX']")
    private WebElement ooptYes;

    @FindBy(xpath = "//input[@name='0CY']")
    private WebElement ooptNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[4])//input")
    private WebElement ooptScore;

    @FindBy(xpath = "//input[@name='0D1']")
    private WebElement cambridgeYes;

    @FindBy(xpath = "//input[@name='0D2']")
    private WebElement cambridgeNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[6])//input")
    private WebElement cambridgeScore;

    @FindBy(xpath = "//input[@name='3J6']")
    private WebElement toeflYes;

    @FindBy(xpath = "//input[@name='3J7']")
    private WebElement toeflNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[3])//input")
    private WebElement toeflScore;

    @FindBy(xpath = "//input[@name='1D0']")
    private WebElement otherYes;

    @FindBy(xpath = "//input[@name='1D1']")
    private WebElement otherNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[8])//input")
    private WebElement otherScore;

    @FindBy(xpath = "//input[@name='1CU']")
    private WebElement slepYes;

    @FindBy(xpath = "//input[@name='1CV']")
    private WebElement slepNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[5])//input")
    private WebElement slepScore;

    @FindBy(xpath = "//input[@name='1CY']")
    private WebElement placementYes;

    @FindBy(xpath = "//input[@name='1CZ']")
    private WebElement placementNo;

    @FindBy(xpath = "((//div[@class='col-md-4 col-sm-4'])[7])//input")
    private WebElement placementScore;

    @FindBy(xpath = "//input[@name='1D2']")
    private WebElement learningCourseYes;

    @FindBy(xpath = "//input[@name='1D3']")
    private WebElement learningCourseNo;

    @FindBy(xpath = "//input[@placeholder='Hear about our school']")
    private WebElement hearAboutSchool;

    @FindBy(xpath = "//input[@name='1D4']")
    private WebElement completeHighSchool;

    @FindBy(xpath = "//input[@name='1D5']")
    private WebElement notCompleteHighSchool;

    @FindBy(xpath = "//input[@name='1D6']")
    private WebElement vocationalTraining;

    @FindBy(xpath = "//input[@name='1D7']")
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

    public AIEducationGoals enterCGrade(String cGrade) {
       this.currentlyInGrade.sendKeys(cGrade);
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

    public AIEducationGoals clickOnYesBtn(String yBtn) {
        this.yesRadioBtn.sendKeys(yBtn);
        return this;
    }

    public AIEducationGoals clickOnNoBtn(String nBtn) {
        this.noRadioBtn.sendKeys(nBtn);
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

    public AIEducationGoals CounsellorPhone(int cPhone) {
        this.counsellorPhone.sendKeys(String.valueOf(cPhone));
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

    public AIEducationGoals SeptemberRadioBtn(String sRadioBtn) {
        this.septemberRadioBtn.sendKeys(sRadioBtn);
        return this;
    }

    public AIEducationGoals FebRadioBtn(String fRadioBtn) {
        this.februaryRadioBtn.sendKeys(fRadioBtn);
        return this;
    }

    public AIEducationGoals JulyRadioBtn(String jRadioBtn) {
        this.julyRadioBtn.sendKeys(jRadioBtn);
        return this;
    }

    public AIEducationGoals SelectYear(int yr) {
        this.year.sendKeys(String.valueOf(yr));
        return this;
    }

    public AIEducationGoals OthBtn(String obtn) {
        this.otherBtn.sendKeys(obtn);
        return this;
    }

    public AIEducationGoals FromDate(String From) {
        this.from.sendKeys(From);
        return this;
    }

    public AIEducationGoals ToDate(String To) {
        this.to.sendKeys(To);
        return this;
    }

    public AIEducationGoals Othermonth(String oMonth) {
        this.otherMonth.sendKeys(oMonth);
        return this;
    }

    public AIEducationGoals SchoolAttended(String sAttended) {
        this.schoolAttended.sendKeys(sAttended);
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

    public AIEducationGoals EngYears(int EYrs) {
        this.studiedEnglishYears.sendKeys(String.valueOf(EYrs));
        return this;
    }

    public AIEducationGoals ieltsYesBtn(String ieltsyes) {
        this.ieltsYes.sendKeys(ieltsyes);
        return this;
    }

    public AIEducationGoals ieltsNoBtn(String ieltsno) {
        this.ieltsNo.sendKeys(ieltsno);
        return this;
    }

    public AIEducationGoals ieltsRslt(double ieltsscore) {
        this.ieltsScore.sendKeys(String.valueOf(ieltsscore));
        return this;
    }

    public AIEducationGoals toeflYesBtn(String toeflyes) {
        this.toeflYes.sendKeys(toeflyes);
        return this;
    }

    public AIEducationGoals toeflNoBtn(String toeflno) {
        this.toeflNo.sendKeys(toeflno);
        return this;
    }

    public AIEducationGoals toeflRslt(double toeflscore) {
        this.toeflScore.sendKeys(String.valueOf(toeflscore));
        return this;
    }

    public AIEducationGoals ooptYesBtn(String ooptyes) {
        this.ooptYes.sendKeys(ooptyes);
        return this;
    }

    public AIEducationGoals ooptNoBtn(String ooptno) {
        this.ooptNo.sendKeys(ooptno);
        return this;
    }

    public AIEducationGoals ooptRslt(double ooptscore) {
        this.ooptScore.sendKeys(String.valueOf(ooptscore));
        return this;
    }

    public AIEducationGoals slepYesBtn(String slepyes) {
        this.slepYes.sendKeys(slepyes);
        return this;
    }

    public AIEducationGoals slepNoBtn(String slepno) {
        this.slepNo.sendKeys(slepno);
        return this;
    }

    public AIEducationGoals slepRslt(double slepscore) {
        this.slepScore.sendKeys(String.valueOf(slepscore));
        return this;
    }

    public AIEducationGoals cambridgeYesBtn(String camyes) {
        this.cambridgeYes.sendKeys(camyes);
        return this;
    }

    public AIEducationGoals cambridgeNoBtn(String camno) {
        this.cambridgeNo.sendKeys(camno);
        return this;
    }

    public AIEducationGoals cambridgeRslt(double camscore) {
        this.cambridgeScore.sendKeys(String.valueOf(camscore));
        return this;
    }

    public AIEducationGoals placementYesBtn(String playes) {
        this.placementYes.sendKeys(playes);
        return this;
    }

    public AIEducationGoals placementNoBtn(String plano) {
        this.placementNo.sendKeys(plano);
        return this;
    }

    public AIEducationGoals placementRslt(double plascore) {
        this.placementScore.sendKeys(String.valueOf(plascore));
        return this;
    }

    public AIEducationGoals otherYesBtn(String otheryes) {
        this.otherYes.sendKeys(otheryes);
        return this;
    }

    public AIEducationGoals otherNoBtn(String otherno) {
        this.otherNo.sendKeys(otherno);
        return this;
    }

    public AIEducationGoals otherRslt(double otherscore) {
        this.otherScore.sendKeys(String.valueOf(otherscore));
        return this;
    }

    public AIEducationGoals learningCourseYesBtn(String courseyes) {
        this.learningCourseYes.sendKeys(courseyes);
        return this;
    }

    public AIEducationGoals learningCourseNoBtn(String courseno) {
        this.learningCourseNo.sendKeys(courseno);
        return this;
    }

    public AIEducationGoals HearAboutSchool(String aboutSchool) {
        this.hearAboutSchool.sendKeys(aboutSchool);
        return this;
    }

    public AIEducationGoals CompleteHighSchool(String cHighSchool) {
        this.completeHighSchool.sendKeys(cHighSchool);
        return this;
    }

    public AIEducationGoals NotCompleteHighSchool(String ncHighSchool) {
        this.notCompleteHighSchool.sendKeys(ncHighSchool);
        return this;
    }

    public AIEducationGoals VocationalTraining(String vtraining) {
        this.vocationalTraining.sendKeys(vtraining);
        return this;
    }

    public AIEducationGoals PostSecondary(String psecondary) {
        this.postSecondary.sendKeys(psecondary);
        return this;
    }

    public AIEducationGoals SpecialLearningNeeds(String learningneeds) {
        this.specialLearningNeeds.sendKeys(learningneeds);
        return this;
    }

    public AIEducationGoals FrndOrFamily(int frndorfamily) {
        this.friendOrFamily.sendKeys(String.valueOf(frndorfamily));
        return this;
    }

    public AIEducationGoals EducationFair(int edfair) {
        this.educationFair.sendKeys(String.valueOf(edfair));
        return this;
    }

    public AIEducationGoals CanadianEduCenter(int caneducentre) {
        this.canadianEduCenter.sendKeys(String.valueOf(caneducentre));
        return this;
    }

    public AIEducationGoals CanadianConsulate(int canconsulate) {
        this.canadianConsulate.sendKeys(String.valueOf(canconsulate));
        return this;
    }

    public AIEducationGoals WebsiteBtn(int webbtn) {
        this.websiteBtn.sendKeys(String.valueOf(webbtn));
        return this;
    }

    public AIEducationGoals Website(String web) {
        this.website.sendKeys(web);
        return this;
    }

    public AIEducationGoals OthBtn(int othbtn) {
        this.othBtn.sendKeys(String.valueOf(othbtn));
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
