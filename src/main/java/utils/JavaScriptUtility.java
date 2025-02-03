package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptUtility extends Utility {
    public static void scrollToElementJS(By locator) {
        var element = driver.findElement(locator);
        var jsScript = "arguments[0].scrollIntoView();";
        executeJS(jsScript, element);
    }

    public static void clickJS(By locator) {
        var element = driver.findElement(locator);
        var jsScript = "arguments[0].click();";
        executeJS(jsScript, element);
    }

    private static void executeJS(String jsScript, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(jsScript, element);
    }
}
