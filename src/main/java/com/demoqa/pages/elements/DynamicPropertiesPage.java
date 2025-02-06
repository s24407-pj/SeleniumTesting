package com.demoqa.pages.elements;

import org.openqa.selenium.By;

import static utils.GetUtility.getText;
import static utils.WaitUtility.explicitWaitUntilVisible;

public class DynamicPropertiesPage extends ElementsPage {
    private final By visibleAfterButton = By.id("visibleAfter");

    public String getVisibleAfterButtonText() {
        explicitWaitUntilVisible(5, visibleAfterButton);
        return getText(visibleAfterButton);
    }
}
