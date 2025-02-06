package com.demoqa.pages.elements;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utils.JavaScriptUtility.scrollToElementJS;

public class ElementsPage extends HomePage {

    private final By webTablesMenuItem = By.xpath("//li[@id=\"item-3\"]/span[text()='Web Tables']");
    private final By linksMenuItem = By.xpath("//li[@id=\"item-5\"]/span[text()='Links']");
    private final By dynamicPropertiesMenuItem = By.xpath("//*[@id=\"item-8\"]/span[text()='Dynamic Properties']");

    public DynamicPropertiesPage clickDynamicProperties() {
        scrollToElementJS(dynamicPropertiesMenuItem);
        click(dynamicPropertiesMenuItem);
        return new DynamicPropertiesPage();
    }

    public WebTablesPage clickWebTables() {
        click(webTablesMenuItem);
        return new WebTablesPage();
    }

    public LinksPage clickLinks() {
        click(linksMenuItem);
        return new LinksPage();
    }
}
