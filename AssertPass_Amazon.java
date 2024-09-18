package practice3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertPass_Amazon 
{
	WebDriver driver;
	@Test
	public void searchField()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		Assert.assertTrue(e1.isDisplayed() && e1.isEnabled());
		System.out.println("Search text field is available");
	}

}
