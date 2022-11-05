@tag
Feature: Register feature
  I want to register alta-shop

  @tag1
  Scenario Outline: Register to alta-shop account
    Given I navigated into register page
    Then I fill <Fullname> , <Email> and <Password>
    And I click register button
    Then I navigated to login page

    Examples: 
      | Fullname  | Email | Password  |
      | Budi Hartanto |     Budi123@email.com | budi123 |
      | Budi Hartanto |     null | budi123 |
      | null |     Budi123@email.com | budi123 |
      | Budi Hartanto |     Budi123@email.com | null |
      | null |     null | null |