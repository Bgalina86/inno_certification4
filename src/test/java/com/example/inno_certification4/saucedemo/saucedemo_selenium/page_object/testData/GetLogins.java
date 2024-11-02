package com.example.inno_certification4.saucedemo.saucedemo_selenium.page_object.testData;

import com.example.inno_certification4.saucedemo.saucedemo_selenium.helper.ConfProperties;
import java.util.stream.Stream;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

public class GetLogins implements ArgumentsProvider {
    private static ConfProperties properties;
    public static void setUp() {
        properties = new ConfProperties();
    }
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext)
        throws Exception {
        String standartUserLogin = properties.getProperty("USERNAME_STANDARD");
        String performanceGlitchUser = properties.getProperty("USERNAME_PERFORMANCE");
        return Stream.of(Arguments.of(standartUserLogin), Arguments.of(performanceGlitchUser));
    }
}
