package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_signin 
{
	public static void main(String[] args)
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("(//div[@class='yt-spec-touch-feedback-shape__fill'])[4]"));
		e1.click();
	}

}
