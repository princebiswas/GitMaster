import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcard {

	public static void main(String[] args) throws InterruptedException {

// Opening Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");

		// Maximize the browser
		driver.manage().window().maximize();

		// Click on X button
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		Thread.sleep(1000);

		// Click on Electronics
		driver.findElement(By.xpath("//div[text()=\'Electronics\']")).click();
		Thread.sleep(1000);

		// Mouse hover on Men
		WebElement Men = driver.findElement(By.xpath("//span[text()='Men']"));

		Actions act = new Actions(driver);
		act.moveToElement(Men).perform();
		Thread.sleep(3000);

		// Mouse hover on Women
		WebElement Women = driver.findElement(By.xpath("//span[text()='Women']"));

		act.moveToElement(Women).perform();
		Thread.sleep(3000);

		// Click on Sarees
		driver.findElement(By.xpath("//a[text()='Sarees']")).click();
		Thread.sleep(3000);

		driver.close();
	
	}

}
