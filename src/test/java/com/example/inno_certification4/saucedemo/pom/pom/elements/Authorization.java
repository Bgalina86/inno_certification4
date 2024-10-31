package com.example.inno_certification4.saucedemo.pom.pom.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Authorization {


    private final By logoLocation = By.xpath("//div[@class=\"login_logo\"]");//Swag Labs
    private final By usernameLocation = By.xpath("//input[@placeholder=\"Username\"]");
    private final By passwordLocation = By.xpath("//input[@placeholder=\"Password\"]");
    private final By submitButtonLocation = By.xpath("//input[@type=\"submit\"]");
    private final By errorMessageLocation = By.xpath(
        "//div[@class='error-message-container error']");
    private final WebElement context;

    public Authorization(WebElement webElement) {
        this.context = webElement;
    }

    public String getTextPage() {
        return context.findElement(logoLocation).getText();
    }

    public void inputLogin() {
        context.findElement(usernameLocation).submit();
    }

    public void inputPassword() {
        context.findElement(passwordLocation).submit();
    }

    public void submitButton() {
        context.findElement(submitButtonLocation).click();
    }

    public String getErrorMessage() {
        return context.findElement(errorMessageLocation).getText();
    }
}
