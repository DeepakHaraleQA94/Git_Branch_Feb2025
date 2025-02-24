package SeleniumBacics;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverClass {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
	
//		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
		
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		
	
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		
		driver.navigate().to("https://www.selenium.dev/downloads/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	
		String getHTMlCode = driver.getPageSource();
		System.out.println(getHTMlCode);
		
		driver.switchTo().newWindow(WindowType.TAB);
		Thread.sleep(3000);
		
		
		driver.close();
		Thread.sleep(3000);
		
		driver.quit();
		
		
		
		
	
	
	}
}
