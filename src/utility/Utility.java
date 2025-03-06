package utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import TesBase.testBaseClass;
import net.bytebuddy.utility.RandomString;

public class Utility extends testBaseClass {
	
	public Utility() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void screnshot(String name) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(src);
		String random = RandomString.make(3);
		System.out.println(random);
		String date = new SimpleDateFormat("dd-MM-YYYY-hh-mm-ss").format(new Date());
		System.out.println(date);
		
		
		
		File des = new File("C:\\Users\\Sarvadnya\\eclipse-workspace\\Selenium_Jala_Feb_2025\\Screenshot\\("+name+date+").png");
		FileHandler.copy(src, des);
	}

}
