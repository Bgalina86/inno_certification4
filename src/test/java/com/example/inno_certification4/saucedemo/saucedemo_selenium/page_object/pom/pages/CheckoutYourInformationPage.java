package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages;

import com.example.inno_certification4.saucedemo.saucedemo_selenium.BaseTest;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.elements.CheckoutYourInformation;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CheckoutYourInformationPage extends BaseTest {

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
