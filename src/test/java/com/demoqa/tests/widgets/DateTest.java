package com.demoqa.tests.widgets;

import com.demoqa.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DateTest extends BaseTest {
    @Test
    public void testSelectingDate() {
        String month = "December";
        String monthNumber = "12";
        String day = "31";
        String year = "2034";

        var datepickerPage = homePage.goToWidgets().clickDatePicker();
        datepickerPage.clickSelectDate();
        datepickerPage.selectMonth(month);
        datepickerPage.selectYear(year);
        datepickerPage.clickDay(day);

        String actualDate = datepickerPage.getDate();
        String expectedDate = monthNumber + "/" + day + "/" + year;

        Assert.assertEquals(actualDate, expectedDate);
    }
}
