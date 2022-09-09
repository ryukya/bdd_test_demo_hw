package org.example.bdd_test_demo.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.bdd_test_demo.pageobject.pages.AmazonHomePage;
import org.example.bdd_test_demo.pageobject.pages.ResultPage;
import org.testng.Assert;

import static org.example.bdd_test_demo.stepdefinition.BaseSteps.PAGES_STORAGE;

public class ResultPageSteps {
    @And("section tile {string} is present on {string}")
    public void sectionTitleIsPresentOnBanner(String expectedBanner, String pageName) {
                String bannerInfo = ((ResultPage) PAGES_STORAGE.get(pageName)).getComputerSectionBanner().getText();
        Assert.assertEquals(bannerInfo, expectedBanner, "Section title is not match");
    }
}
