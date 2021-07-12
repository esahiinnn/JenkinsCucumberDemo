package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

public class GoogleTitleStepDefs {

    String title;
    @Given("User goes to google home page")
    public void userGoesToGoogleHomePage() {
        Driver.getDriver().get("https://www.google.com");
    }

    @And("User gets the title of the page")
    public void userGetsTheTitleOfThePage() {
       title = Driver.getDriver().getTitle();
    }

    @Then("User validates the title")
    public void userValidatesTheTitle() {
      Assert.assertEquals("Google", title);
    }
}
