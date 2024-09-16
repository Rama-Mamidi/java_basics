package testng_programs;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestNG_LaunchBrowsers_If
{
	WebDriver driver;
	@Test
	public void launchbrowsers()
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter any number to select Browser");
		System.out.println("Press 1 for Google Chrome Browser");
		System.out.println("Press 2 for Mozilla Firefox Browser");
		System.out.println("Press 3 for Edge Browser");
		int browser=s1.nextInt();
		if(browser==1)
		{
			driver=new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
		}
		if(browser==2)
		{
			driver=new FirefoxDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
		}
		if(browser==3)
		{
			driver=new EdgeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
		}
	}
}
