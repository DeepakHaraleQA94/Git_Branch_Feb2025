package Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertClass {

	
	@Test
	public void test() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");

		String title = driver.getTitle();
		
//		if(title.contains("Login123")) {
//			System.out.println("title matched, TC passed");
//		}else
//		{
//			System.out.println("title not matched, TC failed");
//		}
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(title, "Login123", "TC failed");
		Reporter.log("TC passed",true);
		
	}
}
