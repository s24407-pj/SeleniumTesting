package com.demoqa.tests.screenshot;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

public class CaptureFailedScreenshotTest extends BaseTest {
    @Test
    public void testClickingSubmitButtonWithoutJSExecutor() {
        var practiceFormPage = homePage.goToForms().clickPracticeForm();
        practiceFormPage.clickSubmitButton();
    }
}
