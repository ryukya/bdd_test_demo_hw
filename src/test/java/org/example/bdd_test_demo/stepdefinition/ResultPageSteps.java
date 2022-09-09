package org.example.bdd_test_demo.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.bdd_test_demo.pageobject.modules.WebElementListProcessor;
import org.example.bdd_test_demo.pageobject.pages.ResultPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.bdd_test_demo.stepdefinition.BaseSteps.PAGES_STORAGE;

public class ResultPageSteps {
    private WebElement brandName;

    @And("section tile {string} is present on {string}")
    public void sectionTitleIsPresentOnBanner(String expectedBanner, String pageName) {
        String bannerInfo = ((ResultPage) PAGES_STORAGE.get(pageName)).getComputerSectionBanner().getText();
        Assert.assertEquals(bannerInfo, expectedBanner, "Section title is not match");
    }

    @And("All product title has {string} on it")
    public void allProducthasTitleOnIt(String title) {
        WebElementListProcessor elementIterator = new WebElementListProcessor();
        int sameBrandCheck = elementIterator.checkNotSame1Brand(((ResultPage) PAGES_STORAGE.get("Result Page")).getProductChairList(), title);
        Assert.assertEquals(sameBrandCheck, 0, "Expected 0: There should be (0) no item that doesn't has the speficied product type");
    }

    @When("User choose {string} brand on {string}")
    public void userChooseBrandOn(String brand, String pageName) {
        PAGES_STORAGE.put("Result Page", ((ResultPage) PAGES_STORAGE.get(pageName)).clickbrand(brand));
    }

    @Then("All product result title has {string} on it")
    public void allProductResultTitleHasOnIt(String brand) {
        WebElementListProcessor elementIterator = new WebElementListProcessor();
        int sameBrandCheck = elementIterator.checkNotSame1Brand(((ResultPage) PAGES_STORAGE.get("Result Page")).getProductBrandList(), brand);
        Assert.assertEquals(sameBrandCheck, 0, "Expected 0: There should be (0) no item that doesn't has the speficied brand");
    }
}
