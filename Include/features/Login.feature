@tag
Feature: Login feature
  I want to login alta-shop

  @tag1
  Scenario Outline: Login to alta-shop account
    Given I navigated into login page
    Then I fill <Email> and <Password>
    And I click login button
    Then I navigated to home page

    Examples: 
      | Email                    | Password       |
      | Budi123@email.com        | budi123        |
      | null                     | budi123        |
      | Budi123@email.com        | null           |
      | Budi123@email.com        | budiganteng123 |
      | Budiganteng123@email.com | budi123        |
      | null        | null        |
