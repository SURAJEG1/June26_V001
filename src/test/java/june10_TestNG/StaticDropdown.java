package june10_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class StaticDropdown {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--incognito");
		driver = new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test
	public void staticDropdownSelectByVisibleText() throws InterruptedException
	{
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		Select sc = new Select(dropdown);
		Thread.sleep(1000);
		sc.deselectByVisibleText("Albania");
	}
	
	
	
	@Test
	public void staticDropdownSelectByIndex() 
	{
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		Select sc = new Select(dropdown);
		sc.selectByIndex(5);
	}
	
	
	
	@Test
	public void staticDropdownSelectBySendKeysActions() 
	{
		WebElement dropdown = driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']//p//select"));
		dropdown.sendKeys(Keys.ARROW_DOWN);
		dropdown.sendKeys(Keys.ARROW_DOWN);
	}
	
	
	
	
	@AfterMethod
	public void quitBrowser() 
	{
		driver.quit();
	}
	

	
	
	
	
	
	
	
	
	

}
