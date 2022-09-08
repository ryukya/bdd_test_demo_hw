package org.example.bdd_test_demo.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver webDriver;

    protected BasePage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
}
