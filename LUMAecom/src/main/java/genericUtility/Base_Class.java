package genericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import objectRepository.Home_Page;
import objectRepository.Login_Page;

public class Base_Class {
	public PropertiesUtility pUtil=new PropertiesUtility();
	public ExcelUtility eUtil=new ExcelUtility();
	public SeleniumUtility sUtil=new SeleniumUtility();
	public JavaUtility jUtil=new JavaUtility();
	
	public WebDriver driver;
	
	public static WebDriver sdriver;//for listners
@BeforeSuite(alwaysRun = true)
public void bsConfig()
{
	System.out.println("=========DB Connection Successfully========");
}
//@Parameters("Browser")
//@BeforeTest
@BeforeClass(alwaysRun = true)
public void bcConfig(/*String BROWSER*/) throws Exception
{
	String URL=pUtil.getdatafromproperties("url");
//	if(BROWSER.equalsIgnoreCase("Chrome"))
//	{
//	driver=new ChromeDriver();
//	}
//	else if(BROWSER.equalsIgnoreCase("Firefox"))
//	{
//		driver=new FirefoxDriver();
//	}
	driver=new ChromeDriver();
	
	sdriver=driver;//for listners
	
	driver.get(URL);
	sUtil.maximizeWindow(driver);
	sUtil.addImplicitilyWait(driver);
	System.out.println("==========Browser Launched Successfully========");
}
@BeforeMethod(alwaysRun = true)
public void bmConfig() throws Exception
{
	String USERNAME = pUtil.getdatafromproperties("username");
	String PASSWORD = pUtil.getdatafromproperties("password");
	Home_Page hp=new Home_Page(driver);
	hp.clickonsignin();
    Login_Page lp=new Login_Page(driver);
	lp.loginOperation(USERNAME, PASSWORD);
	System.out.println("===========Login Successfully==========");
}
@AfterMethod(alwaysRun = true)
public void amConfig()
{
	Home_Page hp=new Home_Page(driver);
	hp.signoutOperation();
	System.out.println("==========Logout Successfully=========");
}
//@AfterTest
@AfterClass(alwaysRun = true)
public void acConfig()
{
	driver.quit();
	System.out.println("==========Browser Closed Successfully=========");
}
@AfterSuite(alwaysRun = true)
public void asConfig()
{
	System.out.println("==========DB Connection Closed Successfully=========");
}
}
