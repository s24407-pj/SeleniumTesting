package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.pages.elements.ElementsPage;
import com.demoqa.pages.forms.FormsPage;
import org.openqa.selenium.By;

import static utils.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private final By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");
    private final By elementsCard = By.xpath("//div[@id='app']//h5[text()='Elements']");

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }

    public ElementsPage goToElements(){
        scrollToElementJS(elementsCard);
        click(elementsCard);
        return new ElementsPage();
    }
}
