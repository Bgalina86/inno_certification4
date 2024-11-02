package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.elements.OrderCart;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
public class OrderCartPage {
    private final WebDriver driver;
    private final OrderCart orderCart;

    public OrderCartPage(WebDriver driver) {
        this.driver = driver;
        this.orderCart = new OrderCart(driver);
    }
    @Step("Проверяем, что в заказе 3 товара")
    public boolean getSizeCartListLocation() {
     return orderCart.getSizeCartListLocation().equals("3");
    }
    @Step("Получение наименования товара Sauce Labs Backpack")
    public String getnameCart1Location() {
        return orderCart.getNameCart1Location();
    }

    @Step("Получение наименования товара  Sauce Labs Bolt T-Shirt")
    public String getnameCart2Location() {
        return orderCart.getNameCart2Location();
    }

    @Step("Получение наименования товара Sauce Labs Onesie")
    public String getnameCart3Location() {
        return orderCart.getNameCart3Location();
    }
    @Step("Получаем итоговую сумму по заказу")
    public String getTotalPriceLocation(){
        return orderCart.getTotalPriceLocation();
    }
    @Step("Нажимаем кнопку")
    public void clickButtonCheckoutLocation(){
       orderCart.clickButtonCheckoutLocation();
    }
    @Step("Проверяем, что перешли на последнюю страницу")
    public String getTextFinishPage(){
        return orderCart.getFinishText();
    }
}
