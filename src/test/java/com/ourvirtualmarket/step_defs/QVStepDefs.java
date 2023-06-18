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
        try {
            BrowserUtils.verifyElementDisplayed(Driver.get().findElement(By.xpath("//img[@alt='slide 3']")));
            Thread.sleep(3000);
            BrowserUtils.scrollToElement(qvPage.product1);

            //qvPage.product(1);
            Actions actions= new Actions(Driver.get());
            actions.moveToElement(qvPage.product1).perform();
            actions.moveToElement(qvPage.qw1).click().perform();
        } catch (NoSuchElementException e) {
            e.printStackTrace();

            throw new RuntimeException(e);
        }
        //loginPage.popoupClose.click();



        //actions.moveToElement(Driver.get().f
        // indElement(By.xpath("//div[@class='button-group so-quickview cartinfo--left'][2]")));

        //qvPage.selectProduct("2");
    }


    @When(": user added new product to shopping cart")
    public void userAddedNewProductToShoppingCart() {
        //BrowserUtils.waitFor(5);
        try {
            Driver.get().switchTo().frame(0);
            BrowserUtils.scrollToElement(qvPage.product1);
            qvPage.product(7);
            qvPage.addToCart.click();
            BrowserUtils.clickWithJS(qvPage.addToCart);
            Driver.get().switchTo().defaultContent();

        } catch (Exception e) {


            BrowserUtils.scrollToElement(qvPage.product1);
            qvPage.product(7);

            qvPage.addToCart.click();
            BrowserUtils.clickWithJS(qvPage.addToCart);

        }
        qvPage.closeButton.click();

    }

    @Then(": price updated automatically")
    public void priceUpdatedAutomatically() {

    }

    @And(": user secon product to edit")
    public void userSeconProductToEdit() {
        BrowserUtils.scrollToElement(qvPage.product2);
        qvPage.product(7);


    }


}
