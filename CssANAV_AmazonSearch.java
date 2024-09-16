package assignments108to115;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssANAV_AmazonSearch 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement wl=driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']"));
		wl.sendKeys("groceries"+Keys.ENTER);
	}

}
