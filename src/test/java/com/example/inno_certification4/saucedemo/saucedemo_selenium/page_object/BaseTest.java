package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object;

import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.AuthorizationPage;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.CardsPage;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.CheckoutOverviewPage;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.CheckoutYourInformationPage;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.MainPage;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.OrderCartPage;
import java.time.Duration;
import org.junit.jupiter.api.AfterEach;
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

    @BeforeEach
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.setPageLoadStrategy(org.openqa.selenium.PageLoadStrategy.EAGER);
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
        cartPage = new CartPage(driver);
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
