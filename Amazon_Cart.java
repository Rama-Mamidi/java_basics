package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Cart 
{

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("shoe"+Keys.ENTER);
		WebElement e2=driver.findElement(By.xpath("//span[.='Mens Sx0675g Walking Shoe']"));
		e2.click();
		Thread.sleep(3000);
		WebElement e3=driver.findElement(By.name("submit.add-to-cart"));
		e3.click();
	}

}
