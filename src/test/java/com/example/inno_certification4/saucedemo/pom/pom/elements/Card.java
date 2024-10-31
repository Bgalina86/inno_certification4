package com.example.inno_certification4.saucedemo.pom.pom.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Card {

    private final By card1Location = By.xpath(
        "//div[@class=\"inventory_item_name \"][text()='Sauce Labs Backpack']");
    private final By card2Location = By.xpath(
        "//div[@class=\"inventory_item_name \"][text()='Sauce Labs Bolt T-Shirt']");
    private final By card3Location = By.xpath(
        "//div[@class=\"inventory_item_name \"][text()='Sauce Labs Onesie']");
    private final By submitButtonCard1Location = By.xpath(
        "//*[@id=\"add-to-cart-sauce-labs-backpack\"]");
    private final By submitButtonCard2Location = By.xpath(
        "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]");
    private final By submitButtonCard3Location = By.xpath(
        "//*[@id=\"add-to-cart-sauce-labs-onesie\"]");
    private final By shoppingCartLocation = By.xpath(
        "//span[@class=\"shopping_cart_badge\"][text()='3']");
    private final WebElement context;

    public Card(WebElement webElement) {
        this.context = webElement;
    }

    public String getCard1Name() {
        return context.findElement(card1Location).getText();
    }

    public String getCard2Name() {
        return context.findElement(card2Location).getText();
    }

    public String getCard3Name() {
        return context.findElement(card3Location).getText();
    }

    public void submitButtonCard1Button() {
        context.findElement(submitButtonCard1Location).click();
    }

    public void submitButtonCard2Button() {
        context.findElement(submitButtonCard2Location).click();
    }

    public void submitButtonCard3Button() {
        context.findElement(submitButtonCard3Location).click();
    }

    public void shoppingCartButton() {
        context.findElement(shoppingCartLocation).click();
    }
}
