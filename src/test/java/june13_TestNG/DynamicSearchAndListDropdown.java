package june13_TestNG;

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
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void dynamicSearchAndListDropdownSelectExample1() 
	{
		WebElement searchBox = driver.findElement(By.id(""));
		searchBox.sendKeys("pendrive");
	
		List<WebElement> dynamicList = driver.findElements(By.xpath(""));
		int count = dynamicList.size();
		System.out.println(count);
		dynamicList.get(4).click();
	}
	
	
	@Test
	public void dynamicSearchAndListDropdownSelectExample2() throws InterruptedException 
	{
		WebElement searchBox =driver.findElement(By.id(""));
		searchBox.sendKeys("");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath(""));
		System.out.println(dynamicList.size());
		
		Thread.sleep(1000);
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			
			if(dynamicList.get(i).getText().contains("for laptop")) 
			{
				dynamicList.get(i).click();
				break;
			}
			
		}
		
	}
	
	
	
	@AfterMethod
	public void TearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
