package Apache_POI;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class getMultipleData {

	@Test
	public void getMultipleDataFromExcel() throws IOException {
		String path = "C:\\Users\\Sarvadnya\\eclipse-workspace\\slenium_GitFeb2025\\Git_Branch_Feb2025\\excelSheet\\Login.xlsx";
		FileInputStream pathOfExcel = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(pathOfExcel);
		XSSFSheet sheetName = book.getSheet("Sheet2");
		
		int lastRowNo = sheetName.getLastRowNum();
		System.out.println(lastRowNo);
		
		for(int i=0;i<lastRowNo;i++) {
			 XSSFRow row = sheetName.getRow(i);
			 short colNum = row.getLastCellNum();
			 for(int j=0;j<colNum;j++) {
				System.out.print( " || " +row.getCell(j).toString());
			 }System.out.println();
		}
	}
}
