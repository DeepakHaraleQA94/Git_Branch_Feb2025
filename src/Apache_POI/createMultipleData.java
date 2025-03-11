package Apache_POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class createMultipleData {

	@Test
	public void createMultipleDataInExcel() throws IOException {
		String path = "C:\\Users\\Sarvadnya\\eclipse-workspace\\slenium_GitFeb2025\\Git_Branch_Feb2025\\excelSheet\\Login.xlsx";
		FileInputStream pathOfExcel = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(pathOfExcel);
		XSSFSheet sheetName = book.getSheet("Sheet1");
		
		for(int i=0;i<=10;i++) {
			XSSFRow row = sheetName.createRow(i);
			
			for(int j=0;j<10;j++) {
				row.createCell(j).setCellValue("data");

			}
		}
		
		FileOutputStream save = new FileOutputStream(path);
		book.write(save);
		
	}
}
