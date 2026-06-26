package june25_TestNG;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtility {
	//create object of WebDriver interface
	WebDriver driver;
	
	//parameterize constructor
	public ScreenshotUtility(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	
	public void getScreenshot() throws IOException 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		String timestamp = new SimpleDateFormat("yyyyMMdd_HHssMM").format(new Date());
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("E:\\InfoEge Automation Project\\June26_V001\\screenshot\\fail"+ timestamp +".png");
		FileUtils.copyFile(source, destination);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
