@smoke
Feature: Verifying the FlyCatch Contact_Us page

  Scenario Outline: Verifying LET’S TALK!request
    Given User is on the FlyCatch page
    When User should navigate to Company CSS Dropdown
    Then User should click Contact_Us
    Then User should Send Message using "<Name>","<E-mail>","<Phone>","<SelectYourCountry>","<Subject>" and "<Message>"
    And User should verify after success message "We've received your request!! Will will reach you out very soon!!"

    Examples: 
      | Name  | E-mail             | Phone      | SelectYourCountry | Subject                | Message                         |
      | Anish | 18anishs@gmail.com | 8098860918 | India             | FlyCatchTestAutomation | Please_Ignore_Automated_message |
