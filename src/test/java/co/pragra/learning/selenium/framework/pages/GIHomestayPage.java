package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GIHomestayPage {
    WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    //***********************Home-Stay Section by Harleen and Uday**************************************//

    @FindBy(xpath = "//label[@class='label-above hs-required-note ng-binding ng-isolate-scope']")
    private WebElement Homestaysection;
    @FindBy(xpath ="((//div[@class=\"col-md-6 col-sm-6\"])[52])//input" )
    private WebElement homestayRequired;
    @FindBy(xpath = "((//div[@class=\"col-md-6 col-sm-6\"])[54])//input")
    private WebElement anotherHomestay;
    @FindBy(xpath="((//div[@class=\"col-md-6 col-sm-6\"])[53])//input")
    private WebElement homestayCoordinator;

    public GIHomestayPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void scrollpage()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,700)", "");

    }
    public GIHomestayPage HomestaySection()
    {
        Actions actions = new Actions(driver);
        actions.moveToElement(Homestaysection).moveToElement(Homestaysection).click().build().perform();
        return this;
    }



    public void enterHomestayRequired(String homestayReqd)
    {
        this.homestayRequired.sendKeys(homestayReqd.trim()+ Keys.ENTER);
    }
    public void enteranotherHomestayRequired(String anotherhomestayReqd)
    {
        this.anotherHomestay.sendKeys(anotherhomestayReqd.trim()+Keys.ENTER);
    }
    public void enterHomestayCoordinator(String homestayCoordinator)
    {
        this.homestayCoordinator.sendKeys(homestayCoordinator.trim());
    }
}
