package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch_xpath 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//textarea[@name='q']"));
		e1.sendKeys("India"+Keys.ENTER);
	}

}
