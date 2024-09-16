package testng_programs;

import org.testng.annotations.Test;

public class TestNG_DefaultPriority 
{
	@Test
	public void login()
	{
		System.out.println("Login-Priority0");
	}
	@Test
	public void registration()
	{
		System.out.println("Registration-Priority2");
	}
	@Test
	public void logout()
	{
		System.out.println("Logout-Priority1");
	}

}
