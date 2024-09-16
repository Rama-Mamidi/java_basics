package testng_programs;

import org.testng.annotations.Test;

public class TestNG_InvocationCount 
{
	@Test
	public void testcase1()
	{
		System.out.println("Testcase1");
	}
	@Test(invocationCount=5)
	public void testcase2()
	{
		System.out.println("Testcase2");
	}

}
