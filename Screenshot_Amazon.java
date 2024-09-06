package basicprograms;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Amazon 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		e1.sendKeys("shoe");
		Thread.sleep(3000);
		List<WebElement> li=driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		li.get(3).click();
		
		TakesScreenshot t1=driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\Software Testing\\Selenium by MKT Sir\\Screenshots\\rama.png");
		FileHandler.copy(source, destination);
		
	}


}
