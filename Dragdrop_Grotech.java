package basicprograms;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop_Grotech 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		WebElement wl1=driver.findElement(By.id("container-6"));
		Actions a1=new Actions(driver);
		WebElement wl2=driver.findElement(By.xpath("//div[@id='div2']"));
		a1.dragAndDrop(wl1, wl2).perform();
		Thread.sleep(3000);
		a1.dragAndDrop(wl2, wl1).perform();
	}
}
