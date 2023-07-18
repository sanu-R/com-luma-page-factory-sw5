package com.luma.pages;


import com.luma.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class JacketsPage extends Utility {
    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]" )
    WebElement sortBy;
    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]" )
    WebElement alphabetical;
    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/select[1]" )
    WebElement priceFilter;
    @CacheLookup
    @FindBy(xpath ="//body/div[1]/main[1]/div[3]/div[1]/div[2]/div[3]/a[1]")
    WebElement lowTo;



    public void sortByProduce() {
        selectByValueFromDropDown(sortBy, "name");
    }

    public void alphabeticalOder() {
   //  assertVerifyText(alphabetical, "Set Ascending Direction", "Text not in alphabetical order");
    }

    public void sortByPriceFilter(String value) {
     selectByValueFromDropDown(priceFilter,value);

    }

    public void verifyLowToHighText() {
    //  verifyText(lowTo, "Set Descending Direction", "Text not in Ascending Direction ");

    }


}
