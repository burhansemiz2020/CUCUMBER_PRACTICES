Feature: US1010 User create a record on the edidor page with scenario outlined in the
  @wip
  Scenario Outline: TC15 Multiple records should be created on the Editor page

    When user goes to "editorUrl" homepage
    Then user cliques the newButton
    Then user type "<firstName>" in the first name box
    And user type "<lastName>" in the last name box
    And user type "<position>" in the position box
    And user type "<office>" in the office box
    And user type "<extension>" in the extension box
    And user type "<startDate>" in the start date box
    And user type "<salary>" in the salary box
    And user cliques createButton
    When user search with "<firstName>"
    Then user verify "<firstName>" in the name box
    And user wait 2 seconds
    Then user close the page




    Examples:
      | firstName | lastName | position  | office   | extension | startDate  | salary |
      | Ilker     | Bulut    | QA        | Istanbul | levent    | 2021-01-01 | 20000  |
      | Ramazan   | Can      | QA lead   | Ankara   | Kizilay   | 2021-10-01 | 25000  |
      | Sule      | Saglam   | Test lead | Izmir    | Konak     | 2022-02-02 | 23000  |
      | Yasar     | U        | QA        | Istanbul | Kadikoy   | 2023-01-01 | 25000  |
      | Meryem    | Toprak   | QA lead   | Istanbul | levent    | 2022-11-11 | 20000  |
