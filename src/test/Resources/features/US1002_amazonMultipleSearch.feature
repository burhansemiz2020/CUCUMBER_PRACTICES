
Feature: US1002 User searches multiple products on amazon page

  Scenario: TC02 User should be able to search and test products
    Given user go to the main page of the amazon
    Then user write and search Nutella in the searchBox
    And user tests that search results contain Nutella
    And user close the page

    Given user go to the main page of the amazon
    #And user waits 2 seconds
    Then user write and search Java in the searchBox
    And user tests that search results contain Java
    And user close the page

    Given user go to the main page of the amazon
    #And user waits 2 seconds
    Then user write and search Samsung in the searchBox
    And user tests that search results contain Samsung
    And user close the page