package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuccessPage extends BasePage{
    @FindBy(xpath = "//div[@id='content']//h1")
    private WebElement isSuccessfull;

    @FindBy(xpath = "//div[@class='pull-right']")
    private WebElement successContinue;

    public WebElement getIsSuccessfull() {
        return isSuccessfull;
    }

    public WebElement getSuccessContinue() {
        return successContinue;
    }
}
