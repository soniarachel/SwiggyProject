package com.swiggyTest.steps;


import com.swiggyTest.pages.SignUpPage;
import com.swiggyTest.steps.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class SignStepdefs {
    SignUpPage signUpPage=new SignUpPage(Hooks.testdriver);
    @Given("the user opened swiggy app")
    public void theUserOpenedSwiggyApp() {
signUpPage.navigate();
        signUpPage.Sign();
    }

    @When("user clicks on SignUp button")
    public void userClicksOnSignUpButton() {
        System.out.println("user clicks on signup");

    }


    @Then("user should be able to see signup page contains {string}")
    public void userShouldBeAbleToSeeSignupPageContains(String expectedtitle) {
   String actualtitle= signUpPage.getTitle();
        Assert.assertEquals(actualtitle,expectedtitle,"title matched in signup page");

    }
}
