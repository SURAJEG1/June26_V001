package june25_TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getName() + " " + "successully executed...");
	}
	
	
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName() + " " + "got failed and screenshot captured...");
		System.out.println(result.getThrowable());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
