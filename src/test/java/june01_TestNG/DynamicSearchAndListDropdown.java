package june01_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class DynamicSearchAndListDropdown {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void getDynamicSearchAndListDropdown_Example1() throws InterruptedException 
	{
		WebElement gSearch = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		gSearch.sendKeys("ipl");
		
		Thread.sleep(1000);
		List<WebElement> dynamicList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		int count = dynamicList.size();
		System.out.println(count);
		
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			
			if(dynamicList.get(i).getText().contains("2026")) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
		
	}
	

	
	@Test
	public void getDynamicSearchAndListDropdown_Example2() throws InterruptedException 
	{
		WebElement gSearch = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		gSearch.sendKeys("ipl");
		
		List<WebElement> dynamicLsit = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		Thread.sleep(1000);
		int count = dynamicLsit.size();
		System.out.println(count);
		dynamicLsit.get(3).click();
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
