package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.EditorPage;

public class EditorStepDefinitions {
    EditorPage editorPage=new EditorPage();



    @Then("user cliques the newButton")
    public void userCliquesTheNewButton() {
        editorPage.newButton.click();
    }

    @Then("user type {string} in the first name box")
    public void user_type_in_the_first_name_box(String firstName) {
        editorPage.firstName.sendKeys(firstName);


    }

    @Then("user type {string} in the last name box")
    public void user_type_in_the_last_name_box(String lastName) {
        editorPage.lastName.sendKeys(lastName);

    }

    @Then("user type {string} in the position box")
    public void user_type_in_the_position_box(String position) {
        editorPage.position.sendKeys(position);

    }

    @Then("user type {string} in the office box")
    public void user_type_in_the_office_box(String office) {
        editorPage.office.sendKeys(office);

    }

    @Then("user type {string} in the extension box")
    public void user_type_in_the_extension_box(String extension) {
        editorPage.extension.sendKeys(extension);

    }

    @Then("user type {string} in the start date box")
    public void user_type_in_the_start_date_box(String startDate) {
        editorPage.startDate.sendKeys(startDate);

    }

    @Then("user type {string} in the salary box")
    public void user_type_in_the_salary_box(String salary) {
        editorPage.salary.sendKeys(salary);

    }

    @Then("user cliques createButton")
    public void user_cliques_createButton() {
        editorPage.createButton.click();

    }

    @When("user search with {string}")
    public void user_search_with(String firstname) {
        editorPage.searchBox.sendKeys(firstname + Keys.ENTER);

    }

    @Then("user verify {string} in the name box")
    public void user_verify_in_the_name_box(String firstName) {
        String actualFileNameStr=editorPage.firstNameElement.getText();
        Assert.assertTrue(actualFileNameStr.contains(firstName));

    }


}
