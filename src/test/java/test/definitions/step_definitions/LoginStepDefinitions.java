package test.definitions.step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.definitions.actions.LoginScenariosActions;

import static test.definitions.factory.WebDriverFactory.driver;

public class LoginStepDefinitions {

    LoginScenariosActions loginPage = new LoginScenariosActions();

    @Given("^The user opens Amazon website$")
    public void theUserIsInAmazonWebsite() {
        driver.get("https://www.amazon.com");
    }

    @When("^Makes login with valid (.*) and (.*)$")
    public void makesLoginWithValidUserAndPassword(String email, String password) {
        loginPage.login(email, password);
    }

    @Then("^Sees user logged in menu$")
    public void seeUserLoggedInMenu() {
        loginPage.sees_logged_in_user();
    }
}
