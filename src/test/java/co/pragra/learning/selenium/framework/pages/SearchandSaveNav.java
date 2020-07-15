package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class SearchandSaveNav {

    WebDriver driver;

//    @FindBy(xpath = "((//div[@class='col-md-8 col-sm-9 p-t-8 input-group inner-addon left-addon'])[1])/i[1]")
//    private WebElement arrow;

    @FindBy(xpath = "//input[@id='globalSearchStudent']")
    private WebElement searchBar;

    @FindBy(xpath = "//div[@class='dropdown-menu table-bootstrap3-typeahead']")
    private WebElement dropDown;

//    @FindBy(xpath="//tr/td[text()='117']")
//    private WebElement firstRow;

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
    public SearchandSaveNav searchStudent(String stuName) {
        WebDriverWait wait = new WebDriverWait(driver,25);
        wait.until(ExpectedConditions.elementToBeClickable(searchBar));
        searchBar.click();
        this.searchBar.sendKeys(stuName);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        Actions action = new Actions(driver);
        action.moveToElement(dropDown).sendKeys(Keys.ENTER).build().perform();
        return this;
    }


// Searching student by clicking first record
//    public void clickFirstSearch() {
//      firstRow .click();

 //   }

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


