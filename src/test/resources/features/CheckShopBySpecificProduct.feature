Feature: Test scenario 2 for Amazon

  Scenario: Check Shop By Specific Product Category Test
    Given User is currently on "Amazon Home Page"

    When User click on specific product category "Chairs" on "Amazon Home Page"

    Then User is successfully navigated to "https://www.amazon.com/"

    And All product title has "Chairs" on it


