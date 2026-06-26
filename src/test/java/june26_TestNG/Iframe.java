package june26_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

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
		
		WebElement textPhoneNo = driver.findElement(By.cssSelector("input[placeholder='Phone']"));
		WebElement clickOnOTP = driver.findElement(By.xpath("//button[@class='sc-1kx5g6g-1 bgDQms']"));
		clickOnOTP.click();
		
		driver.switchTo().defaultContent();
		System.out.println("swithed back to default");
	}
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
