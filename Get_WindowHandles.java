package basicprograms;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Get_WindowHandles 
{

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("shoe"+Keys.ENTER);
		System.out.println("The title of the page is "+driver.getTitle());
		WebElement e2=driver.findElement(By.xpath("//span[.='Mens Sx0675g Walking Shoe']"));
		e2.click();
		System.out.println("The title of the page is "+driver.getTitle());
		Set s1=driver.getWindowHandles();
		System.out.println(s1);
		driver.close();
		//driver.quit();
		//System.out.println("The title of the page is "+driver.getTitle());
		Set s2=driver.getWindowHandles();
		System.out.println(s2);
	}
}
