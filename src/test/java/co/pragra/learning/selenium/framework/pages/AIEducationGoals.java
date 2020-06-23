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
}
