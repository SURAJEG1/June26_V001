package june17_TestNG;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class DataDrivenWirhDataProviderAnnotation {
	
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
	public void doLogin(String un, String pwd) 
	{
		WebElement textUsername = driver.findElement(By.id(""));
		WebElement textPassword = driver.findElement(By.id(""));
		WebElement enterLoginBtn = driver.findElement(By.id(""));
		
		textUsername.sendKeys(un);
		textPassword.sendKeys(pwd);
		enterLoginBtn.click();
	}
	
	
	
	@DataProvider(name = "credential")
	public Object[][] dataDriven() throws IOException
	{
		String filepath = "E:\\InfoEge Automation Project\\June26_V001\\ExcelFolder\\login.xlsx";
		String sheetname ="sheet1";
		
		return ReadExcelUtility.excelDriven(filepath, sheetname);
		
	}
	
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() 
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
