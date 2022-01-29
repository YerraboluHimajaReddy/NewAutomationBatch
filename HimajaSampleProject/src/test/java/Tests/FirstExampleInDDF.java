package Tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class FirstExampleInDDF {

	//.xlsx  XSSFWorkbook, XSSFSheet, XSSFRow, XSSFCell
	//.xls  HSSFWorkbook, HSSFSheet, HSSFRow, HSSFCell

	private static HSSFWorkbook workbook;
	private static HSSFSheet sheet;
	private static HSSFRow row;
	private static HSSFCell cell;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File(
				"C:\\Users\\himaj\\Desktop\\Selenium With Java\\Selenium\\Selenium\\Data Driven framework and hybrid framework in java\\RealTimeExample.xls");

		FileInputStream fIS = new FileInputStream(file);

		// creating workbook instance that refers to .xls file
		workbook = new HSSFWorkbook(fIS);

		// creating a Sheet object
		sheet = workbook.getSheet("HIMAJA");

		// getting the cell value from rowNumber and cell Number
		cell = sheet.getRow(2).getCell(1);

		// returning the cell value as string
		System.out.println(cell.getStringCellValue()); // Himaja

		int rowcount = sheet.getLastRowNum() - sheet.getFirstRowNum();
		System.out.println(rowcount);

		for (int i = 1; i <= rowcount; i++) {

			sheet.getRow(i).createCell(6).setCellValue("8");

			FileOutputStream outputStream = new FileOutputStream(file);
			workbook.write(outputStream);

		}

	}

}
