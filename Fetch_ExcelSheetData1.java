package practice3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Fetch_ExcelSheetData1 
{
	@Test
	public void fetchExcelData1() throws IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\Rama\\eclipse-workspace\\SeleniumProject\\DataFetching\\ProgramData.xlsx");
		Workbook w1=WorkbookFactory.create(f1);
		Sheet s1=w1.getSheet("Login_details");
		Row r1=s1.getRow(1);
		Cell c1=r1.getCell(0);
		Cell c2=r1.getCell(1);
		//String userName=NumberToTextConverter.toText(w1.getSheet("Login_details").getRow(1).getCell(0).getNumericCellValue());
		//String pwd=w1.getSheet("Login_details").getRow(1).getCell(1).getStringCellValue();
		String userName=c1.getStringCellValue();
		String pwd=c2.getStringCellValue();
		System.out.println("User name is "+userName);
		System.out.println("Password is "+pwd);
		Reporter.log(userName);
		Reporter.log(pwd);
		
	}
	

}
