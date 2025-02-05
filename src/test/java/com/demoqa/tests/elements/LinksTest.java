package com.demoqa.tests.elements;

import com.demoqa.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LinksTest extends BaseTest {
    @Test
    public void testLinks() {
        var linksPage = homePage.goToElements().clickLinks();
        linksPage.clickBadRequestLink();
        var result = linksPage.getResponse();

        assertTrue(
                result.contains("400") &&
                        result.contains("Bad Request"),
                "Actual response ~ " + result + "\n Expected response should contain '400' and 'Bad Request'"
        );
    }
}
