package steps;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Hooks {

      static WebDriver driver;
     static Properties prop;

    @BeforeAll(order = 0)
    public static void beforeScenario() throws IOException {

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\properties\\config.properties");

        prop = new Properties();
        prop.load(fis); //load data inside in to the config file
        ChromeOptions Option = new ChromeOptions();
        Option.addArguments("--disable-notifications");
        driver = new ChromeDriver(Option); //run tim epolymorphism
        driver.get(prop.getProperty("QA_Url"));
        driver.manage().deleteAllCookies();

        driver.manage().window().maximize(); //maximize the browser
    }


    @AfterAll
    public static void afterScenario(){
        driver.quit();
    }
}
