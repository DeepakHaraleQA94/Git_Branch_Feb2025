package Apache_POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class CreateData {

	
	@Test
	public void getDataFromExcel() throws IOException {
//		String path ="C:\\Users\\Sarvadnya\\OneDrive\\Desktop\\New folder (2)"
		String path = "C:\\Users\\Sarvadnya\\eclipse-workspace\\slenium_GitFeb2025\\Git_Branch_Feb2025\\excelSheet\\Login.xlsx";
		FileInputStream pathOfExcel = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(pathOfExcel);
		XSSFSheet sheetName = book.getSheet("Sheet1");
	
		XSSFRow rowIndex = sheetName.createRow(3);
		rowIndex.createCell(5).setCellValue("Deepak123");
		
		FileOutputStream save = new FileOutputStream(path);
		book.write(save);
		
		
		
		
		
	}
}
