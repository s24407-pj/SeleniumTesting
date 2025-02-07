package com.demoqa.pages.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static utils.ActionsUtility.sendKeys;
import static utils.GetUtility.getText;
import static utils.JavaScriptUtility.scrollToElementJS;
import static utils.WaitUtility.explicitWaitUntilVisible;

public class TextBoxPage extends ElementsPage {
    private final By fullNameField = By.id("userName");
    private final By currentAddressField = By.xpath("//textarea[@id='currentAddress']");
    private final By submitButton = By.id("submit");
    private final By currentAddressValue = By.xpath("//p[@id='currentAddress']");

    public String getCurrentAddress() {
        explicitWaitUntilVisible(5, currentAddressValue);
        return getText(currentAddressValue);
    }

    public void setCurrentAddress(String address) {
        find(currentAddressField).sendKeys(address + Keys.ENTER);
    }

    public void clickSubmitButton() {
        scrollToElementJS(submitButton);
        click(submitButton);
    }

    public void setFullName(String name) {
        scrollToElementJS(fullNameField);
        sendKeys(find(fullNameField), Keys.chord(name));
    }

    public void setEmail(String email) {
        setFullName(Keys.chord(Keys.TAB, email));
    }
}
