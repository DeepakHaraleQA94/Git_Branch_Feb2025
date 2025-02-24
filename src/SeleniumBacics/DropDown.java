package SeleniumBacics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
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
		Select select = new Select(countryDropDwon);
		Thread.sleep(2000);
		select.selectByVisibleText("India");
		Thread.sleep(2000);
		select.selectByIndex(2);
		
		
		
		
	}

}
