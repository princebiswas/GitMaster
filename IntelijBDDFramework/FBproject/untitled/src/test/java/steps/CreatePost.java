package steps;

import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pageobject.CreatePostPage;
import process.CreatePostProcess;

import static steps.Hooks.driver;


public class CreatePost {
    CreatePostProcess cp;
   // public WebDriver driver;


    @Then("Click on Menu")
    public void clickOnMenuButton() {
        cp = new CreatePostProcess(driver);
        cp.ClickOnMenuButton();


    }

    @Then("click on Post")
    public void clickOnPost() {
    }

    @Then("Type in what's on your mind")
    public void typeInWhatSOnYourMind() {
    }

    @Then("Click on Post")
    public void clickOnPost_button() {
    }
}
