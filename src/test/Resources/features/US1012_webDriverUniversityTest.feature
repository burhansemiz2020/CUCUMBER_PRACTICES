Feature: US1012 Window Test

  Scenario: TC17 User should be able to test the new window

    Given user goes to "wduUrl" homepage
    Then user scroll down until Login Portal
    And user click on Login Portal
    And user switch to the other window
    And user enter values in the username box
    And user enter values in the password box
    And user press the login button
    And user wait 5 seconds
    And user test if the popup says validation failed
    And user close the Popup by saying Ok
    And user back to the first page
    And user test return to the first page
    And user close all the page





