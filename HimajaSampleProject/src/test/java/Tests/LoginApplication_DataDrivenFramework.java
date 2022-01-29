package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Methods.HomePageMethods;
import Methods.LoginPageMethods;
import Methods.signOutMethods;
import Pages.LoginPage;

public class LoginApplication_DataDrivenFramework {

	private static HSSFWorkbook workbook;
	private static HSSFSheet sheet;
	private static HSSFRow row;
	// cell is ntg but column
	private static HSSFCell cell;

	public static void main(String[] args) throws IOException {
		
	
		File file = new File(
				"C:\\Users\\himaj\\Desktop\\Selenium With Java New Batch\\HimajaSampleProject\\src\\test\\java\\Testdata\\RealTimeExample.xls");

		FileInputStream fIS = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		workbook=new HSSFWorkbook(fIS);

		// creating a Sheet object
		sheet=workbook.getSheet("HIMAJA");

		// getting the cell value from rowNumber and cell Number
		cell=sheet.getRow(2).getCell(1);

		// returning the cell value as string
		System.out.println(cell.getStringCellValue()); // Himaja

		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		
		System.out.println(rowcount);
		for(int i = 1;i<=rowcount;i++)
		{

			sheet.getRow(i).createCell(7).setCellValue("100");

			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);

		}
	
	}



}
