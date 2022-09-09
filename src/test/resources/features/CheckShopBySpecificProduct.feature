Feature: Test scenario 2 for Amazon

  Scenario: Check Shop By Specific Product Category Test
    Given User is currently on "Amazon Home Page"

    When User click "Computers & Accessories" on "Amazon Home Page"

    Then User is successfully navigated to "https://www.amazon.com/"

    And section tile "Computers, Tablets and IT Accessories" is present on "Computers Accessories Page"


