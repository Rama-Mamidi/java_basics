package assignmentsfrom104;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Dateformat 
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
		
		Date d1=new Date();
		System.out.println(d1.getTime());
		Date d2=new Date(d1.getTime());
		String time=d2.toString();
		String time1=time.substring(11,19);
		String time2=time1.replaceAll(":", "");
		
		TakesScreenshot t1=driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\Software Testing\\Selenium by MKT Sir\\Screenshots\\rama"+time2+".png");
		FileHandler.copy(source, destination);

	}

}
