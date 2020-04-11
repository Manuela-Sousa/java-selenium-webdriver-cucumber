package test.definitions.page_objects;

import org.openqa.selenium.By;

public class LoginPage {

    public static By SignInOption() {
        return By.id("nav-link-accountList");
    }

    public static By EmailTextfield() {
        return By.id("ap_email");
    }

    public static By PasswordTextfield() {
        return By.id("ap_password");
    }

    public static By ButtonContinue() {
        return By.xpath("(//input[@id='continue'])[1]");
    }

    public static By ButtonSignIn() {
        return By.id("signInSubmit");
    }

    public static By AccountLoggedIn() {
        return By.xpath("//span[text()='Hello, Manuela']");
    }

}
