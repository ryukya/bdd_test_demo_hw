package org.example.bdd_test_demo.factory;

import org.example.bdd_test_demo.properties.converters.SupportedBrowserConverter;
import org.example.bdd_test_demo.properties.holder.PropertyHolder;
import org.openqa.selenium.WebDriver;

public class WebDriverFactory {
    public WebDriver getWebDriver() {
//        String propertyValue = new PropertyHolder().readProperty("browser");
//        SupportedBrowsers browser = SupportedBrowserConverter.valueOfWebBrowser(propertyValue);
//
//        return browser.getWebDriver();
        return SupportedBrowserConverter.valueOfWebBrowser(
                new PropertyHolder().readProperty("browser"))
                .getWebDriver();
    }
}
