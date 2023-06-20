package com.ourvirtualmarket.pages;

import com.ourvirtualmarket.utilities.BrowserUtils;
import com.ourvirtualmarket.utilities.Driver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

import static org.openqa.selenium.Keys.*;

public class CheckOutPage extends BasePage{

    @FindBy(xpath = "//h1[text()='Checkout']")
    private WebElement checkoutText;

    public WebElement getCheckoutText() {
        return checkoutText;
    }
       //Billing Details
    @FindBy(xpath = "//input[@value='existing']")
    private WebElement billingExistingAddress;

    @FindBy(xpath = "//input[@value='new']")
    private WebElement newAddress;

    @FindBy(xpath = "//input[@id='input-payment-firstname']")
    private WebElement billingFirstName;

    @FindBy(xpath = "//input[@id='input-payment-lastname']")
    private WebElement billingLastName;

    @FindBy(xpath = "//input[@id='input-payment-company']")
    private WebElement billingCompany;

    @FindBy(xpath = "//input[@id='input-payment-address-1']")
    private WebElement billingAddress1;

    @FindBy(xpath = "//input[@id='input-payment-address-2']")
    private WebElement billingAddress2;

    @FindBy(xpath = "//input[@id='input-payment-city']")
    private WebElement billingCity;

    @FindBy(xpath = "//input[@id='input-payment-postcode']")
    private WebElement billingPostCode;

    @FindBy(xpath = "//select[@id='input-payment-country']")
    private WebElement billingCountry;

    @FindBy(xpath = "//input[@value='new'][@name='payment_address']")
    private WebElement billingNewAddress;
    @FindBy(xpath="//input[@id='button-payment-address']")
    private WebElement billingDetailsContinue;
    @FindBy(xpath="//div[@class='pull-right']//input[@id='button-payment-address']")
    public WebElement billingContinueBtn;
    @FindBy(xpath = "//select[@id='input-payment-zone']")
    private WebElement billingRegionState;

    @FindBy(xpath="//input[@id='button-payment-address']")
    public WebElement billingContinue;

    //Delivery Details
    @FindBy(xpath = "//input[@name='shipping_address'][@value='existing']")
    private WebElement deliveryExistingAddress;

    @FindBy(xpath = "//input[@name='shipping_address'][@value='new']")
    private WebElement deliveryNewAddress;

    @FindBy(xpath = "//input[@id='input-shipping-firstname']")
    private WebElement deliveryFirstName;

    @FindBy(xpath = "//input[@id='input-shipping-lastname']")
    private WebElement deliveryLastName;

    @FindBy(xpath = "//input[@id='input-shipping-company']")
    private WebElement deliveryCompany;

    @FindBy(xpath = "//input[@id='input-shipping-address-1']")
    private  WebElement deliveryAddress1;

    @FindBy(xpath = "input-shipping-address-2")
    private WebElement deliveryAddress2;

    @FindBy(xpath = "input-shipping-city")
    private WebElement deliveryCity;

    @FindBy(xpath = "//select[@id='input-shipping-country']")
    private WebElement deliveryCountry;

    @FindBy(xpath = "//select[@id='input-shipping-zone']")
    private WebElement deliveryRegionState;

    @FindBy(xpath = "//input[@id='button-shipping-address']")
    private WebElement deliveryContinueButton;

    //Delivery Method
    @FindBy(xpath = "//input[@name='shipping_method'][@type='radio']")
    private WebElement deliveryflat;

    @FindBy(xpath = "(//textarea[@name='comment'])[1]")
    private WebElement deliveryAddComment;

    @FindBy(xpath = "//input[@id='button-shipping-method']")
    private WebElement deliveryMethodContinue;

    //Payment Method
    @FindBy(xpath = "//input[@name='payment_method']")
    private WebElement cashOnDelivery;

    @FindBy(xpath = "(//textarea[@name='comment'])[2]")
    private WebElement paymentAddComment;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement termsConditions;

    @FindBy(xpath = "//input[@id='button-payment-method']")
    private WebElement paymentContinue;

    @FindBy(xpath = "//input[@id='button-confirm']")
    private WebElement confirmOrder;

    @FindBy(xpath = "//strong[text()='Total:']")
    private WebElement total;
    @FindBy(xpath = "//a[text()='Step 3: Delivery Details ']")
    public WebElement DeliveryDetails;
    @FindBy(xpath = "//a[text()='Step 2: Billing Details ']")
    public WebElement BillingDetails;



    @FindBy(xpath = "//input[@id='button-account']")
    public WebElement optionsContinue;

    public WebElement getBillingExistingAddress() {
        return billingExistingAddress;
    }

    public WebElement getNewAddress() {
        return newAddress;
    }

    public WebElement getBillingFirstName() {
        return billingFirstName;
    }

    public WebElement getBillingLastName() {
        return billingLastName;
    }

    public WebElement getBillingCompany() {
        return billingCompany;
    }

    public WebElement getBillingAddress1() {
        return billingAddress1;
    }

    public WebElement getBillingAddress2() {
        return billingAddress2;
    }

    public WebElement getBillingCity() {
        return billingCity;
    }

    public WebElement getBillingPostCode() {
        return billingPostCode;
    }

    public WebElement getBillingContinue() {
        return billingContinue;
    }

    public WebElement getBillingRegionState() {
        return billingRegionState;
    }



    public WebElement getDeliveryExistingAddress() {
        return deliveryExistingAddress;
    }

    public WebElement getDeliveryNewAddress() {
        return deliveryNewAddress;
    }

    public WebElement getDeliveryFirstName() {
        return deliveryFirstName;
    }

    public WebElement getDeliveryLastName() {
        return deliveryLastName;
    }

    public WebElement getDeliveryCompany() {
        return deliveryCompany;
    }

    public WebElement getDeliveryAddress1() {
        return deliveryAddress1;
    }

    public WebElement getDeliveryAddress2() {
        return deliveryAddress2;
    }

    public WebElement getDeliveryCity() {
        return deliveryCity;
    }

    public WebElement getDeliveryCountry() {
        return deliveryCountry;
    }

    public WebElement getDeliveryRegionState() {
        return deliveryRegionState;
    }

    public WebElement getDeliveryContinueButton() {
        return deliveryContinueButton;
    }

    public WebElement getDeliveryflat() {
        return deliveryflat;
    }

    public WebElement getDeliveryAddComment() {
        return deliveryAddComment;
    }

    public WebElement getDeliveryMethodContinue() {
        return deliveryMethodContinue;
    }

    public WebElement getCashOnDelivery() {
        return cashOnDelivery;
    }

    public WebElement getPaymentAddComment() {
        return paymentAddComment;
    }

    public WebElement getTermsConditions() {
        return termsConditions;
    }

    public WebElement getPaymentContinue() {
        return paymentContinue;
    }

    public WebElement getConfirmOrder() {
        return confirmOrder;
    }

    public WebElement getBillingCountry() {
        return billingCountry;
    }

    public WebElement getBillingNewAddress() {
        return billingNewAddress;
    }

    public WebElement getTotal() {
        return total;
    }
    public void makecheckout(){
       getBillingFirstName().sendKeys("Kamer");
        getBillingLastName().sendKeys("Aypay");
        getBillingCompany().sendKeys("Zero");
        getBillingAddress1().sendKeys("a mahallesi");
        getBillingAddress2().sendKeys("b mahallesi");
        getBillingCity().sendKeys("Konya");
        getBillingPostCode().sendKeys("42000");
        getBillingCountry().sendKeys("Turkey");
        getBillingRegionState().sendKeys("Konya");
        BrowserUtils.waitFor(2);
    }
}
