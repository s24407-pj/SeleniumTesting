package com.demoqa.tests.dynamic_wait;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test
public class DynamicWaitTests extends BaseTest {

    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";

        assertEquals(actualText, expectedText);
    }

    public void testProgressBar() {
        var progressBarPage = homePage.goToWidgets().clickProgressBar();
        progressBarPage.clickStartButton();
        String actualValue = progressBarPage.getProgressValue();
        String expectedValue = "100%";

        assertEquals(actualValue, expectedValue);
    }
}
