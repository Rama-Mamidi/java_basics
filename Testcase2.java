package practice1;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;


public class Testcase2 extends LaunchAndQuit
{
	
	@Test
	public void clickonFirstProduct() throws IOException, InterruptedException
	{
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe" + Keys.ENTER);
		Thread.sleep(3000);
		WebElement e2=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e2.click();
	}
}
