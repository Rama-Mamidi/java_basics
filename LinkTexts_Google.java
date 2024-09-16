package assignmentsfrom104;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTexts_Google 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for(int i=0;i<li.size();i++)
		{
			WebElement wl=li.get(i);
			String text=wl.getText();
			System.out.println("LinkText is "+"'"+text+"'"+" and its index is --->"+i);
		}
	}
}
