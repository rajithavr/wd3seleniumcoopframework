package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class GIPlacementandSummaryInfoPage {
   WebDriver driver;
    @FindBy(xpath="(//div[@class='col-md-8 col-sm-8'])[2]//input")
    WebElement Structure1;
    @FindBy(xpath="(//div[@class='col-md-8 col-sm-8'])[3]//input")
    WebElement Listening;
    @FindBy(xpath="(//div[@class='col-md-8 col-sm-8'])[4]//input")
    WebElement Reading;
    @FindBy(xpath="(//div[@class='col-md-8 col-sm-8'])[5]//input")
    WebElement Writing;
    @FindBy(xpath = "(//div[@class='col-md-8 col-sm-8'])[6]//input")
    WebElement Total;
    @FindBy(xpath = "(//div[@class='col-md-8 col-sm-8'])[7]//input")
    WebElement ProposedLevel;
    @FindBy(xpath= "(//div[@class='col-md-8 col-sm-8'])[8]//input")
    WebElement OverwritingLevel;
    @FindBy(xpath="//div[@class='col-md-5 col-sm-4'][1]//input")
    WebElement Retesting;
    @FindBy(xpath= "//div[@class='col-md-7 col-sm-6'][1]//input")
    WebElement ManualPlacement;

    public GIPlacementandSummaryInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void enterStructure(Object Structure1) {

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

     // WebDriverWait wait = new WebDriverWait(driver, 30);

        //this.Structure1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(("//div[@class='col-md-8 col-sm-8'])[2]//input"))));

        //this.Structure1=wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(("//div[@class='col-md-8 col-sm-8'])[2]//input"))));

        //WebDriverWait wait = new WebDriverWait(driver, 20);
        //this.Structure1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@class='col-md-8 col-sm-8'])[2]")));
        //this.Structure1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='col-md-8 col-sm-8'])[2]")));


        //import org.openqa.selenium.JavascriptExecutor;
        //((JavascriptExecutor) driver).executeScript("document.getElementById('ID').style.display='block';");

        //JavascriptExecutor javascript = (JavascriptExecutor) driver;
        //javascript.executeScript("var Structure1 = document.querySelector(By.xpath(\"(//div[@class='col-md-8 col-sm-8'])[2]\")))");
      //  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.Structure1.sendKeys(String.valueOf(Structure1));

    }
    public void enterListening(Object Listening) {

        this.Listening.sendKeys(String.valueOf(Listening));

    }
    public void enterReading(Object Reading) {

        this.Reading.sendKeys(String.valueOf(Reading));

    }

    public void enterWriting(Object Writing) {

        this.Writing.sendKeys(String.valueOf(Writing));

    }
    public void enterOverwrittingLevel(Object OverWritting) {

        this.OverwritingLevel.sendKeys(String.valueOf(OverWritting));

    }

    public GIPlacementandSummaryInfoPage enterRetesting(Object Retesting) {

        this.Retesting.sendKeys(String.valueOf(Retesting));
        return this;

    }
    public void enterManualPlacement(Object ManualPlacement) {

        this.ManualPlacement.sendKeys(String.valueOf(ManualPlacement));

    }



}





