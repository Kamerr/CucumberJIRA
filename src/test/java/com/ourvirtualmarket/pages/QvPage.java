package com.ourvirtualmarket.pages;
import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;


    public class QvPage extends BasePage {
        Actions actions;

        @FindBy(xpath = "//input[@id='button-cart']")
        public WebElement addToCart;

        @FindBy(xpath = "//div[@class='button-group so-quickview cartinfo--left']//span[text()='Quick view']")
        public List<WebElement> quickview;


        @FindBy(xpath = "//button[@class='close'][@data-dismiss='modal']")
        public WebElement closeButton;


        public void hoverProduct(int num) {
            BrowserUtils.scrollToElement(quickview.get(num - 1));
            BrowserUtils.hover(quickview.get(num - 1));

        }
    }