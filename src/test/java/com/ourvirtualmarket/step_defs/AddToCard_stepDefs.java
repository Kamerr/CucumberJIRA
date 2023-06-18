package com.ourvirtualmarket.step_defs;

import com.ourvirtualmarket.pages.DashboardPage;
import com.ourvirtualmarket.pages.ProductsPage;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AddToCard_stepDefs {
    DashboardPage dashboardPage=new DashboardPage();
    ProductsPage productsPage=new ProductsPage();
    @Given("Go to the url")
    public void go_to_the_url() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("Close the popup")
    public void close_the_popup() {
        dashboardPage.closePopup.click();
    }
    @When("Login with valid credentials")
    public void login_with_valid_credentials() {
        dashboardPage.login();
    }
    @Given("Choose the {string} module")
    public void choose_the_module(String product) {
        dashboardPage.selectTab(product);
    }
    @When("Hover the {string} th. product")
    public void hover_the_th_product(String line) {
        productsPage.selectProduct(line);
    }
    @Then("Check the add to card button is displayed")
    public void check_the_add_to_card_button_is_displayed() {
        productsPage.validateAddToCardIcon();
    }
    @Then("Click the add the card button")
    public void click_the_add_the_card_button() {
        productsPage.addToCard();
    }
    @Then("Hover the shopping basket")
    public void hover_the_shopping_basket() {
        dashboardPage.hoverTheBasket();
    }
    @Then("Check the produck is displayed in the shopping basket")
    public void check_the_produck_is_displayed_in_the_shopping_basket() {
        dashboardPage.validateTheProductIsInTheBasket();
        Assert.assertTrue(productsPage.productText.contains(dashboardPage.productTextInTheBasket));
    }
    @When("Click the {string} th. product")
    public void click_the_th_product(String line) {
        productsPage.chooseProduct(line);
      //  WebElement element = productsPage.chooseProduct(line);
      //  BrowserUtils.clickWithJS(element);
    }

    @Then("Validate add to card button isdisplayed")
    public void validate_add_to_card_button_isdisplayed() {
        Assert.assertTrue(productsPage.addToCardButton.isDisplayed());
    }
    @Then("Validate buy now button isdisplayed")
    public void validate_buy_now_button_isdisplayed() {
        Assert.assertTrue(productsPage.buyNowButton.isDisplayed());
    }
    @Then("Add the product in the shopping basket")
    public void add_the_product_in_the_shopping_basket() {
        productsPage.addToCardButton.click();
    }
    @Then("Order subtotal and close")
    public void order_subtotal_and_close() {
        productsPage.closeButton.click();
    }
    @Then("Validate product size")
    public void validate_product_size() {
        int exp=productsPage.productSize.size();
        int act=productsPage.eklenenUrunSayisi;
        Assert.assertEquals(exp,act);
    }

}
