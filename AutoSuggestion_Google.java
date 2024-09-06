package basicprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestion_Google 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.name("q"));
		e1.sendKeys("Bangalore");
		Thread.sleep(3000);
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		li.get(9).click();
	}

}
