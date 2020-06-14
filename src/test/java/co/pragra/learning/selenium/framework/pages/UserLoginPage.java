package co.pragra.learning.selenium.framework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserLoginPage {

    WebDriver driver;

    @FindBy(name="_username")
    private WebElement username;
    @FindBy(name="_password")
    private WebElement password;
    @FindBy(xpath="//input[@class='btn btn-lg btn-red btn-block']")
     private WebElement loginbtn;

    public UserLoginPage(WebDriver driver){
    this.driver =driver;
    PageFactory.initElements(driver,this);
    }

    public UserLoginPage enterUsername(String email){
       this.username.sendKeys(email.trim());
       return this;
    }
    public UserLoginPage enterPassword(String pwd){
       this.password.sendKeys(pwd.trim());
       return this;
    }
    public UserLoginPage loginbtnenter(){
       // this.loginbtn.click();
       Actions action=new Actions(driver);
       action.moveToElement(loginbtn).click().build().perform();
       return new UserLoginPage(driver) ;
    }
}
