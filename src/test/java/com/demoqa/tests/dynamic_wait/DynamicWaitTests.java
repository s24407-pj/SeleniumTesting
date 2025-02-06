package com.demoqa.tests.dynamic_wait;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class DynamicWaitTests extends BaseTest {
    @Test
    public void testVisibleAfterButtonText() {
        var dynamicPage = homePage.goToElements().clickDynamicProperties();
        String actualText = dynamicPage.getVisibleAfterButtonText();
        String expectedText = "Visible After 5 Seconds";

        assertEquals(actualText, expectedText);

    }
}
