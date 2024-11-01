package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages;

import com.example.inno_certification4.saucedemo.saucedemo_selenium.helper.ConfProperties;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.elements.Authorization;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.elements.Card;
import org.openqa.selenium.WebDriver;


public class MainPage {

    private final WebDriver driver;
    public final Authorization authorization;
    public final Card card;
    private static ConfProperties properties;

    public static void setUp() {
        properties = new ConfProperties();
          }

    public MainPage(WebDriver driver) {
        this.driver = driver;
        this.authorization = new Authorization(driver);
        this.card = new Card(driver);
    }
    public void open(){
        driver.get(properties.getProperty("URL"));
    }
}
