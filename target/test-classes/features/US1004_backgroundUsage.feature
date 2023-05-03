@p2 @smoke
Feature: US1004 User uses background for initial common steps
  Background: The first common step for all scenarios
    Given user go to the main page of the amazon

  Scenario: TC03 User searches Nutella with parameterized method

    Then user write and search "Nutella" in the searchBox
    And user tests that search results contain "Nutella"
    And user close the page

  Scenario: TC04 User searches Java with parameterized method

    Then user write and search "Java" in the searchBox
    And user tests that search results contain "Java"
    And user waits 2 seconds
    And user close the page

  Scenario: TC05 User searches Samsung with parameterized method

    Then user write and search "Samsung" in the searchBox
    And user tests that search results contain "Samsung"
    And user close the page