package testng_programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven_GrotechMinds 
{
	WebDriver driver;
	@Test(dataProvider="regform")
	public void registration(String fn,String ln,String emId,String pwd,String curadd,String peradd,String pcode)// throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");
		driver.manage().window().maximize();
		WebElement firstName=driver.findElement(By.id("fname"));
		firstName.sendKeys(fn);
		WebElement lastName=driver.findElement(By.id("lname"));
		lastName.sendKeys(ln);
		WebElement emailId=driver.findElement(By.id("email"));
		emailId.sendKeys(emId);
		WebElement passwd=driver.findElement(By.id("password"));
		passwd.sendKeys(pwd);
		WebElement gender=driver.findElement(By.id("male"));
		gender.click();
		WebElement skillselect=driver.findElement(By.id("Skills"));
		Select s1=new Select(skillselect);
		s1.selectByIndex(2);
		WebElement countryselect=driver.findElement(By.id("Country"));
		Select s2=new Select(countryselect);
		s2.selectByValue("India");
		WebElement presentadd=driver.findElement(By.id("Present-Address"));
		presentadd.sendKeys(curadd);
		WebElement permanentadd=driver.findElement(By.id("Permanent-Address"));
		permanentadd.sendKeys(peradd);
		WebElement pincode=driver.findElement(By.id("Pincode"));
		pincode.sendKeys(pcode);
		WebElement rel=driver.findElement(By.id("Relegion"));
		Select s3=new Select(rel);
		s3.selectByVisibleText("Hindu");
		//Thread.sleep(1000);
		//WebElement reloc=driver.findElement(By.id("relocate"));
		//reloc.click();
		WebElement submit=driver.findElement(By.xpath("//button[@name='Submit']"));
		submit.click();
	}
	@DataProvider(name="regform")
	public Object[][] regDetails()
	{
		Object details[][]=new Object[5][7];
		//First Row
		details[0][0]="Rama";
		details[0][1]="Krishna";
		details[0][2]="rama.nutek@gmail.com";
		details[0][3]="rama123";
		details[0][4]="Meerpet";
		details[0][5]="Balapur";
		details[0][6]="500097";
		//Second Row
		details[1][0]="Hari";
		details[1][1]="Prasad";
		details[1][2]="hariprasad@gmail.com";
		details[1][3]="hari2345";
		details[1][4]="MythriEnclave";
		details[1][5]="MythriEnclave";
		details[1][6]="500007";
		//Third Row
		details[2][0]="Kiran";
		details[2][1]="Kumar";
		details[2][2]="kirankumar.nutek@gmail.com";
		details[2][3]="kiran789";
		details[2][4]="VenkateshwaraResidency";
		details[2][5]="MythriEnclave";
		details[2][6]="500007";
		//Fourth Row
		details[3][0]="Harish";
		details[3][1]="Yadav";
		details[3][2]="hari.yadav@gmail.com";
		details[3][3]="hari1234";
		details[3][4]="Noida";
		details[3][5]="Noida";
		details[3][6]="500002";
		//Fifth Row
		details[4][0]="Swathi";
		details[4][1]="Naidu";
		details[4][2]="swathinaidu123@gmail.com";
		details[4][3]="swathi345#";
		details[4][4]="Bangalore";
		details[4][5]="Hyderabad";
		details[4][6]="500032";
		
		return details;
		
	}

}
