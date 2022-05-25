package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.P01_register;
import pages.P02_login;
import pages.P03_homePage;
import pages.P04_wishList;

import java.util.concurrent.TimeUnit;

public class Hooks {
    // define before and after annotations for your driver

    public static WebDriver driver = null;

    @Before
    public static void open_Browser()
    {
        String path ="C:\\Users\\Abdu Sayed\\IdeaProjects\\CucumberMvnSlm\\src\\main\\resources\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",path);

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");

        P01_register p01_register = new P01_register(driver);
        P02_login p02_login =new P02_login(driver);
        P03_homePage p03_homePage = new P03_homePage(driver);
        //P04_wishList p04_wishList = new P04_wishList(driver);
    }

    @After
    public static void close_Browser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
