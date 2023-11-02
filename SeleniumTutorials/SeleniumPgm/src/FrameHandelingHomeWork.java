import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandelingHomeWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com");
		
		driver.manage().window().maximize();
		
		WebElement support = driver.findElement(By.xpath("//a[text()='Support ']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(support).perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Talk To Us']")).click();
		Thread.sleep(2000);
		System.out.println("Click on Talk to US ");
		
		driver.switchTo().frame("iframeChatBot");
		driver.findElement(By.xpath("//button[text()='Cancellation']")).click();
		Thread.sleep(2000);
		System.out.println("Click on Cancelation");
		
		WebElement start = driver.findElement(By.xpath("//button[text()='Start a new chat']"));
		start.click();
		
		System.out.println("Click on Start a new chat");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//button[text()='e-Tickets']")).click();
		Thread.sleep(4000);
		System.out.println("Click on e tickets ");
		
	
		
	///	start.click();
		driver.findElement(By.xpath("//button[text()='Start a new chat']")).click();
		System.out.println("Click on Start a new chat");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[text()='Modification']")).click();
		Thread.sleep(6000);
		System.out.println("Click on Modification");
		
		
		
		
		
		
	}

}
