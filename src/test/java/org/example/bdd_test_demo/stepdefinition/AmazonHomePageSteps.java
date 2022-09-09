package org.example.bdd_test_demo.stepdefinition;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.bdd_test_demo.pageobject.pages.AmazonHomePage;
import org.testng.Assert;

import static org.example.bdd_test_demo.stepdefinition.BaseSteps.PAGES_STORAGE;
import static org.example.bdd_test_demo.stepdefinition.BaseSteps.webDriver;

public class AmazonHomePageSteps {
    @Given("User is currently on {string}")
    public void userIsOnLoginPage(String pageName) {
        AmazonHomePage homePage= new AmazonHomePage(webDriver);
        PAGES_STORAGE.put(pageName,homePage);
        homePage.open();
    }
    @When("User click {string} on {string}")
    public void userClickCategoryinShopByCategory(String category, String pageName) {
        PAGES_STORAGE.put("Result Page", ((AmazonHomePage) PAGES_STORAGE.get(pageName)).shopComputerCat(category));
    }

    @When("User click on specific product category {string} on {string}")
    public void userClickSpecificProductCategory(String category, String pageName) {
        PAGES_STORAGE.put("Result Page", ((AmazonHomePage) PAGES_STORAGE.get(pageName)).shopChair(category));
    }

    @Then("User is successfully navigated to {string}")
    public void userIsSuccessfullyNavigatedToTheHomePage(String expectedUrl) {
        Assert.assertEquals(expectedUrl, webDriver.getCurrentUrl());
    }


}
