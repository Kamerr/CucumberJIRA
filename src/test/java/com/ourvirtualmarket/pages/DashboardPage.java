package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DashboardPage extends BasePage{

    public String productTextInTheBasket;
    @FindBy(xpath = "//span[@class='icon-c']")
    public WebElement basketIcon;

    @FindBy(xpath = "//a[text()=' Logout ']")
    public WebElement logout;

    public void selectTab(String tab){
        Driver.get().findElement(By.xpath("(//a[contains(.,'"+tab+"')])[1]")).click();
    }
    public void hoverTheBasket(){
        Actions actions=new Actions(Driver.get());
        actions.moveToElement(basketIcon).perform();
        BrowserUtils.waitFor(1);
    }
    public void validateTheProductIsInTheBasket(){
        for (WebElement element : Driver.get().findElements(By.xpath("(//table)[1]/tbody/tr/td[@class='text-left']"))) {
            productTextInTheBasket= element.getText();
        }
    }

}
