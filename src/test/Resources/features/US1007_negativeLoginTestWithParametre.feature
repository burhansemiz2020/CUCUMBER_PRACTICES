
@wip
Feature: US1007 User cannot login with wrong information


  Scenario: TC10 Negative Login Test with valid username and invalid password

    Given user goes to "qdUrl" homepage
    Then user clicks first page login link
    And user writes "qdGecerliUsername" in the user box
    And user writes "qdGecersizPassword" in the password box
    And user click the cookie button
    And user wait 2 seconds
    Then user click the login button
    And user tests login failure
    And user wait 2 seconds
    Then user close the page

  Scenario: TC11 Negative Login Test with invalid username and valid password

    Given user goes to "qdUrl" homepage
    Then user clicks first page login link
    And user writes "qdGecersizUsername" in the user box
    And user writes "qdGecerliPassword" in the password box
    And user click the cookie button
    And user wait 2 seconds
    Then user click the login button
    And user tests login failure
    And user wait 2 seconds
    Then user close the page

  Scenario: TC12 Negative Login Test with invalid username and invalid password

    Given user goes to "qdUrl" homepage
    Then user clicks first page login link
    And user writes "qdGecersizUsername" in the user box
    And user writes "qdGecersizPassword" in the password box
    And user click the cookie button
    And user wait 2 seconds
    Then user click the login button
    And user tests login failure
    And user wait 2 seconds
    Then user close the page