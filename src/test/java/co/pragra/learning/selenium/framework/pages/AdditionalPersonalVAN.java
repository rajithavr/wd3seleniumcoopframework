package co.pragra.learning.selenium.framework.pages;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdditionalPersonalVAN {
    WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    @FindBy(xpath="//input[@id='StdStatusField-selectized']")
    private WebElement status;

    @FindBy(xpath ="(//div[@class='selectize-control ng-isolate-scope ng-pristine ng-valid single'])[2]//input")
    private WebElement reason;

}
