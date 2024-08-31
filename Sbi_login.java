package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sbi_login 
{
	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		driver.manage().window().maximize();
		WebElement e1=driver.findElement(By.xpath("//a[@class='login_button']"));
		e1.click();
		WebElement e2=driver.findElement(By.xpath("//input[@name='userName']"));
		e2.sendKeys("rkmamidi");
		WebElement e3=driver.findElement(By.xpath("//input[@name='password']"));
		e3.sendKeys("rama123");
		WebElement e4=driver.findElement(By.xpath("//input[@name='loginCaptchaValue']"));
		e4.sendKeys("abc123");
		Thread.sleep(3000);
		WebElement e5=driver.findElement(By.xpath("//input[@id='Button2']"));
		e5.click();
		
	}

}
