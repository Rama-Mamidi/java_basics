package assertprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assert_NaukriGoogle 
{
	WebDriver driver;
	@Test
	public void testAssert() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		driver.manage().window().maximize();
		WebElement reg=driver.findElement(By.xpath("//a[.='Register']"));
		reg.click();
		WebElement google=driver.findElement(By.xpath("//span[.='Google']"));
		google.click();
		Set<String> s1=driver.getWindowHandles();
		Iterator i1=s1.iterator();
		String parent=(String) i1.next();
		String child=(String) i1.next();
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(child);
		driver.manage().window().maximize();
		WebElement emailtextbox=driver.findElement(By.xpath("(//input[@class='whsOnd zHQkBf'])[1]"));
		Thread.sleep(3000);
		Assert.assertTrue(emailtextbox.isDisplayed() && emailtextbox.isEnabled());
		System.out.println("Control is in "+"the window --->"+"sign in with google window");
		driver.close();
	}
		

}
