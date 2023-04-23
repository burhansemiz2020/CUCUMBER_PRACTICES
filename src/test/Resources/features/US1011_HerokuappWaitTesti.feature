Feature: US1011 User tests that the buttons are visiple on herokuapp page

  Scenario: TC16 User must wait for the buttons to become visible
    Given user goes to "herokuappUrl" homepage
    Then user cliques Add Element button
    And user waits until the Delete button is visible
    And User tests that the Delete button is visible
    Then user deletes the button by pressing the Delete button
    And user tests that the Delete button is not visible







