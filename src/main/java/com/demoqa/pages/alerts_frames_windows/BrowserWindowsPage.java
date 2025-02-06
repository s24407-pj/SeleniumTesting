package com.demoqa.pages.alerts_frames_windows;

import org.openqa.selenium.By;

import java.util.Set;

import static utils.GetUtility.getWindowHandle;
import static utils.GetUtility.getWindowHandles;
import static utils.SwitchToUtility.switchToWindow;

public class BrowserWindowsPage extends Alerts_Frames_WindowsPage {
    private final By newWindowButton = By.id("windowButton");

    public void clickNewWindowButton() {
        click(newWindowButton);
    }

    public void switchToNewWindow() {
        String currentHandle = getWindowHandle();

        Set<String> allHandles = getWindowHandles();

        for (String handle : allHandles) {
            if (!currentHandle.equals(handle)) {
                switchToWindow(handle);
            }
        }
    }
}
