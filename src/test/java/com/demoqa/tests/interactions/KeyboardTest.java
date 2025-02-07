package com.demoqa.tests.interactions;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class KeyboardTest extends BaseTest {
    @Test
    public void testApplicationUsingKeyboard() {
        var textBoxPage = homePage.goToElements().clickTextBox();

        textBoxPage.setFullName("Joe Doe");
        textBoxPage.setEmail("joe@email.com");
        textBoxPage.setCurrentAddress("123 some address");
        textBoxPage.setCurrentAddress("Gdansk");
        textBoxPage.clickSubmitButton();

        String actualAddress = textBoxPage.getCurrentAddress();

        assertTrue(actualAddress.contains("Gdansk"));
    }

}
