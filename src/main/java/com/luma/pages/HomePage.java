package com.luma.pages;


import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//span[normalize-space()='Women']")
    WebElement womenMenu;
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-9']//span[contains(text(),'Tops')]")
    WebElement womenTops;
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-11']//span[contains(text(),'Jackets')]")
    WebElement womenJackets;
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Men')]")
    WebElement  menMenu;
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-18']//span[contains(text(),'Bottoms')]")
    WebElement bottoms;
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-23']//span[contains(text(),'Pants')]")
    WebElement  pants;
    @CacheLookup
    @FindBy(xpath ="//a[@id='ui-id-6']")
    WebElement  gearMenu;
    @CacheLookup
    @FindBy(xpath ="//span[contains(text(),'Bags')]")
    WebElement bags;




    public void MouseHoverToWomenMenu() {
        mouseHoverForThreeElement(womenMenu,womenTops,womenJackets);

    }


    public void clickOnJackets() {
        clickOnElement(womenJackets);
    }

    public void MouseHoverToMenMenu() {
        mouseHoverForThreeElement(menMenu, bottoms, pants);
    }

    public void gearMenuHover() {
        mouseHoverToElement(gearMenu);
    }

    public void clickOnBags() {
        clickOnElement(bags);
    }


}
