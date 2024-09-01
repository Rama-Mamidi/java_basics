package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_gmail 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		WebElement wl=driver.findElement(By.linkText("Gmail"));
		Actions a1=new Actions(driver);
		a1.doubleClick(wl).perform();
		

	}

}
