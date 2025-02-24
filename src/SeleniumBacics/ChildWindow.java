package SeleniumBacics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {
	
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
		
		driver.findElement(By.id("btn-two")).click();
		
		String singleWindow = driver.getWindowHandle();
		System.out.println("main window id is : "+singleWindow);
		
		Set<String> windows = driver.getWindowHandles();
//		System.out.println("ids : "+ windows);
		
		 Iterator<String> itr = windows.iterator();
		 String ParentWindow = itr.next();
		 System.out.println("parent id  : "+ParentWindow);
		 
		  String childWindow = itr.next();
		  System.out.println("child id : "+ childWindow);
		  
		  driver.switchTo().window(childWindow);
		
		  driver.manage().window().maximize();
		  
//		  driver.findElement(By.linkText("Gmail")).click();
		  
		  driver.switchTo().window(ParentWindow);
		
		  driver.findElement(By.id("promptBtn")).click();
		
		  driver.switchTo().window(childWindow);
	}

}
