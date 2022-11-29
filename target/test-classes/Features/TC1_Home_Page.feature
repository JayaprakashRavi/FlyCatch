
Feature: Verifying the FlyCatch Home page

  Scenario: Verifying FlyCatch Home
    Given User is on the FlyCatch page
    When User should navigate to Company CSS Dropdown
    Then User should click Contact_Us
    And User should verify after Navigated to Contact_Us

  Scenario: Verifying FlyCatch Home using JavaScript
    Given User is on the FlyCatch page
    When User should navigate to Company CSS Dropdown using JS
    Then User should click Contact_Us using JS
    And User should verify after Navigated to Contact_Us
