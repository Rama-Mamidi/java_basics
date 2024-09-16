package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_UsernamePassword 
{
	WebDriver driver;
	@Test(dataProvider="data1")
	public void testlogin(String un,String pwd) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		WebElement wl1=driver.findElement(By.name("email"));
		wl1.sendKeys(un);
		Thread.sleep(2000);
		WebElement cnt=driver.findElement(By.id("continue"));
		cnt.click();
		Thread.sleep(2000);
		WebElement wl2=driver.findElement(By.name("password"));
		wl2.sendKeys(pwd);
		Thread.sleep(2000);
		WebElement signin=driver.findElement(By.id("ignInSubmit"));
		signin.click();
	}
	@DataProvider(name="data1")
	public Object[][] usernamePassword()
	{
		Object d1[][]=new Object[4][2];
		//Row1
		d1[0][0]="9885571577";		//invalid username
		d1[0][1]="Ram321rama%";		//invalid password
		//Row2
		d1[1][0]="988551577";		//invalid username
		d1[1][1]="Ram123ra99ma%";		//valid password
		//Row3
		d1[2][0]="9885571575";		//valid username
		d1[2][1]="Ram123rakesh%";	//invalid password	
		//Row4
		d1[3][0]="9885571575";		//valid username
		d1[3][1]="Ram123ra99ma%";		//valid password
		return d1;
	}

}
