package june10_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class DynamicSearchAndListDropdownSelectAndClick {

	
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
	public void googleDynamicSearch() throws InterruptedException 
	{
		WebElement googleSearchBox = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		googleSearchBox.sendKeys("taj mahal");
		
		Thread.sleep(1000);
		List<WebElement> dynamicList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		int count = dynamicList.size();
		System.out.println(count);
		
		for(int i=0; i<=dynamicList.size(); i++) 
		{
			System.out.println(dynamicList.get(i).getText());
			if(dynamicList.get(i).getText().contains("kisne banwaya tha")) 
			{
				dynamicList.get(i).click();
				break;
			}
		}
		
	}
	

	
	
	
	@Test
	public void googleDynamicSearch_example2() throws InterruptedException 
	{
		WebElement googleSearchBox = driver.findElement(By.id("APjFqb"));
		googleSearchBox.sendKeys("taj mahal");
		
		List<WebElement> dynamicList = driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		Thread.sleep(1000);
		int count = dynamicList.size();
		System.out.println(count);
		dynamicList.get(5).click();
	}
	
	
	
	
	
	
	@AfterMethod
	public void quitBrowser() 
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
}

