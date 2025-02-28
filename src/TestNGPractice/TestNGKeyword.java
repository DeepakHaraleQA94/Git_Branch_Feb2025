package TestNGPractice;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGKeyword {

	@Test(priority = 48, enabled = true, dependsOnMethods = "E")
	public void A() {
		Reporter.log("Method A ",true);
	}
	
	@Test(priority = -82, enabled = true)
	public void C() {
		Reporter.log("Method C ",true);
	}
	
	@Test(priority = 10)
	public void E() throws InterruptedException {
		Reporter.log("Method E ",true);
		Assert.fail();
	
	}
	
	@Test(priority = 78)
	public void B() {
		Reporter.log("method B ",true);
	}
	
}
