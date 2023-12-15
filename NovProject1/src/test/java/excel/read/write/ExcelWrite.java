package excel.read.write;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
public static void main(String[] args) throws Exception {
	File f = new File("C:\\Users\\Mumi17\\ProjectClass\\NovProject1\\src\\test\\resources\\TestData\\ExcelWriteSample.xlsx");

	//FileInputStream fis = new FileInputStream(f); //read mode
	
	XSSFWorkbook wbook = new XSSFWorkbook();
	XSSFSheet sheet = wbook.createSheet("Students");
	XSSFRow row = sheet.createRow(2);
	XSSFCell cell = row.createCell(0);
	cell.setCellValue("Subasri");
	XSSFRow row1 = sheet.createRow(3);
	XSSFCell cell1 = row1.createCell(1);
	cell1.setCellValue("Dhivya");
	
	FileOutputStream fos = new FileOutputStream(f); //write mode
	wbook.write(fos);
	wbook.close();
	
	System.out.println("done");
}
}
