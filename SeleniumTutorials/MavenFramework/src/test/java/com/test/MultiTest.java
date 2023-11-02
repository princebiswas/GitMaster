package com.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultiTest {

	WebDriver driver;

	@BeforeClass
	public void Initalization() {
		driver = new ChromeDriver(); // run tim epolymorphism
		driver.get("https://www.Amazon.com");

		driver.manage().window().maximize(); // maximize the browser
	}

	@Test()
	public void DropDown() {

		WebElement seldropdown = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(seldropdown);

		sel.selectByIndex(4);// low priority
		sel.selectByValue("search-alias=automotive");
		sel.selectByVisibleText("Digital Music"); // High priority

	}

	@Test(dependsOnMethods ="DropDown" )
	public void AdvanceDropDown() {

		WebElement seldropdown = driver.findElement(By.id("searchDropdownBox"));

		Select sel = new Select(seldropdown);

		List<WebElement> li = sel.getOptions();

		System.out.println(li.size());

		for (int i = 0; i < li.size(); i++) // 0 0<=57
		{
			li.get(i).click();
			System.out.println(li.get(i).getText()); // [Alldep to wfm].get(1).gettext()
		}

		//driver.quit();
	}

	@AfterClass
	public void CleanUp() {
		driver.quit();
	}

}
