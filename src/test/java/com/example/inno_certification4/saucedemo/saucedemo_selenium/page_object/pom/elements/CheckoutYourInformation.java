package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutYourInformation {
    private final By firstNameLocation = By.xpath("//div[@class='form_group']//*[@id='first-name']");//Smirnova
    private final By lastNameLocation = By.xpath("//div[@class='form_group']//*[@id='last-name']");//Galina
    private final By postalCodeLocation = By.xpath("//div[@class='form_group']//*[@id='postal-code']");//124578
    private final By continueLocation = By.xpath("//input[@id='continue']");
    private final WebElement context;

    public CheckoutYourInformation(WebElement webElement) {
        this.context = webElement;
    }
    public void fillingOutForm(String firstName, String lastName, String postalCode){
        context.findElement(firstNameLocation).sendKeys(firstName);
        context.findElement(lastNameLocation).sendKeys(lastName);
        context.findElement(postalCodeLocation).sendKeys(postalCode);
        context.findElement(continueLocation).submit();
    }
}
