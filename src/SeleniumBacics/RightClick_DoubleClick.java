package SeleniumBacics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick_DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/buttons");
		Thread.sleep(3000);
		WebElement doubleClick = driver.findElement(By.id("doubleClickBtn"));
		Actions action = new Actions(driver);
		action.doubleClick(doubleClick).perform();
	
		
		WebElement rightClick = driver.findElement(By.id("rightClickBtn"));
		action.contextClick(rightClick).perform();
		
	}
}
