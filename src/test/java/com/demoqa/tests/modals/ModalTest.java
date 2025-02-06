package com.demoqa.tests.modals;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class ModalTest extends BaseTest {
    @Test
    public void testModalDialog() {
        var afwPage = homePage.goToAlertsFramesWindowsCard();
        var modalDialogsPage = afwPage.clickModalDialogs();

        modalDialogsPage.clickSmallModalButton();
        var actualModalText = modalDialogsPage.getSmallModalText();

        assertTrue(actualModalText.contains("small modal"));

        modalDialogsPage.clickSmallModalCloseButton();

    }
}
