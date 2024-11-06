package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.ext;

import static com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.ext.WebDriverShutter.WD_KEY;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.api.extension.ParameterResolutionException;
import org.junit.jupiter.api.extension.ParameterResolver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.pom.pages.MainPage;

public class MainPageResolver implements ParameterResolver {


    @Override
    public boolean supportsParameter(ParameterContext parameterContext,
        ExtensionContext extensionContext) throws ParameterResolutionException {
        return parameterContext.getParameter().getType().equals(MainPage.class);
    }

    @Override
    public Object resolveParameter(ParameterContext parameterContext,
        ExtensionContext extensionContext) throws ParameterResolutionException {
        WebDriver driver =
            extensionContext
                .getStore(WebDriverShutter.namespace)
                .getOrComputeIfAbsent(WD_KEY, (s) -> new ChromeDriver(), WebDriver.class);

        return new MainPage(driver);
    }
}
