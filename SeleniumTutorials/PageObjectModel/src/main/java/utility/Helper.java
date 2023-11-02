package utility;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Helper {
	
	public static int WaitDuration = 30;
	public static int PollingEveryDuration = 6;
	
	public static WebDriver driver;
	public static Wait<WebDriver> wait;
	
	public Helper(WebDriver driver)
	{
		
		this.driver = driver;
		wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(WaitDuration))
				.pollingEvery(Duration.ofSeconds(PollingEveryDuration))
				.ignoring(NoSuchElementException.class);
		
	}
	
	

	public static WebElement getElementById(String Locator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Locator)));
	}
	

	public static WebElement getElementByName(String Locator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.name(Locator)));
	}
	

	public static WebElement getElementByXpath(String Locator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Locator)));
	}
	
	public static WebElement getElementByclassname(String Locator)
	{
		return wait.until(ExpectedConditions.visibilityOfElementLocated(By.className(Locator)));
	}
	
	
	

}
