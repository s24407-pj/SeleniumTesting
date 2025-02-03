package com.demoqa.pages;

import com.base.BasePage;
import com.demoqa.pages.forms.FormsPage;
import org.openqa.selenium.By;

import static utils.JavaScriptUtility.scrollToElementJS;

public class HomePage extends BasePage {
    private final By formsCard = By.xpath("//div[@id='app']//h5[text()='Forms']");

    public FormsPage goToForms() {
        scrollToElementJS(formsCard);
        click(formsCard);
        return new FormsPage();
    }
}
