package assignments108to115;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssTagANAV_Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement wl=driver.findElement(By.cssSelector("input[id^='email']"));
		Thread.sleep(2000);
		wl.sendKeys("rama.nutek@gmail.com");
	}

}
