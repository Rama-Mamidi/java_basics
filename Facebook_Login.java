package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Login 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement wl=driver.findElement(By.name("email"));
		wl.sendKeys("rama.nutek@gmail.com");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("abcedee22233");
		WebElement login_button=driver.findElement(By.name("login"));
		login_button.click();
	}
}
