package testng_programs;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class FetchNumericValue_Failure //Trying to get numerical value with getStringCellValue
{
	WebDriver driver;
	@Test
	public void fetchNumValueFailure() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1= new FileInputStream("C:\\Users\\Rama\\eclipse-workspace\\SeleniumProject\\DataFetching\\ProgramData.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		String username=w1.getSheet("Login_details").getRow(3).getCell(0).getStringCellValue();
		System.out.println(username);
		
	}

}
