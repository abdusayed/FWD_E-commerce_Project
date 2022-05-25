package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P02_login {
    WebDriver driver;

    public P02_login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }


    @FindBy(className = "ico-login")
    public WebElement lgTskBar;

//>>>>>>>>>>>>>>>>>>>>>>>>>>>.
    @FindBy(id = "Email")
    public WebElement lgEmail;
    @FindBy(id = "Password")
    public WebElement lgPswrd;

    public void fillsLgEmailPswrd(String email, String password){
        this.lgEmail.sendKeys(email);
        this.lgPswrd.sendKeys(password);
    }
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @FindBy(css = "div[class=\"buttons\"] button[type=\"submit\"]")
    public WebElement lgBtn;
    //>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @FindBy(className = "ico-account")
    public WebElement myAccTskBar;




}
