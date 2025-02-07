package com.demoqa.pages.widgets;

import com.demoqa.pages.HomePage;
import org.openqa.selenium.By;

import static utils.JavaScriptUtility.scrollToElementJS;

public class WidgetsPage extends HomePage {
    private final By selectMenuItem = By.xpath("//li[@id=\"item-8\"]/span[text()='Select Menu']");
    private final By datePickerItem = By.xpath("//*[@id=\"item-2\"]/span[text()='Date Picker']");
    private final By progressBarMenuItem = By.xpath("//*[@id=\"item-4\"]/span[text()='Progress Bar']");
    private final By sliderMenuItem = By.xpath("//*[@id=\"item-3\"]/span[text()='Slider']");

    public SliderPage clickSlider() {
        scrollToElementJS(sliderMenuItem);
        click(sliderMenuItem);
        return new SliderPage();
    }

    public ProgressBarPage clickProgressBar() {
        scrollToElementJS(progressBarMenuItem);
        click(progressBarMenuItem);
        return new ProgressBarPage();
    }

    public SelectMenuPage clickSelectMenu() {
        scrollToElementJS(selectMenuItem);
        click(selectMenuItem);
        return new SelectMenuPage();
    }

    public DatePickerMenuPage clickDatePicker() {
        scrollToElementJS(datePickerItem);
        click(datePickerItem);
        return new DatePickerMenuPage();
    }
}
