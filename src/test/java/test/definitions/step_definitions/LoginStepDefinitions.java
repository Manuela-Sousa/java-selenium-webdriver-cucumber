package test.definitions.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.definitions.page_objects.LoginPage;

import static test.definitions.factory.WebDriverFactory.driver;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("^The user opens Amazon website$")
    public void theUserIsInAmazonWebsite() throws Throwable {
        driver.get("https://www.amazon.com");
    }

    @When("^Makes login with valid <user> and <password>$")
    public void makesLoginWithValidUserAndPassword() throws Throwable {
        loginPage.login();
    }

    @Then("^See user logged in menu$")
    public void seeUserLoggedInMenu() throws Throwable {

    }
}
