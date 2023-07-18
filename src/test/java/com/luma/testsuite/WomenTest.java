package com.luma.testsuite;

import com.luma.customlisteners.CustomListeners;
import com.luma.pages.HomePage;
import com.luma.pages.JacketsPage;
import com.luma.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(CustomListeners.class)
public class WomenTest extends BaseTest {
    HomePage homePage;

    JacketsPage jacketsPage;
@BeforeMethod(alwaysRun = true)
public void inIt(){
    homePage = new HomePage();

    jacketsPage = new JacketsPage();
}
    @Test (groups = {"sanity","regression"})
    public void verifyTheSortByProductNameFilter() {

        //* Mouse Hover on Women Menu
        //* Mouse Hover on Tops
        //* Click on Jackets
        homePage.MouseHoverToWomenMenu();
        //* Select Sort By filter “Product Name”
        jacketsPage.sortByProduce();
        //* Verify the products name display in alphabetical order
       // jacketsPage.alphabeticalOder();


    }

    @Test(groups = {"sanity", "smoke","regression"})
    public void verifyTheSortByPriceFilter() {
        //* Mouse Hover on Women Menu
        //* Mouse Hover on Tops
        //* Click on Jackets
        homePage.MouseHoverToWomenMenu();
        //* Select Sort By filter “Price”
        jacketsPage.sortByPriceFilter("name");
        //* Verify the products price display in Low to High
       // jacketsPage.verifyLowToHighText();


    }
}
