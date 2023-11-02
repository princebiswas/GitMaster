package Smoke;

import org.testng.annotations.Test;

import process.LoginProcess;

public class LoginTest extends SetUp {
	
	LoginProcess lp;
	
	@Test
	public void LoginWithInCorrectCreadential()
	{
		 lp = new LoginProcess(driver);
		 lp.LoginWithInValidCredential();
	}
	
	@Test
	public void LoginWithCorrectCreadential() throws InterruptedException
	{
		 lp = new LoginProcess(driver);
		 lp.LoginWithValidCredential();
	}

}
