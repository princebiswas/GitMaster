package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import process.LoginProcess;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;
import java.util.Properties;

import static steps.Hooks.driver;


public class Loginsteps {



    LoginProcess lp ;




   @Given("User login with facebook website")
    public void userLoginWithFacebookWebsite() throws IOException {





    }


  /*  @Then("browser should close")
    public void browserShouldClose() {

        driver.quit();

    }*/

    @Then("Enter Correct Email id")
    public void enterCorrectEmailId() {

        lp = new LoginProcess(driver);
        lp.CorrectEmail();


    }

    @Then("Enter Incorrect Password")
    public void enterIncorrectPassword() {

        lp.IncorrectPassword();
    }

    @Then("click on Sigin Button")
    public void clickOnSiginButton() throws InterruptedException {
        lp.SignInButton();
        Thread.sleep(5000);
    }

    @And("Validate the Error")
    public void validateTheError() {

       String ExpectedValue =  lp.ExpectedResult();

        Assert.assertEquals(ExpectedValue,"The email you entered isn’t connected to an account. Find your account and log in.");
    }

    @Then("Enter incorrect Email id")
    public void IncorrectEmailId() {
        lp = new LoginProcess(driver);
        lp.IncorrectEmailId();

    }

    @Then("Enter correct email and Password")
    public void enterCorrectEmailPassword() throws InterruptedException, IOException {
        lp = new LoginProcess(driver);
        lp.LoginWithValidCredential();

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        File DestFile=new File("C:\\Users\\princ\\OneDrive\\Desktop\\GitMaster\\img.png");

        //Copy file at destination

        FileUtils.copyFile(SrcFile, DestFile);
    }


    @Then("Clear the text field")
    public void clearTheTextField() throws InterruptedException {
        lp = new LoginProcess(driver);

        Thread.sleep(2000);


    }

    @Then("Enter correct Password")
    public void enterCorrectPassword() {
        lp.correctPassword();
    }
}
