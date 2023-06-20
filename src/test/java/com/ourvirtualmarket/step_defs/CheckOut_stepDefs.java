package com.ourvirtualmarket.step_defs;

import com.ourvirtualmarket.pages.*;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.assertj.core.api.SoftAssertions;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class CheckOut_stepDefs  {
    CheckOutPage checkOutPage = new CheckOutPage();
    SuccessPage successPage=new SuccessPage();
ProductPage productPage=new ProductPage();
    DashboardPage dashBoardPage=new DashboardPage();
    QuickViewPage quickViewPage=new QuickViewPage();

    SoftAssertions softAssertions = new SoftAssertions();

    @Then("The user click product")
    public void theUserHoverProduct(){
        BrowserUtils.waitForVisibility(dashBoardPage.product1,3);
        BrowserUtils.hover(dashBoardPage.product1);
    }

    @Given("The user click buyNow button")
    public void theUserClickBuyNowButton() {

        Driver.get().navigate().to("https://ourvirtualmarket.com/index.php?route=product/product&product_id=7487326");
        BrowserUtils.waitFor(3);
        productPage.buyNow.click();
    }

    @Then("The user should be able to see Checkout text")
    public void theUserShouldBeAbleToSeeCheckoutText() {
        Assert.assertTrue(checkOutPage.getCheckoutText().isDisplayed());
    }
        @Then("The user should be able to click I want to use an existing address")
    public void theUserSouldBeAbleToClick(){
        Assert.assertTrue(checkOutPage.BillingDetails.isDisplayed());
    }

    @And("The user should be able to click Billing Continue button")
    public void theUserShouldBeAbleToClick() {
        BrowserUtils.waitFor(3);
        checkOutPage.billingContinue.click();
    }

  @Then("The user should be able to click  delivery I want to use an existing address")
    public void theUserShouldBeAbleToClickDeliveryIWantToUseanExistingAddress(){
        BrowserUtils.waitForVisibility(checkOutPage.getDeliveryExistingAddress(),3);
        checkOutPage.getDeliveryExistingAddress().click();
  }

    @And("The user should be able to click Delivery Continue Button")
    public void theUserShouldBeAbleToClickDeliveryContinueButton(){

        checkOutPage.getDeliveryContinueButton().click();
    }
   // @Then ("The user should be able to click Fla$5.00t Shipping Rate-$5.00")
//    public void theUserShouldBeAbleToClickFlaShippingRate(){
//        BrowserUtils.waitForVisibility(checkOutPage.getDeliveryflat(),3);
//        checkOutPage.getDeliveryflat().click();
//    }
    @And("The user should be able to enter Delivery Method Add Comments About Your Order")
    public void andTheUserShouldBeAbleToEnterDeliveryAddCommentsAboutYourOrder(){
        BrowserUtils.waitForVisibility(checkOutPage.getDeliveryAddComment(),3);
        checkOutPage.getDeliveryAddComment().sendKeys("bla bla bla");
    }
    @And ("The user should be able to click Delivery Method Continue")
    public void theUserShouldBeAbleToClickDeliveryMethodContinue(){
        checkOutPage.getDeliveryMethodContinue().click();
    }
    @Then("The user should be able to click Cash On Delivery")
    public void theUserShouldBeAbleToClickCashOnDelivery(){
        BrowserUtils.waitForVisibility(checkOutPage.getCashOnDelivery(),3);
        checkOutPage.getCashOnDelivery().click();
    }
    @And("The user should be able to enter Payment Method Add Comments About Your Order")
    public void andTheUserShouldBeAbleToEnterPaymentAddCommentsAboutYourOrder(){
        BrowserUtils.waitForVisibility(checkOutPage.getPaymentAddComment(),3);
        checkOutPage.getPaymentAddComment().sendKeys("bla bla bla");
    }
    @And ("The user should be able to click I have read and agree to the Terms & Conditions")
    public void theUserShouldBeAbleToClickIHaveReadAndAgreeToTheTermsConditions(){
        checkOutPage.getTermsConditions().click();
    }
    @And("The user should be able to click Continue")
    public void theUserShouldBeAbleToClickContinue(){
        BrowserUtils.waitForVisibility(checkOutPage.getPaymentContinue(),3);
        checkOutPage.getPaymentContinue().click();
    }
    @And("The user should be able to see Total")
    public void theUserShouldBeAbleToSeeTotal(){
        BrowserUtils.waitForVisibility(checkOutPage.getTotal(),3);
        checkOutPage.getTotal().isDisplayed();
    }
    @And("The user should be able to click Confirm Order button")
    public void theUserShouldBeAbleToClickConfirmOrderBtton(){
        BrowserUtils.waitForVisibility(checkOutPage.getConfirmOrder(),3);
        checkOutPage.getConfirmOrder();
        Driver.get().navigate().to("https://ourvirtualmarket.com/index.php?route=checkout/success");
    }
    @And ("The user should be able to see  Your order has been placed!")
  public void theUserShouldBeAbleToSeeYourOrderHasBeenPlaced(){
        Assert.assertTrue(successPage.getIsSuccessfull().isDisplayed());
    }
    @And ("The user should be able to Success Page Continue Button")
    public void theUserShouldBeAbleToSuccessPageContinueButton(){
        successPage.getSuccessContinue().click();
    }



}