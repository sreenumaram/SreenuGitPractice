package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

public class BackgroudSD {


    @Given("^the user is on the login page$")
    public void the_user_is_on_the_login_page() {
        // Code to navigate to the login page
        System.out.println("Navigated to login page");
    }

    @Given("^the user has a valid username and password$")
    public void the_user_has_a_valid_username_and_password() {
        // Code to set up a valid username and password
        System.out.println("User has valid username and password");
    }

    @When("^the user enters a valid username (.+) and password (.+)$")
    public void the_user_enters_a_valid_username_and_password(String username, String password) {
        // Code to enter username and password
        System.out.println("Entered username: " + username + " and password: " + password);
    }

    @Then("^the user should be logged in successfully$")
    public void the_user_should_be_logged_in_successfully() {
        // Code to verify successful login
        System.out.println("Logged in successfully");
    }

    @Then("^the user should see a login error message$")
    public void the_user_should_see_a_login_error_message() {
        // Code to verify login error message
        System.out.println("Login error message displayed");
    }
}