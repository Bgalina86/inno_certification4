package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object;


import static org.junit.jupiter.api.Assertions.assertEquals;

import io.qameta.allure.*;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.helper.ConfProperties;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.ext.MainPageResolver;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.ext.WebDriverShutter;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.MainPage;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;


@ExtendWith(MainPageResolver.class)
@ExtendWith(WebDriverShutter.class)
public class SaucedemoTests {

    private static ConfProperties properties;

    @BeforeAll
    public static void setUp() {
        properties = new ConfProperties();
    }

    @Test
    @DisplayName("Блок авторизация")
    @Tag("positive")
    @Story("Проверка авторизации пользователем,который зарегистрирован")
    @Severity(SeverityLevel.BLOCKER)
    public void authorizationStandardUser(MainPage mainPage) {
        mainPage.open();
        mainPage.goToCart();
        assertEquals("Swag Labs", mainPage.authorizationPage.getTextHeader());
        mainPage.authorizationPage.getLoginStandart();
        mainPage.authorizationPage.getPassword();
        mainPage.authorizationPage.submitButtonLogin();
        assertEquals("Products", mainPage.cardsPage.getHeader());
    }

    @Test
    @DisplayName("Блок авторизация")
    @Tag("negative ")
    @Story("Проверка авторизации пользователем,который забыл пароль")
    @Severity(SeverityLevel.BLOCKER)
    public void authorizationError(MainPage mainPage) {
        mainPage.open();
        assertEquals("Swag Labs", mainPage.authorizationPage.getTextHeader());
        mainPage.authorizationPage.getLoginError();
        mainPage.authorizationPage.getPassword();
        mainPage.authorizationPage.submitButtonLogin();
        assertEquals("Epic sadface: Sorry, this user has been locked out.",
            mainPage.authorizationPage.getErrorMessage());
    }

    @Test
    @DisplayName("Пользовательский тест-кейс по покупке товара")
    @Tag("positive")
    @Story("Проверка авторизации пользователем,который зарегистрирован")
    @Severity(SeverityLevel.BLOCKER)
    public void e2eLoginStandart(MainPage mainPage) {
        mainPage.open();
        assertEquals("Swag Labs", mainPage.authorizationPage.getTextHeader());
        mainPage.authorizationPage.getLoginStandart();
        mainPage.authorizationPage.getPassword();
        mainPage.authorizationPage.submitButtonLogin();
        assertEquals("Products", mainPage.cardsPage.getHeader());
        assertEquals("Sauce Labs Backpack", mainPage.cardsPage.getNameCard1(),
            "Проверка наличия товара с наименованием Sauce Labs Backpack");
        mainPage.cardsPage.submitButtonCard1Button();
        assertEquals("Sauce Labs Bolt T-Shirt", mainPage.cardsPage.getNameCard2(),
            "Проверка наличия товара с наименованием Sauce Labs Bolt T-Shirt");
        mainPage.cardsPage.submitButtonCard2Button();
        assertEquals("Sauce Labs Onesie", mainPage.cardsPage.getNameCard3(),
            "Проверка наличия товара с наименованием Sauce Labs Onesie");
        mainPage.cardsPage.submitButtonCard3Button();
        mainPage.cardsPage.shoppingCartButton();
        assertEquals("Your Cart", mainPage.checkoutOverviewPage.getHeader());
        assertEquals("Sauce Labs Backpack", mainPage.checkoutOverviewPage.getnameCart1Location(),
            "Проверка наличия товара с наименованием Sauce Labs Backpack");
        assertEquals("Sauce Labs Bolt T-Shirt", mainPage.checkoutOverviewPage.getnameCart2Location(),
            "Проверка наличия товара с наименованием Sauce Labs Bolt T-Shirt");
        assertEquals("Sauce Labs Onesie", mainPage.checkoutOverviewPage.getnameCart3Location(),
            "Проверка наличия товара с наименованием Sauce Labs Onesie");
        assertEquals("$29.99", mainPage.checkoutOverviewPage.getpriceCard1Location(),
            "Проверка стоимости товара Sauce Labs Backpack $29.99");
        assertEquals("$15.99", mainPage.checkoutOverviewPage.getpriceCard2Location(),
            "Проверка стоимости товара Sauce Labs Bolt T-Shirt $15.99");
        assertEquals("$7.99", mainPage.checkoutOverviewPage.getpriceCard3Location(),
            "Проверка стоимости товара Sauce Labs Onesie $7.99");
        mainPage.checkoutOverviewPage.buttonFinishLocation();
        //заполнить форму
        //нажать кнопку
        //проверить сумму
        //нажать кнопку

    }

    @Test
    @DisplayName("Пользовательский тест-кейс по покупке товара")
    @Tag("positive")
    @Story("Проверка авторизации пользователем,который зарегистрирован")
    @Severity(SeverityLevel.BLOCKER)
    public void e2eUsernamePerformance(MainPage mainPage) {
        mainPage.open();
        assertEquals("Swag Labs", mainPage.authorizationPage.getTextHeader());
        mainPage.authorizationPage.getLoginUsernamePerformance();
        mainPage.authorizationPage.getPassword();
        mainPage.authorizationPage.submitButtonLogin();
        assertEquals("Products", mainPage.cardsPage.getHeader());
    }
}

