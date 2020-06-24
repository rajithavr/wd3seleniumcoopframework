package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AIMedicalInfoPage {
    WebDriver driver;
    @FindBy(xpath = "//input[@type='name' and @placeholder='Parent/Agent Email']")
    WebElement ParentAgent;

    public AIMedicalInfoPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}

