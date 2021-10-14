package com.swiggyTest.steps;


import com.swiggyTest.pages.LocationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LocationStepdefs {
    LocationPage locationpage=new LocationPage(Hooks.testdriver);
    @Given("user has opened swiggy application")
    public void userHasOpenedSwiggyApplication() {
        System.out.println("opening swiggy application");
        locationpage.navigate();

    }

    @When("user enters the location")
    public void userEntersTheLocation() {
        System.out.println("user enters the location");
       locationpage.sendLocation();
    }
}
