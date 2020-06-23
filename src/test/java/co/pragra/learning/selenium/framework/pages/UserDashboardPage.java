package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashboardPage {
    WebDriver driver;

    @FindBy(xpath ="(//div[@class='panel-heading panel-blue'][1])[1]")
    private WebElement students;

    @FindBy(xpath ="(//div[@class='panel-heading panel-blue'][1])[2]")
    private WebElement homeStays;

    @FindBy(xpath ="(//div[@class='panel-heading panel-blue'][1])[3]")
    private WebElement agents;

    @FindBy(xpath ="(//div[@class='panel-heading panel-blue'][1])[4]")
    private WebElement classes;

    @FindBy(xpath ="(//div[@class='panel-heading panel-blue'][1])[5]")
    private WebElement attendance;

    @FindBy(xpath ="(//div[@class='panel-heading panel-blue'][1])[6]")
    private WebElement letters;

    @FindBy(xpath ="(//div[@class='panel-heading panel-blue'][1])[7]")
    private WebElement reports;

    @FindBy(xpath ="(//div[@class='panel-heading panel-blue'][1])[8]")
    private WebElement settings;

    @FindBy(xpath ="(//div[@class='panel-heading panel-blue'][1])[9]")
    private WebElement auditLog;

    @FindBy(xpath ="(//div[@class='panel-heading panel-blue'][1])[10]")
    private WebElement integrations;

    @FindBy(xpath ="(//div[@class='panel-heading panel-blue'][1])[11]")
    private WebElement classGenerator;

    public UserDashboardPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }
    // On click -Students
    public UserDashboardPage clickOnStudents(){
        this.students.click();
        return new UserDashboardPage(driver);
    }
    // On click -HomeStays
    public UserDashboardPage clickOnHomeStays(){
        this.homeStays.click();
        return new UserDashboardPage(driver);
    }

}
