package TesBase;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBaseClass {
	public static Properties prop;
public static WebDriver driver;
public testBaseClass() throws IOException{
	 prop = new Properties();
	FileInputStream file = new FileInputStream("C:\\Users\\Sarvadnya\\eclipse-workspace\\slenium_GitFeb2025\\Git_Branch_Feb2025\\src\\propertyFile\\config.properties");
    prop.load(file);

}

	public void intilization() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magnus.jalatechnologies.com/");
		
	}


}

