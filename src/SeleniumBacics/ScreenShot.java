package SeleniumBacics;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		String random = RandomString.make(3);
		System.out.println(random);
		String date = new SimpleDateFormat("dd-MM-YYYY").format(new Date());
		System.out.println(date);
		
		String ProjectPath = System.getProperty("user.dir");
		System.out.println(ProjectPath);
		
		File des = new File("C:\\Users\\Sarvadnya\\eclipse-workspace\\Selenium_Jala_Feb_2025\\Screenshot\\("+random+date+").png");
		FileHandler.copy(src, des);
	}
}
