package SeleniumBacics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetOptionsOfDropDown {

	public static void main(String[] args) throws InterruptedException {
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
		 List<WebElement> countOptions = countryDropDwon.findElements(By.tagName("option"));
		 
		 int optionCount = countOptions.size();
		 System.out.println(optionCount);
		 
//		 for(int i=0;i<optionCount;i++) {
//			String displayList = countOptions.get(i).getText();
//			System.out.println(displayList);
//		 }
		 
		 
		 for(WebElement list:countOptions) {
			 System.out.println(list.getText());
		 }
		 
		 
	}
}
