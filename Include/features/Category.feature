
@tag
Feature: Category feature

  @tag1
  Scenario Outline: Title of your scenario outline
    Given I navigated to home page
    When I click dropdownbox button
    And I select an item
    Then Showed the item 

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |