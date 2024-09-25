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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_FetchExcelFB 
{
	WebDriver driver;
	@Test(dataProvider="unpwd")
	public void dataProvider_fblogin(String un,String pwd) throws InterruptedException
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement userName=driver.findElement(By.name("email"));
		userName.sendKeys(un);
		Thread.sleep(3000);
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(pwd);
		Thread.sleep(2000);
		WebElement login_button=driver.findElement(By.name("login"));
		login_button.click();
	}
	@DataProvider(name="unpwd")
	public Object[][] fetchValues() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\Rama\\eclipse-workspace\\SeleniumProject\\DataFetching\\ProgramData.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		Object data1[][]=new Object[1][2];
		data1[0][0]=w1.getSheet("Login_details").getRow(1).getCell(0).getStringCellValue();
		data1[0][1]=w1.getSheet("Login_details").getRow(1).getCell(1).getStringCellValue();
		return data1;
		
	}
	
	

}
