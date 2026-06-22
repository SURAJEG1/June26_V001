package june22_TestNG;

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
		driver.get("");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void getDynamicSearchAndListDropdownExample1() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.className(""));
		searchBox.sendKeys("");
		
		Thread.sleep(1000);
		List<WebElement> dynamicList = driver.findElements(By.xpath(""));
		int count = dynamicList.size();
		
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			
			if(dynamicList.get(i).getText().contains("")) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
	}
	
	
	public void getDynamicSearchAndListDropdownExample2() throws InterruptedException 
	{
		WebElement searchBox = driver.findElement(By.id(""));
		searchBox.sendKeys("");
		
		List<WebElement> elementList = driver.findElements(By.xpath(""));
		Thread.sleep(1000);
		int count = elementList.size();
		System.out.println(count);
		elementList.get(4).click();
	}
	
	
	
	
	

	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
