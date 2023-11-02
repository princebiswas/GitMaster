import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_HomeWork {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		WebElement StartingPoint =driver.findElement(By.xpath("//a[text()=' BANK ']"));
		WebElement EndingPoint = driver.findElement(By.id("bank"));
		Actions acti = new Actions(driver);
		acti.dragAndDrop(StartingPoint, EndingPoint).perform();
		Thread.sleep(1000);
		
		
		WebElement StartingPoint1 =driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		WebElement EndingPoint1 = driver.findElement(By.id("amt7"));
		acti.dragAndDrop(StartingPoint1, EndingPoint1).perform();
		Thread.sleep(1000);
		
		WebElement StartingPoint2 =driver.findElement(By.xpath("//a[text()=' SALES ']"));
		WebElement EndingPoint2 = driver.findElement(By.id("loan"));
		acti.dragAndDrop(StartingPoint2, EndingPoint2).perform();
		Thread.sleep(1000);
		
		WebElement StartingPoint3 =driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement EndingPoint3 = driver.findElement(By.id("amt8"));
		acti.dragAndDrop(StartingPoint3, EndingPoint3).perform();
		Thread.sleep(1000);
		
		//driver.close();
		
		
		
	}

}
