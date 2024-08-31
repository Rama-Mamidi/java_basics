package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCry_LinkText 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.firstcry.com");
		driver.manage().window().maximize();
		WebElement el=driver.findElement(By.linkText("BOY FASHION"));
		el.click();
	}
	
	
}
