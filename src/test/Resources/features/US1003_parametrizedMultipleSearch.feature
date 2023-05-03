
Feature: US1003 User searches for values entered as parameters
 @p1 @smoke
  Scenario: TC03 User searches Nutella with parameterized method

    Given user go to the main page of the amazon
    Then user write and search "Nutella" in the searchBox
    And user tests that search results contain "Nutella"
    And user close the page
  @p2
  Scenario: TC04 User searches Java with parameterized method

    Given user go to the main page of the amazon
    Then user write and search "Java" in the searchBox
    And user tests that search results contain "Java"
    And user close the page
  @p1
  Scenario: TC05 User searches Samsung with parameterized method

    Given user go to the main page of the amazon
    Then user write and search "Samsung" in the searchBox
    And user tests that search results contain "Samsung"
    And user close the page