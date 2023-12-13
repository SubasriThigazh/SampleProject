package excel.read.write;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead2 {
public static void main(String[] args) throws IOException {
	
	String location = "C:\\Users\\Mumi17\\ProjectClass\\NovProject1\\src\\test\\resources\\TestData\\Credentials.xlsx";

	XSSFWorkbook wbook = new XSSFWorkbook(location);
	
	XSSFSheet sheet = wbook.getSheet("Sheet1");
	int noOfRows = sheet.getPhysicalNumberOfRows();
	
//	XSSFRow row = sheet.getRow(1);
//	int noOfCells = row.getPhysicalNumberOfCells();
	
//	System.out.println("Number of Rows : "+noOfRows);
//	System.out.println("Number of Cells : "+noOfCells);
	
	for(int i=0; i<noOfRows;i++) {
		XSSFRow row = sheet.getRow(i);
		int noOfCells = row.getPhysicalNumberOfCells();
		for(int j=0; j<noOfCells;j++) {
			XSSFCell cell = row.getCell(j);
			String value = cell.getStringCellValue();
			System.out.println(value);
		}
	}
}
}
