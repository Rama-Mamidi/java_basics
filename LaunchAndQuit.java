package practice1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchAndQuit
{
	WebDriver driver;
	@BeforeMethod
	public void browserlaunch()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement wl=driver.findElement(By.name("email"));
		wl.sendKeys("9885571575");
		WebElement cnt=driver.findElement(By.id("continue"));
		cnt.click();
		WebElement pwd=driver.findElement(By.name("password"));
		pwd.sendKeys("Ram123rama%");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
	}
	@AfterMethod
	public void logout() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		TakesScreenshot t1=(TakesScreenshot) driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\Software Testing\\Selenium by MKT Sir\\Screenshots\\amazonsearch"+".png");
		FileHandler.copy(source, destination);
		
		
		WebElement e2=driver.findElement(By.xpath("//span[@class='nav-line-2 ']"));
		Actions a1=new Actions(driver);
		a1.moveToElement(e2).perform();
		Thread.sleep(3000);
		WebElement e3=driver.findElement(By.xpath("//span[.='Sign Out']"));
		e3.click();
		Thread.sleep(2000);
		driver.quit();
	}
	
	

}
