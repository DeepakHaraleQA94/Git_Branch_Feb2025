package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod1 {
	
	@Test(dependsOnMethods = "logout")
	public void launch() {
		System.out.println("launch browser");
	}

	@Test
	public void clickOnLoginBtn() {
		System.out.println("Successfully landed to homePage");
	}
	
	@Test
	public void logout() {
		System.out.println("Successfully logout");
		Assert.fail();
	}
	
}
