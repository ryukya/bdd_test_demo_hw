Feature: Test scenario for Git

  Scenario: Login to GitHub
    Given User is on "Login Page"

    When User enters username as "ryukya" and password on "Login Page"

    Then User is successfully navigated to the "https://github.com/"

    And User info "ryukya" on "Home Page" is present on navigation panel


