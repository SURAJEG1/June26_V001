package june21_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	
	//create object of WebDriver interface
	WebDriver driver;
	
	//constructor
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	
	
	public void getMaximizeWindow() 
	{
		driver.manage().window().maximize();
	}
	
	
	public void getImpWait(int wait) 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(wait));
	}
	
	
	public void getPageScrollDown() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	
	
	public void getWindowHandles() 
	{
		Set<String> window = driver.getWindowHandles();
		Iterator<String> it = window.iterator();
		
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
