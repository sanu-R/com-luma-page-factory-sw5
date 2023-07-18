package com.luma.pages;

import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class GearPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Overnight Duffle')]")
    WebElement duffle;
    @CacheLookup
    @FindBy(xpath ="//span[@class='base']" )
    WebElement verifyText;
    @CacheLookup
    @FindBy(xpath = "//input[@id='qty']")
    WebElement clear;

    @CacheLookup
    @FindBy(xpath = "//button[@id='product-addtocart-button']")
    WebElement addTo;
    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement verifyAddToCart;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'shopping cart')]")
    WebElement clickOnShopp;
    @CacheLookup
    @FindBy(css = "td[class='col item'] strong[class='product-item-name']")
    WebElement verifyCronusYoga;
    @CacheLookup
    @FindBy(xpath= "//input[@title='Qty']")
    WebElement verifyQty ;
    @CacheLookup
    @FindBy(xpath= "//span[@class='cart-price']//span)[2]")
    WebElement verifyPrice ;
    @CacheLookup
    @FindBy(css = "td[class='col qty'] input[class*='input-text qty']")
    WebElement  clearQty;
    @CacheLookup
    @FindBy(css = "td[class='col qty'] input[class*='input-text qty']")
    WebElement  reWriteQty;
    @CacheLookup
    @FindBy(xpath = "//span[normalize-space()='Update Shopping Cart']")
    WebElement updateShopping ;

    @CacheLookup
    @FindBy(xpath ="//span[@class='cart-price']//span[@class='price'][text()='$225.00']")
    WebElement  verifyProductPrice;

    public void clickOnProductName() {
        clickOnElement(duffle);
    }

    public String verifyTextOvernightDuffle() {
        return getTextFromElement(verifyText);

    }
    public void clearTheQty(String a) {
       clear.clear();
       sendTextToElement(clear,a);
    }

    public void addToTheCart() {
        clickOnElement(addTo);
    }

    public String verifyTextAddToCart() {
        return getTextFromElement(verifyAddToCart);

    }

    public void clickOnShoppingCartForDuffle() {
        clickOnElement(clickOnShopp);
    }

    public String verifyTextCronusYogaPant() {
        return getTextFromElement(verifyCronusYoga);

    }

    public void verifyQtyIsThree() {
        getTextFromElement(verifyQty);
    }

    public String verifyThePrice() {
       return getTextFromElement(verifyPrice);

    }

    public void clearQtyForYoga(String q) {
      clearQty.clear();
    sendTextToElement(clearQty,q);
    }



    public void updateTheShoppingCartClick() {
        clickOnElement(updateShopping);
    }

    public void verifyProductPriceLastTime() {
        getTextFromElement(verifyProductPrice);
    }


}