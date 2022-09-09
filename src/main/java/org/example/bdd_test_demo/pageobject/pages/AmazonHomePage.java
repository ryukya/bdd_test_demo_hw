package org.example.bdd_test_demo.pageobject.pages;

import org.example.bdd_test_demo.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AmazonHomePage extends BasePage {

    @FindBy(xpath = "//a[@aria-label='Computers & Accessories']")
    private WebElement shopComputerCategory;

    @FindBy(xpath = "//img[@alt=\"Chairs\"]")
    private WebElement shopSpecificProductCategory;


    public AmazonHomePage(WebDriver webDriver) {
        super(webDriver);
    }
    public AmazonHomePage open() {
        webDriver.get("https://www.amazon.com");
        return this;
    }

    public ResultPage  shopComputerCat() {
        shopComputerCategory.click();
        return new ResultPage(webDriver);
    }

    public ResultPage  shopChair() {
        shopSpecificProductCategory.click();
        return new ResultPage(webDriver);
    }
}
