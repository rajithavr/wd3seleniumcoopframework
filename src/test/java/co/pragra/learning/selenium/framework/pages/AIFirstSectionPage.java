package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AIFirstSectionPage {
    WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    @FindBy(xpath = "//a[text()='Additional Information']")
    public WebElement AddInfoLink;
@FindBy(css ="[name='studentForm'] div:nth-child(1)>div:nth-child(1) div:nth-child(1) input")
WebElement citizenship;
@FindBy(xpath ="//input[@placeholder='Parent/Agent Email']")
WebElement parentAgent;
@FindBy(xpath = "//input[@placeholder='Who should the school Invoice?']")
WebElement schoolInvoice;
@FindBy(xpath="//input[@placeholder='What email address should the Invoice be sent to?']")
WebElement emailInvoice;
@FindBy(xpath="//input[@placeholder='Method of interview']")
WebElement MethodInterview;
@FindBy(xpath="//input[@placeholder='I.D.']")
WebElement iD;
@FindBy(xpath="//input[@placeholder='Social Media']")
WebElement socialMedia;
@FindBy(xpath = "//input[@placeholder='I.D of Social Media']")
WebElement iDSocialMedia;
@FindBy(xpath="//div[@class='row']//fieldset/legend[text()='Medical Information']")
WebElement medicalInformationSection;

    public AIFirstSectionPage(WebDriver driver)
    {
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public AIFirstSectionPage clinkOnAddInfoLink() {
        this.AddInfoLink.click();
        return this;
    }
    public AIFirstSectionPage enterCitizenshipp(String Citizenship) {

        this.citizenship.sendKeys(Citizenship+ Keys.ENTER);
        return this;

    }
    public AIFirstSectionPage enterParentAgent(String ParentAgent)
    {
        this.parentAgent.sendKeys(ParentAgent+ Keys.ENTER);
        return this;
    }
    public AIFirstSectionPage enterSchoolInvoice(String schoolInvoice)
    {
        this.schoolInvoice.sendKeys(schoolInvoice+ Keys.ENTER);
        return this;
    }
    public AIFirstSectionPage enterEmailInvoice(String emailInvoice)
    {
        this.emailInvoice.sendKeys(emailInvoice+ Keys.ENTER);
        return this;
    }
    public AIFirstSectionPage enterMethodInterview(String MethodInterview)
    {
        this.MethodInterview.sendKeys(MethodInterview+ Keys.ENTER);
        return this;
    }
    public AIFirstSectionPage enteriD(Object iD)
    {
        this.iD.sendKeys(iD.toString()+ Keys.ENTER);
        return this;
    }
    public AIFirstSectionPage entersocialMedia(String socialMedia)
    {
        this.socialMedia.sendKeys(socialMedia+ Keys.ENTER);
        return this;
    }
    public AIFirstSectionPage enteriDSocialMedia(Object iDSocialMedia)
    {
        this.iDSocialMedia.sendKeys(iDSocialMedia.toString()+ Keys.ENTER);
        return this;
    }

    public AIFirstSectionPage medicalInfoSection()
    {
        this.medicalInfoSection();

        Actions action=new Actions(driver);
        action.moveToElement(medicalInformationSection).build().perform();
return this;
    }
}