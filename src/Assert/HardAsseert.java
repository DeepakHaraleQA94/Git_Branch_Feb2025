package Assert;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//import parallelTest.listenrtest;
//@Listeners(listenrtest.class)
public class HardAsseert {

	
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
		
		Assert.assertEquals(title, "Login123");
		Reporter.log("title matched, TC passed",true);
		
	}
}
