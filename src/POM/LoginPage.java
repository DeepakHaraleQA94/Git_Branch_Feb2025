package POM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TesBase.testBaseClass;

public class LoginPage extends testBaseClass{

	@FindBy(id = "UserName")
	WebElement username;
	
	@FindBy(id = "Password")
	WebElement Password;
	
	@FindBy(id = "btnLogin")
	WebElement btnLogin;
	
	public void validateLoginpage(String uName, String pass) {
		username.sendKeys(uName);
		Password.sendKeys(pass);
		btnLogin.click();
	}
	
	
	public LoginPage() throws IOException{
		PageFactory.initElements(driver, this);
	}
	
	
	
}
