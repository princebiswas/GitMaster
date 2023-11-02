import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); //run tim epolymorphism
		driver.get("https://www.yatra.com");
		
		driver.manage().window().maximize(); //maximize the browser
		
		WebElement support =driver.findElement(By.xpath("//a[text()='Support ']"));
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(support).perform();
		
		driver.findElement(By.xpath("//a[text()='Talk To Us']")).click();
		
		
		driver.switchTo().frame("iframeChatBot"); //user is inside into the frame
		
		
		driver.findElement(By.xpath("//button[text()='Cancellation']")).click();
		
		driver.switchTo().defaultContent();//user comeout from the frame
		
		driver.findElement(By.id("chatbot_close_button")).click();


	}

}
