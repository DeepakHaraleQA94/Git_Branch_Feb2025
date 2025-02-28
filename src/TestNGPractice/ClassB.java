package TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassB {

	@Test(groups = "sanity")
	public void test6() {
		System.out.println("test6");
	}
	
	@Test(groups = "regression")
	public void test7() {
		System.out.println("test7");
		
	}
	
	@Test(groups = "sanity")
	public void test8() {
		System.out.println("test8");
		Assert.fail();
	}
	
	@Test(groups = "regression")
	public void test9() {
		System.out.println("test9");
	}
	
	@Test(groups = "functional")
	public void test10() {
		System.out.println("test10");
	}
}
