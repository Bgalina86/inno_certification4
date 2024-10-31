package com.example.inno_certification4.saucedemo.pom.pom.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutOverview {
private final By titlePageLocation = By.xpath("//div[@class='header_secondary_container']");// название страницы
    private final By nameCart1Location = By.xpath(
        "//div[@class='cart_item_label']//a//div[text()='Sauce Labs Backpack']");
    private final By nameCart2Location = By.xpath(
        "//div[@class='cart_item_label']//a//div[text()='Sauce Labs Bolt T-Shirt']");
    private final By nameCart3Location = By.xpath(
        "//div[@class='cart_item_label']//a//div[text()='Sauce Labs Onesie']");
    private final By priceCard1Location = By.xpath(
        "//div[@class='cart_item'][1]/div[@class='cart_item_label']/div/div");
    private final By priceCard2Location = By.xpath(
        "//div[@class='cart_item'][2]/div[@class='cart_item_label']/div/div");
    private final By priceCard3Location = By.xpath(
        "//div[@class='cart_item'][3]/div[@class='cart_item_label']/div/div");
private final By totalPriceLocation = By.xpath("//div[@class='summary_total_label']");
private final By buttonFinishLocation = By.xpath("//button[@id='finish']");
private final By completeTextLocation = By.xpath("//h2");
    private final WebElement context;
    public WebElement getContext() {
        return context;
    }
    public CheckoutOverview(WebElement webElement) {
        this.context = webElement;
    }

    public String  getTitlePageLocation() {
        return context.findElement(titlePageLocation).getText();
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

    public String getPriceCard1Location() {
        return context.findElement(priceCard1Location).getText();
    }

    public String getPriceCard2Location() {
        return context.findElement(priceCard2Location).getText();
    }

    public String getPriceCard3Location() {
        return context.findElement(priceCard3Location).getText();
    }

    public String getTotalPriceLocation() {
        return context.findElement(totalPriceLocation).getText();
    }

    public void ButtonFinishLocation() {
         context.findElement(buttonFinishLocation).click();
    }

    public String getCompleteTextLocation() {
        return context.findElement(completeTextLocation).getText();
    }


}
