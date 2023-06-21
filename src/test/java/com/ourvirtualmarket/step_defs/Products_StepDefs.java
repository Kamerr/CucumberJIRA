package com.ourvirtualmarket.step_defs;

import com.ourvirtualmarket.pages.ProductPage;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Products_StepDefs {

    ProductPage productPage = new ProductPage();

    @When("The user should be able to select {string} category")
    public void theUserShouldBeAbleToSelectFrom(String category) {
        productPage.selectTheCategories(category);
    }

    @When("The user should be able to select {string} LED-backlit LCD TV \" product")
    public void the_user_should_be_able_to_select_led_backlit_lcd_tv_product(String product) {
        productPage.selectedProduct(product);
    }

    @Then("The user Should be able to click ADD TO COMPARE type")
    public void theUserShouldBeAbleToClickADDTOCOMPAREType() {
        productPage.clickAddToCompareType();
    }

    @And("The user should take success message: {string} LED-backlit LCD TV to your product comparison!\"")
    public void theUserShouldTakeSuccessMessageLEDBacklitLCDTVToYourProductComparison(String message) {
        String expectedMessage = message;
        String actualMessage = productPage.messageSuccess.getText();
        Assert.assertTrue(actualMessage.contains(expectedMessage));
        Driver.get().navigate().back();
    }

    @When("The user Should be able to click COMPARE type")
    public void theUserShouldBeAbleToClickCOMPAREType() {
        productPage.compareTypeInTheProductPage();
    }

}