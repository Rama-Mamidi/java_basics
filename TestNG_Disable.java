package testng_programs;

import org.testng.annotations.Test;

public class TestNG_Disable 
{
	@Test										//By default testcase is enabled, no need to explicitly enable it
	public void login()
	{
		System.out.println("Login-Priority1");
	}
	@Test(enabled=false)						//This testcase will not be executed since it is disabled
	public void registration()
	{
		System.out.println("Registration-Priority0");
	}
	@Test(enabled=true)							//Explicitly enabled just for checking	
	public void logout()
	{
		System.out.println("Logout-Priority3");
	}

}
