package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_Search 
{

	public static void main(String[] args)// throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.findElement(By.name("q")).sendKeys("India");
		//Thread.sleep(5000);
		//driver.findElement(By.name("btnK")).click();
		//  Unable to locate Search button hence
		//  we are clicking on Enter after entering India*/
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

}
