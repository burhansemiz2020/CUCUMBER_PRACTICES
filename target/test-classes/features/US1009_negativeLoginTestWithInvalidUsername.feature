Feature: Negative login test with invalid Username

  Scenario Outline: TC14 cannot log in with the wrong username
    Given user goes to "qdUrl" homepage
    Then user clicks first page login link
    And user writes manually "<qdGecersizUsername>" in the user box
    And user writes manually "<qdGecersizPassword>" in the password box
    And user wait 2 seconds
    And user click the cookie button
    And user wait 2 seconds
    And user click the login button
    And user tests login failure
    Then user close the page
    Examples:
      | qdGecersizUsername | qdGecersizPassword |
      | ilker              | ilker@a.co         |
      | mehmet             | mehmet@b.com       |
      | yasar              | yasar@c.com        |
      | Adem               | adem@d.com         |
      | ozgur              | ozgur@e.com        |


