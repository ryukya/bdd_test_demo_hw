package org.example.bdd_test_demo.pageobject.pages;

import org.example.bdd_test_demo.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ResultPage extends BasePage {

    @FindBy(xpath = "//div[@class='a-section a-spacing-none']/descendant::span[.='Apple']")
    private WebElement ChooseAppleBrand;

    @FindBy(xpath = "//div[@class='a-section a-spacing-none']/descendant::span[.='Roku']")
    private WebElement ChooseRokuBrand;

    @FindBy(xpath = "//div[@class='fst-h1-st pageBanner']/descendant::b[.='Computers, Tablets and IT Accessories']")
    private WebElement computerSectionBanner;

    @FindAll({@FindBy(xpath = "//div[@class='s-main-slot s-result-list s-search-results sg-row']/descendant::span[@class='a-size-base-plus a-color-base a-text-normal']")})
    public List<WebElement> productTitleList;

    @FindAll({@FindBy(xpath = "//h2[@class='a-size-mini a-spacing-none a-color-base s-line-clamp-2']")})
    public List<WebElement> productChairList;

    public ResultPage(WebDriver webDriver) {
        super(webDriver);
    }
}