package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object;

import com.example.inno_certification4.saucedemo.saucedemo_selenium.helper.ConfProperties;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.elements.Authorization;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.AuthorizationPage;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.CardsPage;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.CheckoutOverviewPage;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.CheckoutYourInformationPage;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.MainPage;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.OrderCartPage;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public abstract class BaseTest {

    protected WebDriver driver;

    // pages
    protected AuthorizationPage authorizationPage;
    protected CardsPage cardsPage;
    protected CheckoutOverviewPage checkoutOverviewPage;
    protected CheckoutYourInformationPage checkoutYourInformationPage;
    protected MainPage mainPage;
    protected OrderCartPage orderCartPage;
    public static ConfProperties properties;

    @BeforeEach
    public void setUpL() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        authorizationPage = new AuthorizationPage(driver);
        cardsPage = new CardsPage(driver);
        checkoutOverviewPage = new CheckoutOverviewPage(driver);
        checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
        mainPage = new MainPage(driver);
        orderCartPage = new OrderCartPage(driver);
    }

    @BeforeAll
    public static void setUp() {
        properties = new ConfProperties();
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
