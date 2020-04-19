package test.definitions.actions;

import static test.definitions.actions.SharedActions.getSharedActions;
import static test.definitions.page_objects.LoginPage.*;

public class LoginScenariosActions {

    SharedActions sharedActions = getSharedActions();

    public LoginScenariosActions() {
        //hide it
    }

    public static LoginScenariosActions getLoginScenariosActions() {
        return new LoginScenariosActions();
    }

    public LoginScenariosActions login(String email, String password) {
        sharedActions.clickOnElement(SignInOption());
        sharedActions.insertKeys(email, EmailTextfield());
        sharedActions.clickOnElement(ButtonContinue());
        sharedActions.insertKeys(password, PasswordTextfield());
        sharedActions.clickOnElement(ButtonSignIn());
        return this;
    }

    public void sees_logged_in_user() {
        sharedActions.verifyIsDisplayed(AccountLoggedIn());
    }
}
