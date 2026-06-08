package june07_TestNG;

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
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void dynamicSearchAndListDropdownSelect_Example1() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id(""));
		searchBox.sendKeys("keyboard");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath(""));
		int count = dynamicList.size();
		System.out.println(count);
		
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
	
	
	
	@Test
	public void dynamicSearchAndListDropdownSelect_Example2() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id(""));
		searchBox.sendKeys("");
		
		List<WebElement> dyanmicList = driver.findElements(By.xpath(""));
		Thread.sleep(1000);
		int count = dyanmicList.size();
		System.out.println(count);
		dyanmicList.get(4).click();
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
