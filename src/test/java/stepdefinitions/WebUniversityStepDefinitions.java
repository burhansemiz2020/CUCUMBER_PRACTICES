package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.Set;

import static java.awt.SystemColor.window;

public class WebUniversityStepDefinitions {
    WebUniversityPage webUniversityPage=new WebUniversityPage();
    String firstPageHandleValue;
    Faker faker=new Faker();


    @Then("user scroll down until Login Portal")
    public void user_scroll_down_until_login_portal() {


    }
    @Then("user click on Login Portal")
    public void user_click_on_login_portal() {
        firstPageHandleValue= Driver.getDriver().getWindowHandle();
        webUniversityPage.loginPortalBox.click();

    }
    @Then("user switch to the other window")
    public void user_switch_to_the_other_window() {
        //eger yeni windowa gecerse, yenisi acilmadan
        //ilk sayfa window handle degerini kaydetmeliyim

        Set<String> windowHandlesSeti= Driver.getDriver().getWindowHandles();
        String secondPageHandleValue="";

        for (String each : windowHandlesSeti) {
            if (!each.equals(firstPageHandleValue)){
                secondPageHandleValue=each;
    }
        }
     Driver.getDriver().switchTo().window(secondPageHandleValue);
    }
    @And("user enter values in the username box")
    public void userEnterValuesInTheUsernameBox() {
        webUniversityPage.userNameBox.sendKeys(faker.name().username());

    }

    @And("user enter values in the password box")
    public void userEnterValuesInThePasswordBox() {
        webUniversityPage.passwordBox.sendKeys(faker.internet().password());

    }

    @And("user press the login button")
    public void userPressTheLoginButton() {
        webUniversityPage.loginBox.click();

    }

    @And("user test if the popup says validation failed")
    public void userTestIfThePopupSaysValidationFailed() {
        String actualPopUpText= Driver.getDriver().switchTo().alert().getText();
        String expectedPopUpYazi="failed";
        Assert.assertTrue(actualPopUpText.contains(expectedPopUpYazi));

    }

    @And("user close the Popup by saying Ok")
    public void userCloseThePopupBySayingOk() {
        Driver.getDriver().switchTo().alert().accept();
    }


    @Then("user back to the first page")
    public void user_back_to_the_first_page() {
        Driver.getDriver().switchTo().window(firstPageHandleValue);


    }
    @Then("user test return to the first page")
    public void user_test_return_to_the_first_page() {
        Assert.assertTrue(webUniversityPage.contactUsLink.isDisplayed());

    }



}
