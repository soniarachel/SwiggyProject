package com.swiggyTest.steps;

import com.swiggyTest.pages.HomePage;
import com.swiggyTest.pages.LocationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class HomeStepdefs {
    HomePage homePage=new HomePage(Hooks.testdriver);
    @And("clicks search button")
    public void clicksSearchButton() {
        homePage.Search();
        System.out.println("user clicks on search button");
    }


    @And("user will enter pizza also clicks on Dominos pizza")
    public void userWillEnterPizzaAlsoClicksOnDominosPizza() {
        System.out.println("user searches pizza");
    }

    @Then("user adds the item to the cart")
    public void userAddsTheItemToTheCart() {
        homePage.AddToCart();
        System.out.println(" the user adds the food item to cart");
    }
}
