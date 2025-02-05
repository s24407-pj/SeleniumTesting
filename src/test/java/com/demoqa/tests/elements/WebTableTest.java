package com.demoqa.tests.elements;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class WebTableTest extends BaseTest {
    @Test
    public void testWebTable() {
        var email = "alden@example.com";
        var age = "34";

        var webTablePage = homePage.goToElements().clickWebTables();
        webTablePage.clickEdit(email);
        webTablePage.setAge(age);
        webTablePage.clickSubmitButton();

        var result = webTablePage.getTableAge(email);

        assertEquals(result, age,"Age does not match");
    }
}
