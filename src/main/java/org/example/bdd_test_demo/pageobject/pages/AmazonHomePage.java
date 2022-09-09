package org.example.bdd_test_demo.pageobject.pages;

import org.example.bdd_test_demo.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonHomePage extends BasePage {

    public AmazonHomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public AmazonHomePage open() {
        webDriver.get("https://www.amazon.com");
        return this;
    }

    public ResultPage shopComputerCat(String categoryType) {
        WebElement productCateButton = webDriver.findElement(By.xpath("//a[@aria-label='" + categoryType + "']"));
        productCateButton.click();
        return new ResultPage(webDriver);
    }

    public ResultPage shopChair(String productType) {
        WebElement productCateButton = webDriver.findElement(By.xpath("//img[@alt=\"" + productType + "\"]"));
        productCateButton.click();
        return new ResultPage(webDriver);
    }
}
