package june01_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

@Listeners(Listener.class)
public class Iframe {
	
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void iframe() 
	{
		driver.switchTo().frame("auth-login-ui");
		System.out.println("switched to iframe...");
		
		WebElement enterPhoneNo = driver.findElement(By.xpath("//input[@type='number']"));
		enterPhoneNo.sendKeys("847543758");
		
		WebElement cliclOnOTP = driver.findElement(By.xpath("//span[@class='sc-1kx5g6g-3 bTZuzF']"));
		cliclOnOTP.click();
		
		driver.switchTo().defaultContent();
		System.out.println("switch to default...");
	}
	
	
	
	
	
	
	@AfterClass
	public void teardown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
