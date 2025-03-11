package Apache_POI;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class getDataFromDropdown {

	
	@Test
	public void getDataAndSaveInexcel() throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");		
		WebElement userName = driver.findElement(By.id("UserName"));
		userName.sendKeys("training@jalaacademy.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("jobprogram");
		driver.findElement(By.xpath("( //button[@type='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Employee")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create")).click();
		WebElement countryDropDwon = driver.findElement(By.name("CountryId"));
			
		String path = "C:\\Users\\Sarvadnya\\eclipse-workspace\\slenium_GitFeb2025\\Git_Branch_Feb2025\\excelSheet\\Login.xlsx";
		FileInputStream pathOfExcel = new FileInputStream(path);
		XSSFWorkbook book = new XSSFWorkbook(pathOfExcel);
		XSSFSheet sheetName = book.getSheet("Sheet3");
		
		List<WebElement> otpions = countryDropDwon.findElements(By.tagName("option"));
				
		
		for(int i=0;i<otpions.size();i++) {
			XSSFRow row = sheetName.createRow(i);
			System.out.println(otpions.get(i).getText());
			row.createCell(1).setCellValue(otpions.get(i).getText());
	}
		FileOutputStream save = new FileOutputStream(path);
		book.write(save);
		
		
		
		
		
	}
}
