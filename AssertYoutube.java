package assertprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertYoutube 
{
	WebDriver driver;
	@Test
	public void commentYoutube() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.youtube.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement search=driver.findElement(By.xpath("//input[@id='search']"));
		Thread.sleep(3000);
		search.click();
		//driver.findElement(by.)
		search.sendKeys("GrotechMinds"+Keys.ENTER);
		Thread.sleep(3000);
		WebElement subscribe=driver.findElement(By.xpath("//a[@class='yt-spec-button-shape-next yt-spec-button-shape-next--filled yt-spec-button-shape-next--mono yt-spec-button-shape-next--size-m yt-spec-button-shape-next--enable-backdrop-filter-experiment']"));
		subscribe.click();
		WebElement emailtb=driver.findElement(By.id("identifierId"));
		Assert.assertTrue(emailtb.isDisplayed() && emailtb.isEnabled());
		System.out.println("Enter emailId to subscribe");
	}

}
