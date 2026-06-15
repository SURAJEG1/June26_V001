package june15_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class HyperLinkCountAndPrint {

	
	WebDriver driver;
	@BeforeClass
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void getHyperLink()
	{
		List<WebElement> tag = driver.findElements(By.tagName("a"));
		int count = tag.size();
		System.out.println(count);
		
		for(WebElement element:tag) 
		{
			System.out.println(element.getText());
		}
	}
	
	
	
	
	
	@AfterClass
	public void closeWindow() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
