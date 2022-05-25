package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import stepDefinitions.Hooks;

public class P04_wishList {

    WebDriver driver;
    //P03_homePage p03_homePage = new P03_homePage(Hooks.driver);

    public P04_wishList(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "div[class=\"bar-notification success\"]")
    public WebElement barNotifySuccess;
    @FindBy(css = "span[class=\"wishlist-qty\"]")
    public WebElement numOfwishlist;

    public void selectThirdProductWishBtn()
    {
        driver.findElements(By.xpath("//button[@class=\"button-2 add-to-wishlist-button\"]")).get(2).click();
    }
    public int getNumOfwishlist()
    {
        String str = numOfwishlist.getText().replaceAll("[^0-9]" , "");
        return Integer.parseInt(str);
    }


}
