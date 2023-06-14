package com.ourvirtualmarket.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage{

    @FindBy(xpath = "//a[text()=' Logout ']")
    private WebElement logOutButton;
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


    @FindBy(xpath="//input[@id='button-payment-address']")
    private WebElement billingDetailsContinue;

    @FindBy(xpath = "//select[@id='input-payment-zone']")
    private WebElement billingRegionState;

    @FindBy(xpath="//select[@id='input-payment-country']")
    private WebElement billingContinue;

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

    @FindBy(xpath = "button-shipping-address")
    private WebElement deliveryContinueButton;

    //Delivery Method
    @FindBy(xpath = "//input[@value='flat.flat']")
    private WebElement deliveryflat;

    @FindBy(xpath = "(//textarea[@name='comment'])[1]")
    private WebElement addComment;

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

    public WebElement getLogOutButton() {
        return logOutButton;
    }

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

    public WebElement getBillingDetailsContinue() {
        return billingDetailsContinue;
    }

    public WebElement getBillingRegionState() {
        return billingRegionState;
    }

    public WebElement getBillingContinue() {
        return billingContinue;
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

    public WebElement getAddComment() {
        return addComment;
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
}
