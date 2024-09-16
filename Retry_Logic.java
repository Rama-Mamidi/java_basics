package testng_programs;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry_Logic implements IRetryAnalyzer 
{
	int current_count=0;
	int no_of_retry=2;

	@Override
	public boolean retry(ITestResult result) 
	{
		if(current_count<0)
		{
			current_count++;
			return true; //retry
		}
		return false;	//don't retry
	}

}
