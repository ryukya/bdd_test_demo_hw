package org.example.bdd_test_demo;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"src/test/java/org/example/bdd_test_demo/stepdefinition"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
