package testng_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchUnPwd_AmazonLogin 
{
	WebDriver driver;
	@Test
	
		public void amazonLogin() throws EncryptedDocumentException, IOException, InterruptedException
		{
			FileInputStream f1=new FileInputStream("C:\\Users\\Rama\\eclipse-workspace\\SeleniumProject\\DataFetching\\ProgramData.xlsx");
			Workbook w1=WorkbookFactory.create(f1);
			String s1=w1.getSheet("Login_details").getRow(1).getCell(0).getStringCellValue();
			String s2=w1.getSheet("Login_details").getRow(1).getCell(1).getStringCellValue();
			
			driver=new ChromeDriver();
			driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			driver.manage().window().maximize();
			WebElement userName=driver.findElement(By.name("email"));
			userName.sendKeys(s1);
			Thread.sleep(2000);
			WebElement cnt=driver.findElement(By.id("continue"));
			cnt.click();
			Thread.sleep(2000);
			WebElement password=driver.findElement(By.name("password"));
			password.sendKeys(s2);
			Thread.sleep(2000);
			WebElement signin=driver.findElement(By.id("signInSubmit"));
			signin.click();
		}
		
}
