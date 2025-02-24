package SeleniumBacics;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/#");
		JavascriptExecutor js = ((JavascriptExecutor)driver);
//		js.executeScript("window.scrollBy(0,2500)");
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("document.getElementById('comboBox').scrollIntoView()");
		
	}
}
