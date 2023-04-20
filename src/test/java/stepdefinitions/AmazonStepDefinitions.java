package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {
    AmazonPage amazonPage=new AmazonPage();

    @Given("user go to the main page of the amazon")
    public void user_go_to_the_main_page_of_the_amazon() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));

    }
    @Then("user write and search Nutella in the searchBox")
    public void user_write_and_search_nutella_in_the_search_box() {
        amazonPage.amazonSearchElement.sendKeys("Nutella" + Keys.ENTER);

    }
    @Then("user tests that search results contain Nutella")
    public void user_tests_that_search_results_contain_nutella() {
        String actualSearchResult=amazonPage.searchResultElement.getText();
        String expectedSearchResult="Nutella";
        Assert.assertTrue(actualSearchResult.contains(expectedSearchResult));

    }
    @Then("user close the page")
    public void user_close_the_page() {
        Driver.closeDriver();

    }
}
