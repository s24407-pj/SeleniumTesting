package com.demoqa.tests.forms;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class RadioButtonTest extends BaseTest {

    @Test
    public void testRadioButton() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickFemaleRadioButton();
        var isFemaleSelected = formsPage.isFemaleSelected();

        assertTrue(isFemaleSelected, "Female radio button is not selected");
    }
}
