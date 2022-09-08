Feature: Test scenario for Amazon

  Scenario: Check Brand Test

    Given User is on "Amazon Home Page"

    When User click "Computers & Accessories" on "Amazon Home Page"

    Then User is successfully navigated to the "Computers Accessories Page"

    And section tile "Computers, Tablets and IT Accessories" is present on "Computers Accessories Page"


