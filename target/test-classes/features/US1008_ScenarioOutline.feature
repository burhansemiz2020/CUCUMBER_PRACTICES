Feature: US1008 Test run for multiple data with scenario outlined
@smoke @p2
  Scenario Outline: TC13 test run for multiple data with scenario outlined
    #go to the amazon mainpage. Search for Java, Samsung and Apple
    #test that the search results contain the word we are looking for.
    Given user goes to "amazonUrl" homepage
    Then user write and search "<arananUrun>" in the searchBox
    And user tests that search results contain "<arananUrun>"
    Then user close the page
    Examples:
      | arananUrun |
      | Nutella    |
      | Java       |
      | Samsung    |
      | Apple      |




