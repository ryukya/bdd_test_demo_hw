package org.example.bdd_test_demo.pageobject.pages;

import org.example.bdd_test_demo.pageobject.BasePage;
import org.example.bdd_test_demo.pageobject.modules.ProfileDropDownModule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(xpath = "//summary[@class=\"Header-link\"]/img")
    private WebElement profileDropDownButton;

    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public ProfileDropDownModule openProfileDropDown() {
        profileDropDownButton.click();

        return new ProfileDropDownModule(webDriver);
    }
}
