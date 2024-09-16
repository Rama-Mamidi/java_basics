package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_AmazonSearch 
{
	WebDriver driver;
	@Test(dataProvider="inputs")
	public void search(String searchinput)
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement wl=driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']"));
		wl.sendKeys(searchinput+Keys.ENTER);
	}
	@DataProvider(name="inputs")
	public Object[][] searchInputs()
	{
		return new Object[][] 
				{{"shoe"},{"Mobiles"},{"shoe rack"},{"groceries"},{"Android TV"},
			    {"Juicer"},{"trackpant"},{"harddisk"},{"laptops"},{"Refrigerators"}
				};
	}
	

}
