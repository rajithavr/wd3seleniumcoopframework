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

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[11])//input")
    private WebElement specialProjectgrp;

    @FindBy(xpath="(//div[@class='col-md-6'])//input")
    private WebElement studentgrpContact;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[12])//input")
    private WebElement studentAttribute;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[13])//input")
    private WebElement saudiType;

    @FindBy(xpath="(//div[@class='col-md-6 col-sm-6'])[14]//input")
    private WebElement academicSituation;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[15])//input")
    private WebElement studentEmail;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[16])//input")
    private WebElement studentsecEmail;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[17])//input")
    private WebElement studentthirdEmail;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[18])//input")
    private WebElement maritalStatus;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[19])//input")
    private WebElement PEN;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-12']//input)[3])")
    private WebElement group;

    @FindBy(xpath="//input[@id='memberOfGroupField-selectized']")
    private WebElement memberofGroup;

    //@FindBy(xpath="//input[@id='appRcvDateField']")
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[20])//input")
    private WebElement appRecDate;

    @FindBy(xpath="//selectize[@id='stdChoiceField']")
    private WebElement studentChoice;
    private WebElement session;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[23])//input")
    private WebElement progName;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[24])//input")
    private WebElement resident;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[25])//input")
    private WebElement eduCode;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[26])//input")

    private WebElement campus;

    @FindBy(xpath=" (//div[@class='col-md-3 col-sm-3']//input)[8]")
    private WebElement GPI;

    private WebElement IEP_flag;

    @FindBy(xpath="//div[@class='col-md-6 col-sm-3']//input")
    private WebElement courses;
    @FindBy(xpath="(((//div[@class='col-md-6 col-sm-6'])[46])//input)[1]")
    private WebElement FTE1;
    @FindBy(xpath="(((//div[@class='col-md-6 col-sm-6'])[46])//input)[2]")
    private WebElement FTE2;
    @FindBy(xpath="(((//div[@class='col-md-6 col-sm-6'])[46])//input)[3]")
    private WebElement FTE;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[47])//input")
    private WebElement TOEFL;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[48])//input")
    private WebElement IELTS;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[49])//input")
    private WebElement division;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[50])//input")
    private WebElement grade;
    private WebElement cls;

    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[29])//input")
    private WebElement firstenrolled;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[30])//input")
    private WebElement paidTo;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[31])//input")
    private WebElement schoolStartDate;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[32])//input")
    private WebElement schoolEndDate;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[33])//input")
    private WebElement tutionStartDate;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[34])//input")
    private WebElement tutionEndDate;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[35])//input")
    private WebElement districtLastDate;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[36])//input")
    private WebElement studentAddress;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[37])//input")
    private WebElement secAddress;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[38])//input")
    private WebElement studentCity;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[39])//input")
    private WebElement studentProvince;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[40])//input")
    private WebElement studentCountry;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[41])//input")
    private WebElement studentPostal;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[42])//input")
    private WebElement university;
    @FindBy(xpath="((//div[@class='col-md-6 col-sm-6'])[43])//input")
    private WebElement withParents;


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
    public GeneralInformationPage enterspecialProjectgrp(String projgrp){
        this.specialProjectgrp.sendKeys(projgrp.trim()+Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enterstudentgrpContact(Object stdgrpcontact){
        this.studentgrpContact.sendKeys(String.valueOf(stdgrpcontact));
        return this;
    }
    public GeneralInformationPage enterstudentAttribute(String attr){
        this.studentAttribute.sendKeys(attr.trim()+Keys.ENTER);
        return this;
    }
    public GeneralInformationPage entersaudiType(String stype){
        this.saudiType.sendKeys(stype.trim()+Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enteracademicSituation(String academicsitu){
        this.academicSituation.sendKeys(academicsitu.trim()+Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enterstudentEmail(String email1){
        this.studentEmail.sendKeys(email1.trim());
        return this;
    }
    public GeneralInformationPage enterstudentsecEmail(String email2){
        this.studentsecEmail.sendKeys(email2.trim());
        return this;
    }
    public GeneralInformationPage enterstudentthirdEmail(String email3){
        this.studentthirdEmail.sendKeys(email3.trim());
        return this;
    }
    public GeneralInformationPage entermaritalStatus(String maritalstatus){
        this.maritalStatus.sendKeys(maritalstatus.trim()+Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enterPEN(Object pen){
        this.PEN.sendKeys(String.valueOf(pen));
        return this;
    }
    public GeneralInformationPage isGroup(Object grp){
        this.group.sendKeys (String.valueOf(grp));
        return this;
    }
    public GeneralInformationPage entermemberofGroup(String membergroup){
        this.memberofGroup.sendKeys(membergroup.trim()+Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enterappRecDate(String appdt){
        this.appRecDate.sendKeys(appdt.trim());
        return this;
    }
    public GeneralInformationPage enterstudentChoice(String stdchoice){
        this.studentChoice.sendKeys(stdchoice.trim()+Keys.ENTER);
        return this;
    }

    //session
    public GeneralInformationPage enterprogName(String prgname){
        this.progName.sendKeys(prgname.trim()+Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enterresident(String resid){
        this.resident.sendKeys(resid.trim()+Keys.ENTER);
        return this;
    }
    public GeneralInformationPage entereduCode(String educode){
        this.eduCode.sendKeys(educode.trim()+Keys.ENTER);
        return this;
    }

    public GeneralInformationPage enterGPI(Object gpi){
        this.GPI.sendKeys(String.valueOf(gpi));
        return this;
    }
    public GeneralInformationPage enterCourses(String course){
        this.courses.sendKeys(course.trim()+Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enterFTE1(Object fte1){
        this.FTE1.sendKeys(String.valueOf(fte1));
        return this;
    }
    public GeneralInformationPage enterFTE2(Object fte2){
        this.FTE2.sendKeys(String.valueOf(fte2));
        return this;
    }
    public GeneralInformationPage enterFTE(Object fte){
        this.FTE.sendKeys(String.valueOf(fte));
        return this;
    }
    public GeneralInformationPage enterTOEFL(Object toefl){
        this.TOEFL.sendKeys(String.valueOf(toefl));
        return this;
    }
    public GeneralInformationPage enterIELTS(Object ielts){
        this.IELTS.sendKeys(String.valueOf(ielts));
        return this;
    }
    public GeneralInformationPage enterDivision(String div){
        this.division.sendKeys(div.trim());
        return this;
    }
    public GeneralInformationPage enterGrade(String grad){
        this.grade.sendKeys(grad.trim());
        return this;
    }

    public GeneralInformationPage enterfirstenrolled(String enrolldt){
        this.firstenrolled.sendKeys(enrolldt.trim());
        return this;
    }
    public GeneralInformationPage enterpaidTo(String paidto){
        this.paidTo.sendKeys(paidto.trim());
        return this;
    }
    public GeneralInformationPage enterschoolStartDate(String schoolstartdt){
        this.schoolStartDate.sendKeys(schoolstartdt.trim());
        return this;
    }
    public GeneralInformationPage enterschoolEndDate(String schoolenddt){
        this.schoolEndDate.sendKeys(schoolenddt.trim());
        return this;
    }
    public GeneralInformationPage entertutionStartDate(String tutionstartdt){
        this.tutionStartDate.sendKeys(tutionstartdt.trim());
        return this;
    }
    public GeneralInformationPage entertutionEndDate(String tutionenddt){
        this.tutionEndDate.sendKeys(tutionenddt.trim());
        return this;
    }
    public GeneralInformationPage enterdistrictLastDate(String dstlastddt){
        this.districtLastDate.sendKeys(dstlastddt.trim());
        return this;
    }
    public GeneralInformationPage entersecAddress(String secadd){
        this.secAddress.sendKeys(secadd.trim());
        return this;
    }
    public GeneralInformationPage enterstudentCity(String stdcity){
        this.studentCity.sendKeys(stdcity.trim());
        return this;
    }
    public GeneralInformationPage enterstudentProvince(String stdprov){
        this.studentProvince.sendKeys(stdprov.trim());
        return this;
    }
    public GeneralInformationPage enterstudentCountry(String stdcounty){
        this.studentCountry.sendKeys(stdcounty.trim()+Keys.ENTER);
        return this;
    }
    public GeneralInformationPage enterstudentPostal(String stdpostal){
        this.studentPostal.sendKeys(stdpostal.trim());
        return this;
    }
    public GeneralInformationPage enteruniversity(String univ){
        this.university.sendKeys(univ.trim()+Keys.ENTER);
        return this;
    }
    public GeneralInformationPage iswithParents(Object iswithpar){
        this.withParents.sendKeys (String.valueOf(iswithpar));
        return this;
    }

}


