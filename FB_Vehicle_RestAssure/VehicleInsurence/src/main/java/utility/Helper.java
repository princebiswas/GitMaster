package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.Random;

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

	public static String randomString(int limit)
	{
		int leftLimit = 97; // letter 'a'
		int rightLimit = 122; // letter 'z'
		int targetStringLength = limit;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int)
					(random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();
		return generatedString;

	}

	public static String randomNumber(int limit)
	{
		int leftLimit = 48; // letter 'a'
		int rightLimit = 57; // letter 'z'
		int targetStringLength = limit;
		Random random = new Random();
		StringBuilder buffer = new StringBuilder(targetStringLength);
		for (int i = 0; i < targetStringLength; i++) {
			int randomLimitedInt = leftLimit + (int)
					(random.nextFloat() * (rightLimit - leftLimit + 1));
			buffer.append((char) randomLimitedInt);
		}
		String generatedString = buffer.toString();
		return generatedString;

	}




//	public void dropdown (WebDriver driver){
//
//		Select sel = new Select(seldropdown);
//	}


// Need help to create dropdown .

	

}
