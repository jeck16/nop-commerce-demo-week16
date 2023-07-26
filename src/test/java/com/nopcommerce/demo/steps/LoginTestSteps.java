package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.utility.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTestSteps extends Utility {
    @Given("I am on home page")
    public void iAmOnHomePage() {
    }

    @When("I Click on login link")
    public void iClickOnLoginLink() {
    }

    @Then("I verify welcome message {string}")
    public void iVerifyWelcomeMessage(String arg0) {
    }

    @And("I Enter EmailId {string}")
    public void iEnterEmailId(String arg0) {
    }

    @And("I Enter Password {string}")
    public void iEnterPassword(String arg0) {
    }

    @And("I Click on Login Button")
    public void iClickOnLoginButton() {
    }

    @Then("I Verify the Error message")
    public void iVerifyTheErrorMessage() {
    }

    @Then("I Verify that LogOut link is display")
    public void iVerifyThatLogOutLinkIsDisplay() {
    }

    @And("I Click on LogOut Link")
    public void iClickOnLogOutLink() {
    }

    @Then("I Verify that LogIn Link Display")
    public void iVerifyThatLogInLinkDisplay() {
    }
}
