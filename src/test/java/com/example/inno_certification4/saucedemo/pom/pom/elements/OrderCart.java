package com.example.inno_certification4.saucedemo.pom.pom.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

public class OrderCart {

    private final By cartListLocation = By.xpath("//div[@class=\"cart_item\"]");
    //private final By card1Location = By.xpath("//div[@class=\"inventory_item_name\"][text()='Sauce Labs Backpack']");
    private final By nameCart1Location = By.xpath(
        "//div[@class='cart_item_label']//a//div[text()='Sauce Labs Backpack']");
    private final By nameCart2Location = By.xpath(
        "//div[@class='cart_item_label']//a//div[text()='Sauce Labs Bolt T-Shirt']");
    private final By nameCart3Location = By.xpath(
        "//div[@class='cart_item_label']//a//div[text()='Sauce Labs Onesie']");
    private final By buttonCheckoutLocation = By.xpath("//button[@id='checkout']");
    private final WebElement context;

    public OrderCart(WebElement webElement) {
        this.context = webElement;
    }

    public Dimension getSizeCartListLocation() {
        return context.findElement(cartListLocation).getSize();
    }

    public String getNameCart1Location() {
        return context.findElement(nameCart1Location).getText();
    }

    public String getNameCart2Location() {
        return context.findElement(nameCart2Location).getText();
    }

    public String getNameCart3Location() {
        return context.findElement(nameCart3Location).getText();
    }

    public void clickButtonCheckoutLocation() {
        context.findElement(buttonCheckoutLocation).submit();
    }

}
