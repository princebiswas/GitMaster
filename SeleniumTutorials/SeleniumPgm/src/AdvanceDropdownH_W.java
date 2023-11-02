import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvanceDropdownH_W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
	
		WebElement seldropdown = driver.findElement(By.name("country"));
		Select sel = new Select(seldropdown);
		
		
		List<WebElement> li = sel.getOptions();
		
		System.out.println(li.size());
		
		
//		for (int i = 0; i<li.size(); i++)
//		{
//			System.out.println(li.get(i).getText());
//		}
//		
		
		
		// Reverse order -------------------   Question ( if i write li.size ?)
		for (int i =li.size()-1; i> 0 ; i--)
		{
			// click on all options
			li.get(i).click();
			
			System.out.println(li.get(i).getText());
		}
		
		
		

	}

}
