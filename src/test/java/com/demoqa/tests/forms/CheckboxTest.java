package com.demoqa.tests.forms;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertFalse;

public class CheckboxTest extends BaseTest {
    @Test
    public void testCheckbox() {
        var formsPage = homePage.goToForms().clickPracticeForm();
        formsPage.clickSportsHobbyCheckbox();
        formsPage.clickReadingHobbyCheckbox();
        formsPage.clickMusicHobbyCheckbox();
        formsPage.unclickMusicHobbyCheckbox();

        var result = formsPage.isMusicSelected();
        assertFalse(result, "Music checkbox is selected");
    }
}
