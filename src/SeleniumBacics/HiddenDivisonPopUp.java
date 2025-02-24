package SeleniumBacics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivisonPopUp {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");		
		WebElement userName = driver.findElement(By.id("UserName"));
		userName.sendKeys("training@jalaacademy.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("jobprogram");
		driver.findElement(By.xpath("( //button[@type='button'])[2]")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Popups")).click();
		driver.findElement(By.id("btn-six")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
		
		driver.findElement(By.id("confirmBox")).click();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		
	}
}
