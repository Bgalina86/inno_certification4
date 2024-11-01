package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.elements;

import com.example.inno_certification4.saucedemo.saucedemo_selenium.helper.ConfProperties;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Authorization {

    private static ConfProperties properties;
    private final By logoLocation = By.xpath("//div[@class=\"login_logo\"]");//Swag Labs
    private final By usernameLocation = By.xpath("//input[@placeholder=\"Username\"]");
    private final By passwordLocation = By.xpath("//input[@placeholder=\"Password\"]");
    private final By submitButtonLocation = By.xpath("//input[@type=\"submit\"]");
    private final By errorMessageLocation = By.xpath(
        "//div[@class='error-message-container error']/h3");
    private final WebDriver driver;

    public static void setUp() {
    properties = new ConfProperties();
    }

    public Authorization(WebDriver driver) {
        this.driver = driver;
    }


    public String getTextPage() {
        return driver.findElement(logoLocation).getText();
    }

    public void inputLogin(String usernameStandard) {
         driver.findElement(usernameLocation).sendKeys(usernameStandard);
    }

    public void inputPassword(String password) {
        driver.findElement(passwordLocation).sendKeys(password);
    }

    public void submitButton() {
        driver.findElement(submitButtonLocation).click();
    }

    public String getErrorMessage() {
        return driver.findElement(errorMessageLocation).getText();
    }

    public void goToCart() {
        new WebDriverWait(driver, Duration.ofSeconds(4));
    }
}
