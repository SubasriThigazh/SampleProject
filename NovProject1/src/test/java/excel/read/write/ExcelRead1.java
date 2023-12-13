package excel.read.write;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead1 {
public static void main(String[] args) throws IOException {
	String location = "C:\\Users\\Mumi17\\ProjectClass\\NovProject1\\src\\test\\resources\\TestData\\Credentials.xlsx";
	
	XSSFWorkbook wbook = new XSSFWorkbook(location);
//	XSSFSheet sheet = wbook.getSheet("Sheet1");
	XSSFSheet sheet = wbook.getSheetAt(0);
		
	XSSFRow row = sheet.getRow(2);
	XSSFCell cell = row.getCell(1);
//	System.out.println(cell);
	String value = cell.getStringCellValue();
	System.out.println(value);
}
}