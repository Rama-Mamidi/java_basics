package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Amazon_Login 
{
	WebDriver driver;
	@Test
	public void login()
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
	pwd.sendKeys("ramakrish123456%");
	WebElement signin=driver.findElement(By.id("signInSubmit"));
	signin.click();
	}
}
