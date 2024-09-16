package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_GoogleSearch 
{
	WebDriver driver;
	@Test(dataProvider="inputs")
	public void search(String input)
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys(input + Keys.ENTER);
	}
	@DataProvider(name="inputs")
	public Object[][] dataforsearch()
	{
		return new Object[][] {{"Narendra Modi"},{"Capital of India"},{"Hyderabad"},{"Bangalore"},{"New Delhi"}};
			
	}
}
	


