package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.GearPage;
import com.luma.pages.HomePage;
import com.luma.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)
public class GearTest extends BaseTest {
    GearPage gearPage;
    HomePage homePage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        gearPage = new GearPage();
        homePage = new HomePage();
    }


    @Test(groups = {"sanity", "regression"})
    public void userShouldAddProductSuccessFullyToShoppingCart() throws InterruptedException {
        //Mouse Hover on Gear Menu
        homePage.gearMenuHover();
        Thread.sleep(1000);
        //* Click on Bags
        homePage.clickOnBags();
        //* Click on Product Name ‘Overnight Duffle’
        Thread.sleep(1000);
        gearPage.clickOnProductName();
        //* Verify the text ‘Overnight Duffle’
        //  Assert.assertEquals(gearPage.verifyTextAddToCart(), "You added Overnight Duffle to your shopping cart.", "Overnight Duffle not added");
        //* Change Qty 3
        gearPage.clearTheQty("3");
        Thread.sleep(1000);
        //* Click on ‘Add to Cart’ Button.
        gearPage.addToTheCart();
        //* Verify the text
        //‘You added Overnight Duffle to your shopping cart.’
        gearPage.verifyTextAddToCart();
        Thread.sleep(1000);
        //* Click on ‘shopping cart’ Link into
        //message
        gearPage.clickOnShoppingCartForDuffle();
        //* Verify the product name ‘Cronus Yoga Pant’
        // Assert.assertEquals(gearPage.verifyTextCronusYogaPant(),"Cronus Yoga Pant","Cronus Yoga Pant not found";
        Thread.sleep(1000);
        //* Verify the Qty is ‘3’
        gearPage.verifyQtyIsThree();
        //* Verify the product price ‘$135.00’
      //  Assert.assertEquals(gearPage.verifyThePrice(), "$135.00", "$135.00 not found");
        Thread.sleep(1000);
        //* Change Qty to ‘5’
        gearPage.clearQtyForYoga("5");
        Thread.sleep(1000);
        //* Click on ‘Update Shopping Cart’ button
        gearPage.updateTheShoppingCartClick();
        //* Verify the product price ‘$225.00’
        gearPage.verifyProductPriceLastTime();


    }


}
