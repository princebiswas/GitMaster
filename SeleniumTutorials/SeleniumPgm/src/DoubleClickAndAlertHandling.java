import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndAlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); //run tim epolymorphism
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize(); //maximize the browser
		
	WebElement dblclickbutton = 	driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

	Actions act = new Actions(driver);
	
	act.doubleClick(dblclickbutton).perform();//pop up open
	
	Alert alrt = driver.switchTo().alert();//controll move to popup
	
	alrt.accept(); //click on ok buuton
	
	//alrt.dismiss(); //cancel button in pop 
	
	}

}
