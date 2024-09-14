package women;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericUtility.Base_Class;
import objectRepository.Home_Page;
import objectRepository.Login_Page;

public class Women_Product extends Base_Class{

	@Test
	public void product() throws Exception
	{
		Home_Page hp=new Home_Page(driver);
		hp.womenproductOnTop(driver);
	}
}
