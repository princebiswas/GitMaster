import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownHomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		WebElement drop = driver.findElement(By.name("country"));
		Select sel = new Select(drop);
		
		sel.selectByVisibleText("AMERICAN SAMOA");
		
		
		
		
		
		
		
	}
		
	

}
