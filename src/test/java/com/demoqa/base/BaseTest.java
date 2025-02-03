package com.demoqa.base;

import com.base.BasePage;
import com.demoqa.pages.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import static utils.Utility.setUtilityDriver;

public class BaseTest {
    private final String url = "https://demoqa.com/";
    protected BasePage basePage;
    protected HomePage homePage;
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @BeforeMethod
    public void loadApplication() {
        driver.get(url);
        basePage = new BasePage();
        basePage.setDriver(driver);
        setUtilityDriver();
        homePage = new HomePage();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
