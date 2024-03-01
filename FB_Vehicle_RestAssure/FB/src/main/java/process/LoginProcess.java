package process;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
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
	lp.EmailId_TextBox().sendKeys("biswasmprince@gmail.com");
	lp.Password_TextBox().sendKeys("Mymensingh1!");
	//Thread.sleep(7000);
	//lp.SignInButton().click();
		
	}
	

	public void IncorrectEmailId(){

		lp.EmailId_TextBox().sendKeys("prhfjdsf@mailinators.com");
	}
	public void CorrectEmail() {
		lp.EmailId_TextBox().clear();
		lp.EmailId_TextBox().sendKeys("biswasmprince@gmail.com");
	}
	public void IncorrectPassword() {

		lp.Password_TextBox().sendKeys("22e3444");
	}

	public String ExpectedResult()
	{
		String ExpedtedValue = lp.getErrorData().getText();
		return ExpedtedValue;
	}
	public void correctPassword() {
		lp.Password_TextBox().sendKeys("Mymensingh1!");
	}
	public void SignInButton() {
		lp.SignInButton().click();
	}
//	public void TextBoxClear(){
//		lp.ClearTextBox().clear();
//	}
		
	}
	

