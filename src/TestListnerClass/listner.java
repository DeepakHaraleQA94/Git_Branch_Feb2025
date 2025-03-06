package TestListnerClass;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import TesBase.testBaseClass;
import utility.Utility;

public class listner extends testBaseClass implements ITestListener {
	Utility util; 
	public listner() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public void onStart(ITestContext context) {
	   Reporter.log(" class execution started"+context.getName(),true);
	  }
	
	 public void onTestStart(ITestResult result) {
//		 System.out.println("method execution started"+result.getMethod().getMethodName());
		 Reporter.log(" method execution started  "+result.getMethod().getMethodName(),true);
		  }
	 
	 
	 public void onTestSuccess(ITestResult result) {
		 Reporter.log("test successfully executed",true);
		  }
	 
	 public void onTestFailure(ITestResult result) {
		 Reporter.log("test execution failed",true);
		 try {
			util= new Utility();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 try {
			util.screnshot(result.getMethod().getMethodName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		  }
	 
	  public void onTestSkipped(ITestResult result) {
			 Reporter.log("test execution skipped",true);
		  }

	  public void onFinish(ITestContext context) {
			 Reporter.log("test execution completed",true);
		  }
	

}
