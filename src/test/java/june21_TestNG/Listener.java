package june21_TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{
	
	
	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getName() + " " + "Succssfully Executed...");
	}
	
	
	public void onTestFailure(ITestResult result)
	{
		System.out.println(result.getName() + " " + "Got failed & screenshot captured...");
		System.out.println(result.getThrowable());
	}
	
	
	
	
	
	
	
	
	
	

}
