package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object;


import static com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.BaseTest.properties;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.example.inno_certification4.saucedemo.saucedemo_selenium.helper.ConfProperties;

import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.ext.MainPageResolver;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.ext.WebDriverShutter;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.MainPage;
import org.junit.jupiter.api.BeforeAll;
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
    public void authorizationStandardUser(MainPage mainPage){
        mainPage.open();
        assertEquals("Swag Labs",mainPage.authorization.getTextPage());
        mainPage.authorization.inputLogin(properties.getProperty("USERNAME_STANDARD"));
        mainPage.authorization.inputPassword(properties.getProperty("PASSWORD"));
        mainPage.authorization.submitButton();
        assertEquals("Products", mainPage.card.getHeader());
    }

    @Test
    public void authorizationError(MainPage mainPage){
        mainPage.open();
        assertEquals("Swag Labs",mainPage.authorization.getTextPage());
        mainPage.authorization.inputLogin(properties.getProperty("USERNAME_LOCKED"));
        mainPage.authorization.inputPassword(properties.getProperty("PASSWORD"));
        mainPage.authorization.submitButton();
        assertEquals("Epic sadface: Sorry, this user has been locked out.", mainPage.authorization.getErrorMessage());
        mainPage.authorization.goToCart();
    }
}

