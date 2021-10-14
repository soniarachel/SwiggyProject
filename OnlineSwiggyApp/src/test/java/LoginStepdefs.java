import com.swiggyTest.pages.LocationPage;
import com.swiggyTest.pages.Loginpage;
import com.swiggyTest.steps.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginStepdefs {
    Loginpage loginpage=new Loginpage(Hooks.testdriver);
    @Given("user will enter into swiggy application")
    public void userWillEnterIntoSwiggyApplication() {
        System.out.println("user enters the swiggy application ");
loginpage.navigate();
    }

    @When("user clicks on login button")
    public void userClicksOnLoginButton() {
        System.out.println("user clicks on login button");
        loginpage.Login();
    }


    @Then("user will be navigated to login page contains {string}")
    public void userWillBeNavigatedToLoginPageContains(String expectedtitle) {
        String actualtitle=loginpage.getTitle();
        Assert.assertEquals(actualtitle,expectedtitle,"title not matched");
    }
}
