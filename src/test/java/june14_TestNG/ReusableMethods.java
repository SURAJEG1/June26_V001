package june14_TestNG;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ReusableMethods {
	
	//create object of WebDriver interface
	WebDriver driver;
	
	//parameterize constructor
	public ReusableMethods(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public void windowHandles() 
	{
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parent = it.next();
		String child = it.next();
		
		driver.switchTo().window(parent);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
	}
	
	
	public void pageScrollDown() 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,document.body.windowHeight)");
	}
	
	public void implicitlyWait() 
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void closeTab() 
	{
		driver.close();
	}
	
	public void quitBrowser() 
	{
		driver.quit();
	}
	

	
	
	
	
	
	
	
	
	
	

}
