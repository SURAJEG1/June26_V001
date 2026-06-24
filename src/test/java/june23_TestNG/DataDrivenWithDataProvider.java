package june23_TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.Test;

public class DataDrivenWithDataProvider {
	
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	
	@Test(dataProvider = "credential")
	public void doLoginWithMultipaleSetOfCombinationUsernameAndPassword(String un, String pwd) 
	{
		driver.findElement(By.id("")).sendKeys(un);
		driver.findElement(By.id("")).sendKeys(pwd);
		driver.findElement(By.id("")).click();
	}
	
	
	@DataProvider(name = "credential")
	public Object[][] dataDriven()
	{
		Object[][] data = new Object[2][2];
		data[0][0] = "";
		data[0][1] = "";
		
		data[1][0] = "";
		data[1][1] = "";
		
		return data;
		
	}
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
