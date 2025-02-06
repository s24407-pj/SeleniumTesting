package com.demoqa.tests.widgets;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class SelectDropDownTest extends BaseTest {

    @Test
    public void testMultiSelectDropDown() {
        var selectMenuPage = homePage.goToWidgets().clickSelectMenu();
        selectMenuPage.selectStandardMulti("Volvo");
        selectMenuPage.selectStandardMulti(1);
        selectMenuPage.selectStandardMulti("Audi");
        selectMenuPage.selectStandardMulti(2);

        selectMenuPage.deselectStandardMulti("saab");
        var actualSelectedOptions = selectMenuPage.getAllSelectedStandardMultiOptions();

        assertTrue(actualSelectedOptions.contains("Volvo"));
        assertTrue(actualSelectedOptions.contains("Opel"));
        assertFalse(actualSelectedOptions.contains("Saab"));
        assertTrue(actualSelectedOptions.contains("Audi"));
    }
}
