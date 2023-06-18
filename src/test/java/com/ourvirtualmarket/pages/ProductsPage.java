package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage{
    public String productText;
    public String productLine;

    @FindBy(css = "#button-cart")
    public WebElement addToCardButton;

    @FindBy(xpath = "//div[@class='cart']//input[@value='Buy Now']")
    public WebElement buyNowButton;

    @FindBy(xpath = "//span[@class='previewCartCheckout-price']")
    public WebElement orderSubTotal;

    @FindBy(xpath = "//i[@class='fa fa-trash-o']")
    public List<WebElement> productSize;

    @FindBy(xpath = "//button[@class='close']")
    public WebElement closeButton;
    public static int eklenenUrunSayisi=0;

    public void chooseProduct(String line){
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,500)", "");

        WebElement element = Driver.get().findElement(By.xpath("(//div[@class='right-block'])[" + line + "]"));
        Actions actions=new Actions(Driver.get());
        actions.moveToElement(element).perform();
        productText= element.getText();
        productLine=line;
        System.out.println("productText = " + productText);
        System.out.println("productLine = " + productLine);
        Driver.get().findElement(By.xpath("(//div[@class='product-image-container'])["+line+"]")).click();
        eklenenUrunSayisi++;
    }
    public void selectProduct(String line){
        JavascriptExecutor js = (JavascriptExecutor) Driver.get();
        js.executeScript("window.scrollBy(0,500)", "");

        WebElement element = Driver.get().findElement(By.xpath("(//div[@class='right-block'])[" + line + "]"));
        Actions actions=new Actions(Driver.get());
        actions.moveToElement(element).perform();
        productText= element.getText();
        productLine=line;
        System.out.println("productText = " + productText);
        System.out.println("productLine = " + productLine);
    }
    public void validateAddToCardIcon(){
        WebElement element = Driver.get().findElement(By.xpath("(//span[.='Add to Cart']/ancestor::button)["+productLine+"]"));
        Assert.assertTrue(element.isDisplayed());
    }
    public void addToCard(){
        WebElement element = Driver.get().findElement(By.xpath("(//span[.='Add to Cart']/ancestor::button)["+productLine+"]"));
        element.click();
    }
    public void addToCardProduct(){
        addToCardButton.click();
    }
    public void buyNow(){
        buyNowButton.click();
    }
}
