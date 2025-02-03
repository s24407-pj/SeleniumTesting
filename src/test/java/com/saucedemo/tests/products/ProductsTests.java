package com.saucedemo.tests.products;

import com.saucedemo.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ProductsTests extends BaseTest {
    @Test
    public void testProductsHeaderIsDisplayed() {
        var productsPage = loginPage.logIntoApplication("standard_user", "secret_sauce");

        assertTrue(productsPage.isProductsLabelDisplayed(),
                "Products header is not displayed");
    }
}
