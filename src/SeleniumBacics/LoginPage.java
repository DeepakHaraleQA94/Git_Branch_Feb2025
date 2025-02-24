package SeleniumBacics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
		WebElement getLoginText = driver.findElement(By.xpath("//b[text()='JALA Academy']"));
		System.out.println( getLoginText.getText());
		
		WebElement getTextOfLargValue = driver.findElement(By.xpath("//b[contains(text(),'Scenarios. FREE for all')]"));
		boolean checkTextIsVisible = getTextOfLargValue.isDisplayed();
		System.out.println("the text is visible : "+checkTextIsVisible);
		
		WebElement userName = driver.findElement(By.id("UserName"));
		userName.sendKeys("training@jalaacademy.com");
//		WebElement passWord = driver.findElement(By.name("Password"));
		driver.findElement(By.cssSelector("#Password")).sendKeys("jobprogr");
//		driver.findElement(By.xpath("( //button[@type='button'])[2]")).click();
		
		
		String javascript = "document.getElementById('btnLogin').style.border='8px solid red'";
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript(javascript);

	
	}
}
