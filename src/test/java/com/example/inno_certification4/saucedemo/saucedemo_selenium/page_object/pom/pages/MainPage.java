package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages;

import com.example.inno_certification4.saucedemo.saucedemo_selenium.helper.ConfProperties;
import io.qameta.allure.Step;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class MainPage {

    private final WebDriver driver;
    public final AuthorizationPage authorizationPage;
    public final CardsPage cardsPage;
    public final CheckoutYourInformationPage checkoutYourInformationPage;
    public final OrderCartPage orderCartPage;
    public CheckoutOverviewPage checkoutOverviewPage;
    private static ConfProperties properties;

    public static void setUp() {
        properties = new ConfProperties();
    }

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.authorizationPage = new AuthorizationPage(driver);
        this.cardsPage = new CardsPage(driver);
        this.checkoutOverviewPage = new CheckoutOverviewPage(driver);
        this.checkoutYourInformationPage = new CheckoutYourInformationPage(driver);
        this.orderCartPage = new OrderCartPage(driver);
    }

    @Step("Открываем сайт")
    public void open() {
        driver.get(properties.getProperty("URL"));
    }
    }
