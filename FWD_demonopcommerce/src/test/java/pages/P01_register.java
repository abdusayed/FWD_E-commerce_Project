package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Hooks;

public class P01_register {

    WebDriver driver;
    //Hooks hooks;
    //SoftAssert softAssert;

    public P01_register(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(className = "ico-register")
    public WebElement rgBtnTskBar;
    @FindBy(id = "register-button")
    public WebElement rgBtn;
//>>>>>>>>>>>>>>>>>>>>>>
    @FindBy(id = "gender-male")
    public WebElement rgGndrM;
    @FindBy(id = "gender-female")
    public WebElement rgGndrF;

    public void genderRation(String gender)
    {
        switch (gender){
            case "male" :
                rgGndrM.click();
                break;
            case "female" :
                rgGndrF.click();
                break;

            default:
                System.out.println("enter the word \"male\" or \"female\"");
        }
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    @FindBy(id = "FirstName")
    public WebElement rgfrtName;
    @FindBy(id = "LastName")
    public WebElement rglstName;
    @FindBy(id = "FirstName-error")
    public WebElement rgfrtNameError;
    @FindBy(id = "LastName-error")
    public WebElement rglstNameError;

    public void fillFrtandLstNm(String frtname , String lstname)
    {
        rgfrtName.sendKeys(frtname);
        rglstName.sendKeys(lstname);
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public void selectDateOfBirth(String day , String month ,String year)
    {
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthDay\"]  //option [@value="+day+"]")).click();  // from 13 to above
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthMonth\"]  //option [@value="+month+"]")).click();
        driver.findElement(By.xpath("//select[@name=\"DateOfBirthYear\"]  //option [@value="+year+"]")).click();// form 1912
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.

    @FindBy(id = "Company")
    public WebElement rgCompnyName;
    public void fillCompanyName(String name)
    {
        rgCompnyName.sendKeys(name);
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @FindBy(id = "Email")
    public WebElement rgEmail;
    public void fillEmailField(String email)
    {
        rgEmail.sendKeys(email);
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.
    @FindBy(id = "Password")
    public WebElement rgPswrd;
    public void fillPasswordField(String pw)
    {
        rgPswrd.sendKeys(pw);
    }

    @FindBy(id = "ConfirmPassword")
    public WebElement rgConfPswrd;
    public void fillConfPasswordField(String pw)
    {
        rgConfPswrd.sendKeys(pw);
    }
////>>>>>>>>>>>>>>>>>>>>>>>>
    @FindBy(className = "result")
    public WebElement rgSuccess;
    public boolean getColorBtn()
    {
        return rgSuccess.getCssValue("color").equals("rgba(76, 177, 124, 1)");
    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>
    @FindBy(xpath = "//div [@class=\"buttons\"] //a[@href=\"/\"]")
    public WebElement rgContinueBtn;

}
