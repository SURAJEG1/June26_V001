package june21_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataDrivenWithDataProviderAnnotation {

	
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	
	@Test(dataProvider = "credentials")
	public void doLoginWithMalitipuleCombination(String un, String pwd)
	{
		WebElement textUsername = driver.findElement(By.id(""));
		WebElement textPassword = driver.findElement(By.id(""));
		WebElement clickOnLoginBtn = driver.findElement(By.id(""));
		
		textUsername.sendKeys(un);
		textPassword.sendKeys(pwd);
		clickOnLoginBtn.click();
	}
	
	
	
	
	@DataProvider(name = "credentials")
	public Object[][] dataDriver()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "Admin";
		data[0][1] = "welcome1";
		
		data[1][0] = "admin";
		data[1][1] = "welcome1";
		
		return data;
	}
	
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
