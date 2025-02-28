package TestNGPractice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annoation {

	@Test
	public void validateHomePage() {
		Reporter.log("landing home page successfully",true);
	}
	
	
	@AfterClass
	public void closeBrowser() {
		Reporter.log("closed browser ", true);
	}
	
	@BeforeMethod
	public void clickOnsignBtn() {
		Reporter.log("click On sign In button", true);
	}
	
	
	@AfterMethod
	public void clickOnLogOut() {
		Reporter.log("logout successfully",true);
	}
	
	@BeforeClass
	public void luanchBrowser() {
		Reporter.log("launch browser",true);
	}
	
}
