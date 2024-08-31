package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_GrotechmindsRegistration 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registration");
		driver.manage().window().maximize();
		WebElement firstname=driver.findElement(By.name("fname"));
		firstname.sendKeys("Rama");
		WebElement lastname=driver.findElement(By.name("lname"));
		lastname.sendKeys("Krishna");
		WebElement email=driver.findElement(By.name("email"));
		email.sendKeys("rama.nutek@gmail.com");
		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("rama12345");
		//DropDown select code
		WebElement skill=driver.findElement(By.name("Skills"));
		Select s1=new Select(skill);
		s1.selectByIndex(2);		
		WebElement country=driver.findElement(By.name("Country"));
		Select s2=new Select(country);
		s2.selectByValue("India");
		//Dropdown select code till here
		WebElement presentaddress=driver.findElement(By.id("Present-Address"));
		presentaddress.sendKeys("4-364, Meerpet,Telangana");
		WebElement permanentaddress=driver.findElement(By.id("Permanent-Address"));
		permanentaddress.sendKeys("Same as present address");
		WebElement pincode=driver.findElement(By.name("Pincode"));
		pincode.sendKeys("500097");
		WebElement religion=driver.findElement(By.name("Relegion"));//Dropdown code
		Select s3=new Select(religion);
		s3.selectByVisibleText("Hindu");//Dropdown code till here
		WebElement submit_button=driver.findElement(By.name("Submit"));
		submit_button.click();
	}
}
