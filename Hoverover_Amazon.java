package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hoverover_Amazon 
{

	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		//WebElement el=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		WebElement el=driver.findElement(By.id("nav-link-accountList"));
		Actions a1=new Actions(driver);
		a1.moveToElement(el).perform();
		WebElement e2=driver.findElement(By.linkText("Sign in"));
		e2.click();
		

	}

}
