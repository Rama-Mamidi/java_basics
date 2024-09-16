package testng_programs;

import org.testng.annotations.Test;

public class TestNG_InvocationCountAndPriority 
{
	@Test(invocationCount=5)	//This testcase will be executed 5 times, priority by default will be 0
	public void login()
	{
		System.out.println("Login-Priority0");
	}
	@Test(priority=1) //invocationCount by default will be 1, testcase status by default will be enabled
	public void registration()
	{
		System.out.println("Registration-Priority1");
	}
	@Test(invocationCount=5,priority=2)	//This testcase will be executed 5 times	
	public void logout()
	{
		System.out.println("Logout-Priority2");
	}
}
