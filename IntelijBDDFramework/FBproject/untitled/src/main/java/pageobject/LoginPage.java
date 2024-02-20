package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utility.Helper;

public class LoginPage extends Helper {
	public final static String Email_name="email";
	public final static String Password_name="pass";
	public final static String SignIn_name="login";
	
	public WebElement element = null ;


	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public WebElement EmailId_TextBox()
	{
		element = getElementByName(Email_name);
		return element;
	}
	
	public WebElement Password_TextBox()
	{
		element = getElementByName(Password_name);
		return element;
	}
	
	public WebElement SignInButton()
	{
		element = getElementByName(SignIn_name);
		return element;
	}

	public WebElement getErrorData()
	{
		element = getElementByXpath("(//div[@id='email_container']/div)[2]");
		return element;
	}


//	public WebElement ClearTextBox()
//	{
//		element = getElementByName(Email_name);
//		return element;
//	}

	//Using for object creation 

}
