package Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssetMethod {

	
	@Test(enabled = false)
	public void test() {
		String name = "jala";
		String name1="jala";
		Assert.assertEquals(name, name1,"TC failed");
		Reporter.log("tc passed",true);
		
		
	}
	
	@Test(enabled = false)
	public void test1() {
		String name = "jala";
		String name1="jala123";
		Assert.assertNotEquals(name, name1,"TC failed");
		Reporter.log("tc passed",true);
				
	}
	
	
	@Test(enabled = false)
	public void test2() {
	boolean b = true;
	boolean b1=false;
		Assert.assertTrue(b1,"TC failed");
		Reporter.log("tc passed",true);
				
	}
	
	@Test(enabled = false)
	public void test3() {
	boolean b = true;
	boolean b1=false;
		Assert.assertFalse(b1,"TC failed");
		Reporter.log("tc passed",true);
				
	}
	
	@Test(enabled = false)
	public void test4() {

		String name=null;
		String name1="";
		Assert.assertNull(name,"TC failed");
		Reporter.log("tc passed",true);
				
	}
	
	@Test(enabled = true)
	public void test5() {
		
		Assert.fail();
		Reporter.log("tc passed",true);
				
	}
	
	
}
