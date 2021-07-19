package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utilities.Driver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Random;

public class GoogleTitleStepDefs {

    String title;
    String url;
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
        System.out.println("Test PASSED");
    }

    @And("User gets the url of the page" )
    public void userGetsTheUrlOfThePage() {
        url = Driver.getDriver().getCurrentUrl();
    }

    @Then("User validates the url" )
    public void userValidatesTheUrl() {
        Assert.assertTrue(url.contains("google"));
        System.out.println("URL Test PASSED");


    }

    public static void main(String[] args) {


        Driver.getDriver().get("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().endsWith("2"));
        System.out.println("URL Test PASSED");
    }

    public static void selectRandomFromList(List<WebElement> elementList) {
        Random random = new Random();
        int optionIndex = 1 + random.nextInt(elementList.size() - 1);
        elementList.get(optionIndex).click();
    }

    public static void saveDataInFile(String fileName, String data) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
            writer.append(data);
            writer.close();
        } catch (Exception e) {
        }
    }
    //intellijideaprojcet/Project/urunBilgileri.txt, urunBilgileri

}
