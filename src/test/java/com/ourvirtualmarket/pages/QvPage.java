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

        @FindBy(xpath ="//span[text()='Quick view'][1]")
        public List<WebElement> quickviev;

        @FindBy(xpath = "(//span[contains(.,'Quick view')])[26]")
        public WebElement qw1;

        @FindBy(xpath ="//div[@class='caption'] //*[@title='Nicky Clarke NHD146 Hair Therapy Touch Control Hair Dryer']")
        public WebElement product1;

        @FindBy(xpath = "")
        public WebElement product2;


        @FindBy(xpath = "//button[@class='close'][@data-dismiss='modal']")
        public WebElement closeButton;


        public void product(int num) {
            BrowserUtils.hover(quickviev.get(num - 1));
            BrowserUtils.clickWithJS(qview(num));

        }

        public WebElement qview(int num) {
            return Driver.get().findElement(By.xpath("((//div[@class='button-group so-quickview cartinfo--left'])['" + num + "']//span)[4]"));


        }

        public void selectProduct(String line) {
            JavascriptExecutor js = (JavascriptExecutor) Driver.get();
            js.executeScript("window.scrollBy(0,500)", "");

            WebElement element = Driver.get().findElement(By.xpath("(//div[@class='right-block'])[" + line + "]"));
            Actions actions=new Actions(Driver.get());
            actions.moveToElement(element).perform();
            //productText= element.getText();
            //productLine=line;
            //System.out.println("productText = " + productText);
            //System.out.println("productLine = " + productLine);
        }


    }






