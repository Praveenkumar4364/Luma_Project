package Demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtility.ExcelUtility;
import genericUtility.PropertiesUtility;

public class Demo1 {
	@Test
public void praveen() throws IOException
{
	PropertiesUtility p=new PropertiesUtility();
	String u=p.getdatafromproperties("url");
	//System.out.println(u);
	WebDriver driver=new ChromeDriver();
	driver.get(u);
	ExcelUtility e=new ExcelUtility();
	String s=e.getDatafromExcel("ShippingOrder",2,0);
	System.out.println(s);
}
}
