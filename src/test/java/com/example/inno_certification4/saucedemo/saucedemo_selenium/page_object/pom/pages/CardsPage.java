package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages;

import com.example.inno_certification4.saucedemo.saucedemo_selenium.BaseTest;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.elements.Card;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;

public class CardsPage extends BaseTest {

    private final Card card;

    public CardsPage(WebDriver driver) {
        this.driver = driver;
        this.card = new Card(driver);
    }

    @Step("Наименование страницы")
    public String getHeader() {
        return card.getHeader();
    }

    @Step("Наименование товара Sauce Labs Backpack")
    public String getNameCard1() {
        return card.getCard1Name();
    }

    @Step("Наименование товара Sauce Labs Bolt T-Shirt")
    public String getNameCard2() {
        return card.getCard2Name();
    }

    @Step("Наименование товара Sauce Labs Onesie")
    public String getNameCard3() {
        return card.getCard3Name();
    }

    @Step("Добавление товара Sauce Labs Backpack в корзину")
    public void clickButtonCard1Button() {
        card.clickButtonCard1Button();
    }

    @Step("Добавление товара Sauce Labs Bolt T-Shirt в корзину")
    public void clickButtonCard2Button() {
        card.clickButtonCard2Button();
    }

    @Step("Добавление товара Sauce Labs Onesie в корзину")
    public void clickButtonCard3Button() {
        card.clickButtonCard3Button();
    }

    @Step("По иконке корзина переходим в корзину")
    public void clickShoppingCartButton() {
        card.clickShoppingCartButton();
    }
}
