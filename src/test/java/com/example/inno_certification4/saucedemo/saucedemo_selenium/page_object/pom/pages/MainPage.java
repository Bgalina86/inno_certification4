package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages;

import com.example.inno_certification4.saucedemo.saucedemo_selenium.BaseTest;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class MainPage extends BaseTest {

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
