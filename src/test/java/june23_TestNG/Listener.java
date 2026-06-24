package june23_TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getName() + " " + "Successfully Executed...");
	}
	
	
	public void onTestFailure(ITestResult result) 
	{
		System.out.println(result.getName() + " " + "Got Failed & Screenshot Captured...");
		System.out.println(result.getThrowable());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
