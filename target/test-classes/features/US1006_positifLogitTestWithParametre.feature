
Feature: US1006 User must be able to login with the information in the configuration file
  Scenario: TC09 Positive Login Test with valid username and password

    Given user goes to "qdUrl" homepage
    Then user clicks first page login link
    And user writes "qdGecerliUsername" in the user box
    And user writes "qdGecerliPassword" in the password box
    And user click the cookie button
    And user wait 2 seconds
    Then user click the login button

    And user tests the successful login
    Then user close the page