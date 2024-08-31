package basicprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Grotech_Registrationform 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://grotechminds.com/registeration-form");
		driver.manage().window().maximize();
		WebElement first_name=driver.findElement(By.name("firstName"));
		first_name.sendKeys("Rama Krishna");
		WebElement last_name=driver.findElement(By.name("lastName"));
		last_name.sendKeys("Mamidi");
		WebElement emailid=driver.findElement(By.name("email"));
		emailid.sendKeys("rama.nutek@gmail.com");
		WebElement phone_number=driver.findElement(By.name("phone"));
		phone_number.sendKeys("9988776655");
		WebElement aadhar=driver.findElement(By.id("aadhaar"));
		aadhar.sendKeys("123455554321");
		WebElement pan_number=driver.findElement(By.id("pan"));
		pan_number.sendKeys("ABCDE1234D");
		WebElement check_box=driver.findElement(By.name("terms"));
		check_box.click();
		WebElement register_button=driver.findElement(By.name("Submit"));
		register_button.click();
	}
	
}
