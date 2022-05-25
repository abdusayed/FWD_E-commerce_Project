package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.asserts.SoftAssert;
import pages.P03_homePage;
import pages.P05_shoppingCart;
//import pages.P04_productPage;

public class D09_ShoppingCartStepDef {

    P05_shoppingCart p05_shoppingCart = new P05_shoppingCart(Hooks.driver);


    @When("user clicks on a rondom product")
    public void userClicksOnARondomProduct() throws InterruptedException {
        Thread.sleep(2000);
        p05_shoppingCart.selectFirstProductAddCartBtn();
    }

    @And("user adds the product to the cart")
    public void userAddsTheProductToTheCart() throws InterruptedException {
        Thread.sleep(2000);
        p05_shoppingCart.productAddCart.click();
    }

    @Then("shopping cart notification message is visible")
    public void theProductIsAddedToTheShoppingCart() throws InterruptedException {
        Thread.sleep(2000);
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(p05_shoppingCart.barNotifySuccess.isDisplayed(),"the Shopping Cart notification message is invisible");
    }



}
