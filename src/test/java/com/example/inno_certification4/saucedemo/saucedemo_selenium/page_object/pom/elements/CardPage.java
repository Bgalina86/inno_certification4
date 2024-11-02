package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CardPage {

    private final By headerLocation = By.xpath("//div[@class='header_secondary_container']/span");
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
    private final WebDriver driver;

    public CardPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getHeader() {
        return driver.findElement(headerLocation).getText();
    }

    public String getCard1Name() {
        return driver.findElement(card1Location).getText();
    }

    public String getCard2Name() {
        return driver.findElement(card2Location).getText();
    }

    public String getCard3Name() {
        return driver.findElement(card3Location).getText();
    }

    public void submitButtonCard1Button() {
        driver.findElement(submitButtonCard1Location).click();
    }

    public void submitButtonCard2Button() {
        driver.findElement(submitButtonCard2Location).click();
    }

    public void submitButtonCard3Button() {
        driver.findElement(submitButtonCard3Location).click();
    }

    public void shoppingCartButton() {
        driver.findElement(shoppingCartLocation).click();
    }
}
