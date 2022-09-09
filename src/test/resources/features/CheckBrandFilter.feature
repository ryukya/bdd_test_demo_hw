Feature: Test scenario 3 for Amazon

  Scenario: Check Brand Filter Test
    Given User is currently on "Amazon Home Page"

    When User click "Computers & Accessories" on "Amazon Home Page"

    Then User is successfully navigated to "https://www.amazon.com/"

    And section tile "Computers, Tablets and IT Accessories" is present on "Computers Accessories Page"

    When User choose "Apple" brand on "Result Page"

    Then All product result title has "Apple" on it



