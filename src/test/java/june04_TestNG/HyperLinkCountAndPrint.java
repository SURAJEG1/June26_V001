package june04_TestNG;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

@Listeners(Listener.class)
public class HyperLinkCountAndPrint {
	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test
	public void getHyperLinkCountAndPrint() 
	{
		List<WebElement> hyperLink = driver.findElements(By.tagName("a"));
		int count = hyperLink.size();
		System.out.println(count);
		
		for(WebElement element:hyperLink) 
		{
			System.out.println(element.getText());
		}
		
	}
	
	
	@Test
	public void getHyperLinkAndClickOnInstagram() 
	{
		List<WebElement> hyperLink = driver.findElements(By.tagName("a"));
		int count = hyperLink.size();
		System.out.println(count);
		
		for(int i=0; i<=hyperLink.size(); i++) 
		{
			System.out.println(hyperLink.get(i).getText());
			
			if(hyperLink.get(i).getText().contains("Instagram")) 
			{
				hyperLink.get(i).click();
				break;
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
