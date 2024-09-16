package assignments108to115;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Links 
{
	static int validLink_count;
	static int brokenLink_count;
	public static void main(String[] args) throws IOException 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		List<WebElement> li=driver.findElements(By.tagName("a"));
		
		for(int i=0;i<li.size();i++)
		{
			WebElement e1=li.get(i);
			String url=e1.getAttribute("href");
			verify_the_link(url);
		}
		System.out.println("The number of valid links are "+validLink_count);
		System.out.println("The number of broken links are "+brokenLink_count);
		System.out.println(li.size());
	}
	static void verify_the_link(String url) throws IOException,MalformedURLException
	{
		try
		{
			URL u1=new URL(url);
			HttpURLConnection u2=(HttpURLConnection) u1.openConnection();
			if(u2.getResponseCode()==200)
			{
				System.out.println("The link "+url+" is a valid link");
				validLink_count++;
			}
			else
			{
			System.out.println("The link "+url+" is a Broken link");
			brokenLink_count++;
			}
		}
		catch(MalformedURLException m1)
		{
			System.out.println("Handled it");
			brokenLink_count++;
		}
		
	}

}
