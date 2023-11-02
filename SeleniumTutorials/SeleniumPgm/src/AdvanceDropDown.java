import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvanceDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver(); //run tim epolymorphism
		driver.get("https://www.Amazon.com");
		
		driver.manage().window().maximize(); //maximize the browser
		
		WebElement seldropdown = driver.findElement(By.id("searchDropdownBox"));
		
		Select sel = new Select(seldropdown);
		
		List<WebElement> li = sel.getOptions();
		
		System.out.println(li.size());
		
		for(int i = 0 ; i<li.size() ; i++)  //0 0<=57
		{
			li.get(i).click();
			System.out.println(li.get(i).getText()); // [Alldep to wfm].get(1).gettext()
		}
		
		

	}

}
