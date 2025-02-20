package com.demoqa.pages.alerts_frames_windows;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utils.JavaScriptUtility.scrollToElementJS;

public class Alerts_Frames_WindowsPage extends HomePage {
    private final By modalDialogsMenuItem = By.xpath("//li[@id=\"item-4\"]/span[text()='Modal Dialogs']");
    private final By alertsMenuItem = By.xpath("//li[@id=\"item-1\"]/span[text()='Alerts']");
    private final By browserWindowsMenuItem = By.xpath("//*[@id=\"item-0\"]/span[text()='Browser Windows']");

    public BrowserWindowsPage clickBrowserWindows() {
        scrollToElementJS(browserWindowsMenuItem);
        click(browserWindowsMenuItem);
        return new BrowserWindowsPage();
    }

    public ModalDialogsPage clickModalDialogs() {
        scrollToElementJS(modalDialogsMenuItem);
        click(modalDialogsMenuItem);
        return new ModalDialogsPage();
    }

    public AlertsPage clickAlerts() {
        scrollToElementJS(alertsMenuItem);
        click(alertsMenuItem);
        return new AlertsPage();
    }
}
