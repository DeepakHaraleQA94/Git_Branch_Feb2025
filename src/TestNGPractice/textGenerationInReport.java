package TestNGPractice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class textGenerationInReport {

	@Test
	public void test() {
//		System.out.println("hello jala");
		Reporter.log("hello jala",true);
	}
	
	@Test
	public void test1() {
//		System.out.println("hello jala1");
		Reporter.log("hello jala1",true);
	}
}
