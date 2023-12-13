package excel.read.write;

import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead3 {
public static void main(String[] args) throws Throwable {
	String location = "C:\\Users\\Mumi17\\ProjectClass\\NovProject1\\src\\test\\resources\\TestData\\Credentials.xlsx";

	XSSFWorkbook wbook = new XSSFWorkbook(location);
	XSSFSheet sheet = wbook.getSheet("Sheet1");
	int noOfRows = sheet.getPhysicalNumberOfRows();
	
	for(int i=0;i<noOfRows;i++) {
		XSSFRow row = sheet.getRow(i);
		int noOfCells = row.getPhysicalNumberOfCells();
		for(int j=0;j<noOfCells;j++) {
			XSSFCell cell = row.getCell(j);
			CellType cellType = cell.getCellType();
			
			if(cellType==CellType.STRING) {
				String value = cell.getStringCellValue();
				System.out.println("String value : "+value);
			}else if(cellType==CellType.BOOLEAN) {
				boolean value = cell.getBooleanCellValue();
				System.out.println("Boolean value : "+value);
			}else if(cellType==CellType.NUMERIC) {
				if(DateUtil.isCellDateFormatted(cell)) {
					//System.out.println("Date Value : "+cell.getDateCellValue());
					String dateValue = cell.getDateCellValue().toString();
					System.out.println("Date Value : "+dateValue);
				}else {
					double doubleValue = cell.getNumericCellValue();
					System.out.println("Numeric value : "+doubleValue);
				}
			}
		}
	}
}
}
