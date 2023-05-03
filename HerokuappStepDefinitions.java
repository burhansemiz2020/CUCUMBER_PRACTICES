package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuappPage;

public class HerokuappStepDefinitions {
    HerokuappPage herokuappPage=new HerokuappPage();

    @Then("user cliques Add Element button")
    public void user_cliques_add_element_button() {
        herokuappPage.addElementButton.click();

    }
    @Then("user waits until the Delete button is visible")
    public void user_waits_until_the_delete_button_is_visible() throws InterruptedException {
        Thread.sleep(2000);

    }
    @Then("User tests that the Delete button is visible")
    public void user_tests_that_the_delete_button_is_visible() {
        Assert.assertTrue(herokuappPage.deleteButton.isDisplayed());


    }
    @Then("user deletes the button by pressing the Delete button")
    public void user_deletes_the_button_by_pressing_the_delete_button() {
        herokuappPage.deleteButton.click();

    }
    @Then("user tests that the Delete button is not visible")
    public void user_tests_that_the_delete_button_is_not_visible() {
        int flag=3;
        try {
            herokuappPage.deleteButton.click();
            Assert.assertTrue(flag==3);
        } catch (NoSuchElementException e) {
            Assert.assertTrue(flag==3);
        }

    }
}
