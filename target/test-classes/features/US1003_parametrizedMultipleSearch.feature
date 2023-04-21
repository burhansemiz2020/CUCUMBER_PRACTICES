
Feature: US1003 User searches for values entered as parameters

  Scenario: TC03 User searches Nutella with parameterized method

    Given user go to the main page of the amazon
    Then user write and search "Nutella" in the searchBox
    And user tests that search results contain "Nutella"
    And user close the page

  Scenario: TC04 TC03 User searches Java with parameterized method

    Given user go to the main page of the amazon
    Then user write and search "Java" in the searchBox
    And user tests that search results contain "Java"
    And user close the page

  Scenario: TC04 TC03 User searches Samsung with parameterized method

    Given user go to the main page of the amazon
    Then user write and search "Samsung" in the searchBox
    And user tests that search results contain "Samsung"
    And user close the page