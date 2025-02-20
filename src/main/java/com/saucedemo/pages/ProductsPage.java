package com.saucedemo.pages;

import com.base.BasePage;
import org.openqa.selenium.By;

public class ProductsPage extends BasePage {

    private final By productsLabel = By.xpath("//span[text()='Products']");

    public boolean isProductsLabelDisplayed() {
        return find(productsLabel).isDisplayed();
    }
}
