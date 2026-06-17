package june17_TestNG;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

	public void onTestSuccess(ITestResult result) 
	{
		System.out.println(result.getName() + "Successfully executed...");
	}
	
	
	
	public void onTestFailuer(ITestResult result) 
	{
		System.out.println(result.getName() + "Got failed and Screenshot Captured...");
		System.out.println(result.getThrowable());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
