package Smoke;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class SetUp {
	
	Properties prop;
	WebDriver  driver;
	
	@BeforeClass
	public void Initalization() throws IOException
	{
FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\properties\\config.properties");
		
		prop = new Properties();
		prop.load(fis); //load data inside in to the config file
		
		 driver = new ChromeDriver(); //run tim epolymorphism
		driver.get(prop.getProperty("QA_Url"));
		
		driver.manage().window().maximize(); //maximize the browser
	}
	
	@AfterClass
	public void CleanUp()
	{
		driver.quit();
	}

}
