package june15_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DynamicSearchAndListDropdown {

	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void dynamicSearchAndListDropdown_Example1() 
	{
		WebElement googleSearch = driver.findElement(By.xpath("//textarea[contains(@id,'APjFqb')]"));
		googleSearch.sendKeys("world");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		int count =  dynamicList.size();
		System.out.println(count);
		
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			
			if(dynamicList.get(i).getText().contains("cup matches")) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
	}
	
	
	
	@Test
	public void dynamicSearchAndListDropdown_Example2() throws InterruptedException 
	{
		WebElement googleSearch = driver.findElement(By.xpath("//textarea[contains(@id,'APjFqb')]"));
		googleSearch.sendKeys("world");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		Thread.sleep(1000);
		int count = dynamicList.size();
		System.out.println(count);
		dynamicList.get(4).click();
	}
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
