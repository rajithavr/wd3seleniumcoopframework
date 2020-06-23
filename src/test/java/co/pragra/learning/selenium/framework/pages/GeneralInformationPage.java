package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralInformationPage {
    WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    @FindBy(xpath="//input[@id='StdStatusField-selectized']")
    private WebElement status;

    @FindBy(xpath ="(//div[@class='selectize-control ng-isolate-scope ng-pristine ng-valid single'])[2]//input")
    private WebElement reason;

    @FindBy(xpath="//input[@id='WeeksField']")
    private WebElement weeks;

    @FindBy(xpath="//div[@class='col-md-2 col-sm-2']/input")
    private WebElement esis_ID;

    @FindBy(xpath="//input[@id='checkIfStudentIsActiveField']")
    private WebElement active;

    @FindBy(xpath="//input[@id='fName']")
    private WebElement fName;

    @FindBy(xpath="//input[@id='lName']")
    private WebElement lName;

    @FindBy(xpath="//input[@id='Nickname']")
    private WebElement nickName;

    @FindBy(xpath="//input[@id='MiddleName']")
    private WebElement middleName;

    @FindBy(xpath="//input[@id='studentCell']")
    private WebElement studentCell;

    @FindBy(xpath="//input[@id='stdPhone']")
    private WebElement studentPhone;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[6]//input)")
    private WebElement dateofbirth;

    @FindBy(xpath="//input[@id='Gender-selectized']")//input[@id='Gender-selectized']
    private WebElement gender;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[7])//input")
    private WebElement birthCountry;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[8])//input")
    private WebElement birthCity;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[9])//input")
    private WebElement citizenship;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[10])//input")
    private WebElement language;


    public GeneralInformationPage (WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    public GeneralInformationPage enterStatus(String Status){

        this.status.sendKeys(Status+ Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enterReason(String reason){
        this.reason.sendKeys(reason.trim()+ Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enterESIS_ID(Object esis_id){
        this.esis_ID.sendKeys (String.valueOf(esis_id));
        return this;
    }
    public GeneralInformationPage isActive(Object activ){
        this.active.sendKeys (String.valueOf(activ));
        return this;
    }
    public GeneralInformationPage enterweeks(Object weeksfield){
        this.weeks.sendKeys (String.valueOf(weeksfield));
        return this;
    }
    public GeneralInformationPage enterFname(String fname){
        this.fName.sendKeys(fname.trim());
        return this;
    }
    public GeneralInformationPage enterLname(String lname){
        this.lName.sendKeys(lname.trim());
        return this;
    }
    public GeneralInformationPage enterNickname(String nname){
        this.nickName.sendKeys(nname.trim());
        return this;
    }
    public GeneralInformationPage enterMiddlename(String mname){
        this.middleName.sendKeys(mname.trim());
        return this;
    }
    public GeneralInformationPage enterstudentCell(Object studentcell){
        this.studentCell.sendKeys(String.valueOf(studentcell));
        return this;
    }
    public GeneralInformationPage enterstudentPhone(Object studentphone){
        this.studentPhone.sendKeys(String.valueOf(studentphone));
        return this;
    }
    public GeneralInformationPage enterDOB(String dob){
        this.dateofbirth.sendKeys(dob.trim());
        return this;
    }
    public GeneralInformationPage enterGender(String gend){
        this.gender.sendKeys(gend.trim()+ Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enterbirthcountry(String birthcountry){
        this.birthCountry.sendKeys(birthcountry.trim()+ Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enterbirthcity(String birthcity){
        this.birthCity.sendKeys(birthcity.trim());
        return this;
    }
    public GeneralInformationPage enterCitizenship(String citizen){
        this.citizenship.sendKeys(citizen.trim()+ Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enterlanguage(String lang){
        this.language.sendKeys(lang.trim()+ Keys.ENTER);
        return this;
    }


//-----------------------------------------------------------------------------------------------------------------

  @FindBy(xpath ="((//div[@class=\"col-md-6 col-sm-6\"])[52])//input" )
  private WebElement homestayRequired;
  @FindBy(xpath = "((//div[@class=\"col-md-6 col-sm-6\"])[54])//input")
  private WebElement anotherHomestay;
  @FindBy(xpath="((//div[@class=\"col-md-6 col-sm-6\"])[53])//input")
  private WebElement homestayCoordinator;






  public void enterHomestayRequired(String homestayReqd)
  {
    this.homestayRequired.sendKeys(homestayReqd.trim());
  }
  public void enteranotherHomestayRequired(String anotherhomestayReqd)
  {
    this.anotherHomestay.sendKeys(anotherhomestayReqd.trim());
  }
  public void enterHomestayCoordinator(String homestayCoordinator)
  {
    this.homestayCoordinator.sendKeys(homestayCoordinator.trim());
  }

  public void scrollpage() {
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,1500)", "");
  }










}

