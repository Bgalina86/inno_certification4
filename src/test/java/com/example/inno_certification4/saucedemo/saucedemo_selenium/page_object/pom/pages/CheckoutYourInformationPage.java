package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages;

import com.example.inno_certification4.saucedemo.saucedemo_selenium.helper.ConfProperties;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.elements.CheckoutYourInformation;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInformationPage {

    private final WebDriver driver;
    private static ConfProperties properties;

    public static void setUp() {
        properties = new ConfProperties();
    }

    private final CheckoutYourInformation checkoutYourInformation;

    public CheckoutYourInformationPage(WebDriver driver) {
        this.driver = driver;
        this.checkoutYourInformation = new CheckoutYourInformation(driver);
    }

    @Step("Заполняем форму данными")
    public void setFillingOutForm() {
        checkoutYourInformation.fillingOutForm(properties.getProperty("FIRST_NAME"),
            properties.getProperty("LAST_NAME"), properties.getProperty("POST_CODE"));
    }
}
