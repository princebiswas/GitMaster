import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); //run tim epolymorphism
		driver.get("https://www.Amazon.com");
		
		driver.manage().window().maximize(); //maximize the browser
		
		WebElement seldropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select sel = new Select(seldropdown);
		
		sel.selectByIndex(4);//low priority
		sel.selectByValue("search-alias=automotive");
		sel.selectByVisibleText("Digital Music"); //High priority
		

	}

}
