package june28_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class IframeHandles {
	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.zomato.com/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void iframe() 
	{
		driver.switchTo().frame("auth-login-ui");
		System.out.println("switched to iframe...");
		
		WebElement textMobNo = driver.findElement(By.cssSelector("input[placeholder='Phone']"));
		WebElement clickOnOTP = driver.findElement(By.cssSelector("button[class='sc-1kx5g6g-1 bgDQms']"));
		
		textMobNo.sendKeys("202020020");
		clickOnOTP.click();
		
		driver.switchTo().defaultContent();
		System.out.println("switched back to default content");
		
		driver.navigate().back();
	}
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
