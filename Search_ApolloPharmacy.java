package basicprograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_ApolloPharmacy 
{
	public static void main(String[] args) throws InterruptedException
	{
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.apollopharmacy.in");
	driver.manage().window().maximize();
	WebElement e1=driver.findElement(By.xpath("//div[@class='SearchPlaceholder_searchRoot__LWDXI icon-searchIcon SearchPlaceholder_icon___bJlq']"));
	e1.click();
	WebElement e2=driver.findElement(By.xpath("//input[@id='searchProduct']"));
	e2.sendKeys("PCM"+Keys.ENTER);
	Thread.sleep(5000);
	List<WebElement> li=driver.findElements(By.xpath("//div[@class='ProductCard_pcContainer__T_QfH']/div/div/div/div"));
	System.out.println(li.size());
	li.get(3).click();
		
	}
}
