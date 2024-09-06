package basicprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion_Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("shoe");
		Thread.sleep(3000);
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		li.get(3).click();
	}


}
