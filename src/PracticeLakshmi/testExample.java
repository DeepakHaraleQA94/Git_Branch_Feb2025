package PracticeLakshmi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testExample {
	WebDriver driver;
	@BeforeClass
	public void Setup() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		Thread.sleep(3000);
	
	}
	@Test
	public void FillOutForm() {
		WebElement FirstName = driver.findElement(By.id("firstName"));
		FirstName.sendKeys("Lakshmi");
		
		WebElement Lstname= driver.findElement(By.id("lastName"));
		Lstname.sendKeys("DK");
		
		WebElement Email=driver.findElement(By.id("userEmail"));
		Email.sendKeys("lakshmi913@gmail.com");
		
		
		WebElement maleRadioLabel = driver.findElement(By.xpath("//label[@for='gender-radio-1']"));
		maleRadioLabel.click();
	    //WebElement genderMale = driver.findElement(By.id("gender-radio-1"));
        //genderMale.click();

        // Fill in mobile number
        WebElement mobileNumber = driver.findElement(By.id("userNumber"));
        mobileNumber.sendKeys("1234567890");

        // Select date of birth
        WebElement dateOfBirth = driver.findElement(By.id("dateOfBirthInput"));
        dateOfBirth.click();
        
        WebElement Month= driver.findElement(By.className("react-datepicker__month-select"));
        		Month.click();
	}
	//@Test
	//public void hello2() {
	//	Reporter.log("helllo ",true);
		
	//}
}
