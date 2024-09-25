package assertprograms;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assert_Amazon_AddToCart 
{
	WebDriver driver;
	@BeforeMethod
	public void signin_Amazon()
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
		pwd.sendKeys("Rjjhjkra%");
		WebElement signin=driver.findElement(By.id("signInSubmit"));
		signin.click();
	}
	@Test
	public void searchAndClick() throws InterruptedException
	{
		WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		e1.sendKeys("shoe" + Keys.ENTER);
		Thread.sleep(3000);
		WebElement e2=driver.findElement(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		e2.click();
		Set<String> s1=driver.getWindowHandles();
		Iterator i1=s1.iterator();
		String parentId=(String) i1.next();
		String childId=(String) i1.next();
		
		driver.switchTo().window(childId);
		WebElement addtoCart=driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		addtoCart.click();
		WebElement proceed=driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]"));
		proceed.click();
		WebElement address=driver.findElement(By.xpath("(//input[@class='a-button-input'])[6]"));
		address.click();
		Thread.sleep(3000);
		WebElement paymentMethod=driver.findElement(By.xpath("((//span[@class='a-button-inner'])/span/span[.='Use this payment method'])[2]"));
		Thread.sleep(3000);
		Assert.assertTrue(paymentMethod.isDisplayed() && paymentMethod.isEnabled());	
		System.out.println("Use this payment method button is displayed and enabled");
	}
}
