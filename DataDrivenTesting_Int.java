package testng_programs;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting_Int 
{
	int output;
	@Test(dataProvider="inputs")
	public void sum(int input)
	{
		output=output+input;
		
	}
	@AfterTest
	public void printOutput()
	{
		System.out.println("The sum of the numeric inputs provided  is : "+output);
	}
	@DataProvider(name="inputs")
	public Object[][] inputs_int()
	{
		return new Object[][] {{12},{13},{15},{34},{38}};
	}
	
}
