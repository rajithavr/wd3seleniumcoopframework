package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ISPMainPage {
        WebDriver driver;

        @FindBy(xpath="//a[@class='btn ispcloud-login-button']")
        private WebElement userDashboard;

        @FindBy(xpath ="//a[@class='btn teacher-login-button']")
        private WebElement teacherPortal;

        public ISPMainPage(WebDriver driver){
            this.driver =driver;
            PageFactory.initElements(driver,this);
        }
    // On click -UserDashboard
        public UserLoginPage clickOnUserDashboard(){
             this.userDashboard.click();
            return new UserLoginPage(driver) ;
        }
    // On click -Teacher Portal
    public UserLoginPage clickOnTeacherPortal(){
        this.teacherPortal.click();
        Actions action=new Actions(driver);
        action.click(userDashboard)
                .build().perform();
        return new UserLoginPage(driver) ;
    }

}
