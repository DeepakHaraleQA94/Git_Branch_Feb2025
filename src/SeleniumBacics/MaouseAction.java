package SeleniumBacics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MaouseAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html#google_vignette");
	    WebElement src = driver.findElement(By.id("box3"));
	    WebElement des = driver.findElement(By.id("box106"));
	    Actions action = new Actions(driver);
	    action.clickAndHold(src).perform();
	    Thread.sleep(3000);
	    action.release(des).perform();
	    
	}
}
