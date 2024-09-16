package assignments108to115;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTagClassname_GoogleSearch 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement wl=driver.findElement(By.cssSelector("textarea.gLFyf"));
		wl.sendKeys("Grotechminds"+Keys.ENTER);
	}


}
