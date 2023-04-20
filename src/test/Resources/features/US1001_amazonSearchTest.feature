Feature: US1001 The user make test on the Amazon
  Scenario: TC01 User search Nutella on Amazon
    Given user go to the main page of the amazon
    Then user write and search Nutella in the searchBox
    And user tests that search results contain Nutella
    Then user close the page