package com.demoqa.tests.alerts;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static utils.SwitchToUtility.acceptAlert;
import static utils.SwitchToUtility.getAlertText;

public class AlertsTest extends BaseTest {

    @Test
    public void testInformationAlert() {
        String expectedAlertText = "You clicked a button";
        var alertsPage = homePage.goToAlertsFramesWindowsCard().clickAlerts();
        alertsPage.clickInformationAlertButton();

        assertEquals(getAlertText(), expectedAlertText);

        acceptAlert();
    }
}
