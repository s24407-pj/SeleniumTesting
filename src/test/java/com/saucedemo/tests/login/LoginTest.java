package com.saucedemo.tests.login;

import com.saucedemo.base.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginErrorMessage() {
        loginPage.setUsername("standard_user");
        loginPage.setPassword("wrong_password");
        loginPage.clickLoginButton();

        var result = loginPage.getErrorMessage();
        var expected = "Epic sadface:";

        assertTrue(result.contains(expected));
    }
}
