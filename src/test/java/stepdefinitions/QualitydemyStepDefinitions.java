package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.QualitydemyPage;
import utilities.ConfigReader;

public class QualitydemyStepDefinitions {
    QualitydemyPage qualitydemyPage=new QualitydemyPage();
    @Then("user clicks first page login link")
    public void user_clicks_first_page_login_link() {
        qualitydemyPage.firstLoginLink.click();

    }
    @Then("user writes {string} in the user box")
    public void user_writes_in_the_user_box(String usernameWanted) {
        qualitydemyPage.emailBox.sendKeys(ConfigReader.getProperty(usernameWanted));

    }
    @Then("user writes {string} in the password box")
    public void user_writes_in_the_password_box(String passwordWanted) {
        qualitydemyPage.passwordBox.sendKeys(ConfigReader.getProperty(passwordWanted));
    }

    @And("user wait {int} seconds")
    public void userWaitSeconds(int seconds) throws InterruptedException {
        Thread.sleep(seconds* 1000L);
    }


    @Then("user click the login button")
    public void user_click_the_login_button() {
        qualitydemyPage.loginButton.click();

    }
    @Then("user click the cookie button")
    public void userClickTheCookieButton() {
        qualitydemyPage.cookiesAcceptButton.click();
    }

    @Then("user tests the successful login")
    public void user_tests_the_successful_login() {
        Assert.assertTrue(qualitydemyPage.succedEntryButton.isDisplayed());

    }


    @And("user tests login failure")
    public void userTestsLoginFailure() {
        Assert.assertTrue(qualitydemyPage.emailBox.isDisplayed());
    }

    @And("user writes manually {string} in the user box")
    public void userWritesManuallyInTheUserBox(String Username) {
        qualitydemyPage.emailBox.sendKeys(Username);

    }

    @And("user writes manually {string} in the password box")
    public void userWritesManuallyInThePasswordBox(String Password) {

        qualitydemyPage.passwordBox.sendKeys(Password);
    }
}
