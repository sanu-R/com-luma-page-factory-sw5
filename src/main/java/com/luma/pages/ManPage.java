package com.luma.pages;

import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ManPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Cronus Yoga Pant']")
    WebElement cronusYoga;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option text'])[1]")
    WebElement clickSize;
    @CacheLookup
    @FindBy(xpath = "(//div[@class='swatch-option color'])[1]")
    WebElement colour;
    @CacheLookup
    @FindBy(xpath = "//li[1]//div[1]//div[1]//div[3]//div[1]//div[1]//form[1]//button[1]//span[1]")
    WebElement addToCart;

    @CacheLookup
    @FindBy(xpath = "//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']")
    WebElement textYouAdded;
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='shopping cart']")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement verifyCart;
    @CacheLookup
    @FindBy(xpath = "//td[@class='col item']//a[normalize-space()='Cronus Yoga Pant']")
    WebElement verifyName;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement verifySize;
    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement verifyColour;



    public void cronusSize(){
      mouseHoverToElement  (cronusYoga);
    }

    public void ClickOnSizeMen() {
        clickOnElement(clickSize);
    }

    public void cronusColour() {
        mouseHoverToElementAndClick(colour);
    }

    public void addToCartMen() {
        clickOnElement(addToCart);
    }

    public String  verifyTheAddText() {
        return  getTextFromElement(textYouAdded);

    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public  String verifyTextShoppingCart() {
        return getTextFromElement(verifyCart);


    }

    public  String verifyTextCronusPant() {
        return getTextFromElement(verifyName);

    }

    public String verifySizeText() {
        return getTextFromElement(verifySize);

    }

    public String verifyColourText() {
        return getTextFromElement(verifyColour);

    }


}
