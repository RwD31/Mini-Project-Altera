
@tag
Feature: Logout feature
  I want to logout from alta-shop

  @tag1
  Scenario Outline: Logout from alta-shop account
    Given I navigated into login page
    Then I fill <Email> and <Password>
    And I click login button
    Then I navigated to home page
    And I click the log out button
    Then I should be logged out 
    
    Examples: 
      | Email                    | Password       |
      | Budi123@email.com        | budi123        |

    