package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
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
//private final By totalPriceLocation = By.xpath("//div[@class='summary_total_label']");
private final By buttonFinishLocation = By.xpath("//button[@id='checkout']");
//private final By completeTextLocation = By.xpath("//h2");
    private final WebDriver driver;

    public CheckoutOverview(WebDriver driver) {
        this.driver = driver;
    }

    public String  getTitlePageLocation() {
        return driver.findElement(titlePageLocation).getText();
    }

    public String getNameCart1Location() {
        return driver.findElement(nameCart1Location).getText();
    }

    public String getNameCart2Location() {
        return driver.findElement(nameCart2Location).getText();
    }

    public String getNameCart3Location() {
        return driver.findElement(nameCart3Location).getText();
    }

    public String getPriceCard1Location() {
        return driver.findElement(priceCard1Location).getText();
    }

    public String getPriceCard2Location() {
        return driver.findElement(priceCard2Location).getText();
    }

    public String getPriceCard3Location() {
        return driver.findElement(priceCard3Location).getText();
    }

//    public String getTotalPriceLocation() {
//        return driver.findElement(totalPriceLocation).getText();
//    }

    public void buttonFinishLocation() {
        driver.findElement(buttonFinishLocation).click();
    }

//    public String getCompleteTextLocation() {
//        return driver.findElement(completeTextLocation).getText();
//    }


}
