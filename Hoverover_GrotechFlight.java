package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_GrotechFlight 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://grotechminds.com/automate-me/");
		driver.manage().window().maximize();
		WebElement wl1=driver.findElement(By.xpath("//a[@href='https://grotechminds.com/flights/']"));
		Actions a1=new Actions(driver);
		Thread.sleep(3000);
		a1.moveToElement(wl1).perform();
		
	}
}
