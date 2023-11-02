package process;

import org.openqa.selenium.WebDriver;

import pageobject.LoginPage;
import utility.Helper;

public class LoginProcess extends Helper{
	
	LoginPage lp = new LoginPage(driver);
	

	public LoginProcess(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//any kind of action - either send keys /click /screenshot and any exception 

	public void LoginWithValidCredential() throws InterruptedException
	{
	lp.EmailId_TextBox().sendKeys("abc@gmail.com");
	lp.Password_TextBox().sendKeys("12345455");
	//Thread.sleep(7000);
	lp.SignInButton().click();
		
	}
	

	public void LoginWithInValidCredential()
	{
	lp.EmailId_TextBox().sendKeys("abc11@gmail.com");
	lp.Password_TextBox().sendKeys("22e3444");
	lp.SignInButton().click();
		
	}
	
}
