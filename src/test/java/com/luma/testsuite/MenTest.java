package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.HomePage;
import com.luma.pages.ManPage;
import com.luma.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class MenTest extends BaseTest {
    HomePage homePage;
    ManPage manPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        manPage = new ManPage();
        homePage = new HomePage();
    }


    @Test(groups = {"sanity", "regression"})

    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //* Mouse Hover on Men Menu
        //* Mouse Hover on Bottoms
        //* Click on Pants
        homePage.MouseHoverToMenMenu();
        Thread.sleep(1000);
        //Mouse Hover on product name
        //‘Cronus Yoga Pant’ and click on size
        //32.
        Thread.sleep(1000);
        manPage.cronusSize();
        manPage.ClickOnSizeMen();
        //* Mouse Hover on product name
        //‘Cronus Yoga Pant’ and click on colour
        //Black.
        Thread.sleep(1000);
        manPage.cronusColour();
        //* Mouse Hover on product name
        //‘Cronus Yoga Pant’ and click on
        //‘Add To Cart’ Button.
        manPage.addToCartMen();
        Thread.sleep(1000);
        //* Verify the text
        //‘You added Cronus Yoga Pant to your shopping cart.’
        Assert.assertEquals(manPage.verifyTheAddText(), "You added Cronus Yoga Pant to your shopping cart.", "You added Cronus Yoga Pant to your shopping cart not found.");

        Thread.sleep(1000);
        //* Click on ‘shopping cart’ Link into
        //message
        manPage.clickOnShoppingCart();
        //* Verify the text ‘Shopping Cart.’
        Assert.assertEquals(manPage.verifyTextShoppingCart(), "Shopping Cart", "Text not found");

        Thread.sleep(1000);
        //* Verify the product name ‘Cronus Yoga Pant’
        Assert.assertEquals(manPage.verifyTextCronusPant(), "Cronus Yoga Pant", "Text not found");
        Thread.sleep(1000);
        //* Verify the product size ‘32’
        Assert.assertEquals(manPage.verifySizeText(), "32", "Cronus Yoga Pant size text not found");
        Thread.sleep(1000);

        //* Verify the product colour ‘Black’
        Assert.assertEquals(manPage.verifyColourText(), "Black", "Cronus Yoga Pant colour text not found");


    }


}
