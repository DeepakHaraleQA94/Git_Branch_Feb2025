//package parallelTest;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.logging.FileHandler;
//
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.testng.ITestListener;
//import org.testng.ITestResult;
//
//import TesBase.testBaseClass;
//
//public class listenrtest extends testBaseClass implements ITestListener {
//
//	public listenrtest() throws IOException {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//	
//	 public void onTestFailure(ITestResult result) {
//		    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		    File file = new File(System.getProperty("user.dir")+"\\screenshot\\img.png");
//		    try {
//				org.openqa.selenium.io.FileHandler.copy(src, file);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		   
//		  }
//	
//	
//
//}
