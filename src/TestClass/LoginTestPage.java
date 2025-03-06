package TestClass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POM.LoginPage;
import TesBase.testBaseClass;
import TestListnerClass.listner;

@Listeners(listner.class)
public class LoginTestPage extends testBaseClass {
	
	public LoginTestPage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	LoginPage login;
	@BeforeMethod
	public void setUp() throws IOException {
		intilization();
		 login = new LoginPage();
	}

	@Test(priority = 1)
	public void verifyLoginPage() throws InterruptedException {
		login.validateLoginpage(prop.getProperty("Username"),prop.getProperty("Password"));
		Thread.sleep(3000);
		WebElement text = driver.findElement(By.xpath("//h1[text()='Welcome to JALA Academy']"));
		String homeText = text.getText();
		Assert.assertEquals(homeText, "Welcome to JALA Academy123", "text not matched");
		Reporter.log("text matched", true);
		
	}
	
	@Test(priority = 2)
	public void validateInvalidCredential() throws InterruptedException {
		login.validateLoginpage("Admin", "admin123");
		Thread.sleep(3000);
		WebElement toster = driver.findElement(By.xpath("//div[@class='toast-title']"));
	 	String errorMessage = toster.getText();
	 	Assert.assertEquals(errorMessage, "Invalid Email address or Password.", "valid credential");
	 	Reporter.log("Invalid credential",true);
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		
	}
	
	
}
