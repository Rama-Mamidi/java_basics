package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_AmazonCategory 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement wl=driver.findElement(By.name("url"));
		Select s1=new Select(wl);
		s1.selectByIndex(12);
		Thread.sleep(3000);
		s1.selectByValue("search-alias=amazon-pharmacy");
		Thread.sleep(3000);
		s1.selectByVisibleText("Car & Motorbike");
	}

}
