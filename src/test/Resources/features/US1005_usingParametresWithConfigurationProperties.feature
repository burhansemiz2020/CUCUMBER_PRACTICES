
Feature: US1005 User uses data written in configuration.properties as parameter
   # 3 Scenario olusturup, amazon,wisequarter ve walmart anasayfalarina gidin
  # ve o anasayfalara gittigimizi test edin
  # parametre olarak kullandigimiz kelimeler direk testte kullanilacak datalar olabilecegi gibi
  # configuration.properties'de bulunan key'ler de olabilir
  # Bu durumda stepdefinition'da yolladigimiz key ile
  # ConfigReader'daki getProperty() kullanilip
  # configuration.properties dosyasindaki value testte kullanilabilir

  Scenario: TC06 User tests navigating to amazon site.
    Given user goes to "amazonUrl" homepage
    Then user tests "amazon" in url
    And user close the page

  Scenario: TC07 User tests navigating to wisequarter site.
    Given user goes to "wqUrl" homepage
    Then user tests "wisequarter" in url
    And user close the page

  Scenario: TC08 User tests navigating to walmart site.
    Given user goes to "walmartUrl" homepage
    Then user tests "walmart" in url
    And user close the page


