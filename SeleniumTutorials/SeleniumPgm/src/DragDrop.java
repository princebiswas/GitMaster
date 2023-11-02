import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); //run tim epolymorphism
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize(); //maximize the browser
		
	WebElement StartingPoint = 	driver.findElement(By.xpath("//a[text()=' BANK ']"));
	
	WebElement TargetPosition = driver.findElement(By.id("bank"));
	
	Actions act = new Actions(driver);
	
		
	act.dragAndDrop(StartingPoint, TargetPosition).perform();
		

	}

}
