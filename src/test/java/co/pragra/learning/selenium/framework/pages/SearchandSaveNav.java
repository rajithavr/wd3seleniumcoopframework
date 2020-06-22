package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchandSaveNav {

    WebDriver driver;

    @FindBy(id = "globalSearchStudent")
    private WebElement topsearch;

    @FindBy(xpath="//tr[@class=\"active\"]/td")
    private WebElement firstRow;

    @FindBy(xpath="//a[@ng-click='$root.newStudent()']")
    private WebElement addNewStudent;

   @FindBy(xpath="//a[@ng-click='$root.updateStudent()']")
   private WebElement save;

public SearchandSaveNav(WebDriver driver)
{
    this.driver =driver;
    PageFactory.initElements(driver,this);
}
//Clicking the search textbox
    public void clickTopSearch() {
        topsearch.click();

    }
// Searching student by clicking first record
    public void clickFirstSearch() {
      firstRow .click();

    }

    //click on addNewStudents

    public void clickaddnewstudents()
    {
      addNewStudent.click();

    }

    //click to SaveStudent

    public void clickonSave()
    {
        save.click();
    }




}


