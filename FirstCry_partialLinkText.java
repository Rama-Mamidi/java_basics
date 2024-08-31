package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstCry_partialLinkText 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.firstcry.com");
		driver.manage().window().maximize();
		WebElement el=driver.findElement(By.partialLinkText("GIRL"));
		el.click();
	}

}
