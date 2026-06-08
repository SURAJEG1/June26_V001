package june08_TestNG;

import org.testng.annotations.Test;

public class VarifyLogin extends BaseClass{
	
	
	
	@Test
	public void doLogin() 
	{
		driver.get(baseUrl);
		
		PageObject login = new PageObject(driver);
		login.doLogin();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
