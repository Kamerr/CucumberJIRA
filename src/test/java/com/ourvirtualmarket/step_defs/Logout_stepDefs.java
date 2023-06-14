package com.ourvirtualmarket.step_defs;

import com.ourvirtualmarket.pages.LoginPage;
import com.ourvirtualmarket.pages.LogoutPage;
import com.ourvirtualmarket.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Logout_stepDefs {
    LoginPage loginPage=new LoginPage();
    LogoutPage logoutPage=new LogoutPage();

    @Then("Verify that the logout button isdisplayed")
    public void verifyThatTheLogoutButtonIsdisplayed() {
        Assert.assertTrue(loginPage.logoutButton.isDisplayed());

    }

    @When("The user clicks logout button")
    public void theUserClicksLogoutButton() {
        loginPage.logoutButton.click();
        
    }

    @Then("The user sees {string} and {string} message")
    public void theUserSeesAndMessage(String expectedMessage1, String expectedMessage2) {
        Assert.assertEquals(expectedMessage1,logoutPage.firstText.getText());
        Assert.assertEquals(expectedMessage2,logoutPage.secondText.getText());
    }

    @Then("The user sees title {string}")
    public void theUserSeesTitle(String expectedTitle) {
Assert.assertEquals(expectedTitle,logoutPage.tittleText.getText());
    }

    @Then("The user sees continue button")
    public void theUserSeesContinueButton() {
        Assert.assertTrue(logoutPage.continueButton.isDisplayed());
    }

    @When("The user clicks the continue button")
    public void theUserClicksTheContinueButton() {
        logoutPage.continueButton.click();
    }

    @Then("The user navigate to homepage")
    public void theUserNavigateToHomepage() {
     String   expectedTitle="Your Store";
     Assert.assertEquals(expectedTitle, Driver.get().getTitle());
    }

    @When("The user clicks on back-page button")
    public void theUserClicksOnBackPageButton() {

        Driver.get().navigate().back();
    }



    @Then("The user should not be on the {string} page")
    public void theUserShouldNotBeOnThePage(String expextedTitle) {
        Assert.assertNotEquals(expextedTitle,Driver.get().getTitle());
    }
}
