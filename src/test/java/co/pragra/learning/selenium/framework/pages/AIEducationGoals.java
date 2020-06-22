package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AIEducationGoals {
    WebDriver driver;
    JavascriptExecutor jse = (JavascriptExecutor) driver;

    @FindBy(xpath = "//input[@placeholder='Currently in grade']")
    private WebElement currentlyInGrade;

    @FindBy(xpath = "//input[@placeholder='Apply for grade']")
    private WebElement applyForGrade ;








}
