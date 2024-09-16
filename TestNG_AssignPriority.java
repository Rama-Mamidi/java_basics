package testng_programs;

import org.testng.annotations.Test;

public class TestNG_AssignPriority
{
		@Test(priority=1)			//Priority assigned is 1 this will be executed second
		public void login()
		{
			System.out.println("Login-Priority1");
		}
		@Test						//Default priority is 0 hence this executes first
		public void registration()
		{
			System.out.println("Registration-Priority0");
		}
		@Test(priority=3)			//Priority assigned is 3 this will be executed last
		public void logout()
		{
			System.out.println("Logout-Priority3");
		}
}
