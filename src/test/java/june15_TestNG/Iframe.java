package june15_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Listeners;

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
		System.out.println("switahced to iframe...");
		
		WebElement textPhoneNo = driver.findElement(By.cssSelector("input[placeholder='Phone']"));
		driver.findElement(By.xpath("//span[contains(@class,'sc-1kx5g6g-3 bTZuzF')]")).click();
		
		driver.switchTo().defaultContent();
		System.out.println("switched to default constent...");
	}
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
