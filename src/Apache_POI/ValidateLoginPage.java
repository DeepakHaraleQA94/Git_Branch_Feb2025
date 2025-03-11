package Apache_POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ValidateLoginPage {
	WebDriver driver;
	@Test
	public void validateLoginCredential() throws IOException, InterruptedException {
		String path = "C:\\Users\\Sarvadnya\\eclipse-workspace\\slenium_GitFeb2025\\Git_Branch_Feb2025\\excelSheet\\Login.xlsx";
		FileInputStream pathOfExcel = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(pathOfExcel);
		XSSFSheet sheetName = book.getSheet("Sheet2");
		
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
		int getRowNum = sheetName.getLastRowNum();
		for(int i=1; i<=getRowNum;i++) {
			XSSFRow row = sheetName.getRow(i);
			WebElement userName = driver.findElement(By.id("UserName"));
			
			userName.sendKeys(row.getCell(1).toString());
			driver.findElement(By.cssSelector("#Password")).sendKeys(row.getCell(2).toString());
			driver.findElement(By.xpath("( //button[@type='button'])[2]")).click();
			Thread.sleep(3000);
			String actualTitle = driver.getTitle();
			row.createCell(4).setCellValue(actualTitle);
			
			String expectedTitle = row.getCell(3).toString();
			System.out.println(expectedTitle);
			
			if(expectedTitle.equals(actualTitle)) {
				
				row.createCell(5).setCellValue("passed");
				
			}else {
				row.createCell(5).setCellValue("failed");
			}
			driver.close();
			
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://magnus.jalatechnologies.com/");
		}
		
		FileOutputStream save = new FileOutputStream(path);
		book.write(save);
		
	}
}
