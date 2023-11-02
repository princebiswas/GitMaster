import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Ebay {

	public static void main(String[] args) throws InterruptedException {
		
		//Opening Chrome browser
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ebay.com/");
		
		//Maximixe the browser
		driver.manage().window().maximize();
		
		WebElement Motor =driver.findElement(By.xpath("(//a[text()='Motors'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(Motor).perform();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[text()='Car & Truck Parts']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
		
		

	}

}
