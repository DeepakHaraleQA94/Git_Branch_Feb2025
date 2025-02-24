package SeleniumBacics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
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
	driver.findElement(By.linkText("Search")).click();
	WebElement table = driver.findElement(By.id("tblEmployee"));
	List<WebElement> listOfhead = table.findElements(By.cssSelector("tr"));
	
	for(WebElement list:listOfhead)
	System.out.println(list.getText());
	
	
}
}
