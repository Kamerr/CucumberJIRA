package com.ourvirtualmarket.step_defs;

import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.pages.QvPage;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class QVStepDefs {
    QvPage qvPage = new QvPage();
    LoginPage loginPage = new LoginPage();

    Actions actions;

    @Given(": user used the quick view feature")
    public void userUsedTheQuickViewFeature() throws InterruptedException {
BrowserUtils.clickWithJS(qvPage.homebutton);
BrowserUtils.clickWithJS(loginPage.popoupClose);

            qvPage.hoverProduct(1);
    }


    @When(": user added new product to shopping cart")
    public void userAddedNewProductToShoppingCart() {
        BrowserUtils.clickWithJS(qvPage.quickview.get(0));
            Driver.get().switchTo().frame(0);
            BrowserUtils.clickWithJS(qvPage.addToCart);
            Driver.get().switchTo().defaultContent();
            qvPage.closeButton.click();

    }

    @Then(": price updated automatically")
    public void priceUpdatedAutomatically() {

    }

    @And(": user secon product to edit")
    public void userSeconProductToEdit() {

        qvPage.hoverProduct(5);


    }


    @And(": user added second product to shopping cart")
    public void userAddedSecondProductToShoppingCart() {
        BrowserUtils.clickWithJS(qvPage.quickview.get(4));
        Driver.get().switchTo().frame(0);
        BrowserUtils.clickWithJS(qvPage.addToCart);
        Driver.get().switchTo().defaultContent();
        qvPage.closeButton.click();

    }
}
