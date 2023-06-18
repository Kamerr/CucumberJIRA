package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.ConfigurationReader;
import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(xpath = "//a[text()='Login ']")
    public WebElement loginButton;

    @FindBy(xpath = "//a[text()=' Logout ']")
    public WebElement logoutButton;

    @FindBy(xpath = "//button[@title='Close']")
    public WebElement closePopup;

    @FindBy(xpath = "//a[text()='Login ']")
    public WebElement dashboard_login;

    @FindBy(id = "email")
    public WebElement emailInput;

    @FindBy(id = "pass")
    public WebElement passwordInput;

    @FindBy(id = "send2")
    public WebElement loginWithEmailPassword;

    public void login(){
        dashboard_login.click();
        BrowserUtils.waitFor(1);
        emailInput.sendKeys(ConfigurationReader.get("emailS"));
        passwordInput.sendKeys(ConfigurationReader.get("passwordS"));
        loginWithEmailPassword.click();
    }

}
