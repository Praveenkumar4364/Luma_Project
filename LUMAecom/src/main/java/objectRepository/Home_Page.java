package objectRepository;

import javax.swing.plaf.synth.SynthGraphicsUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class Home_Page extends SeleniumUtility {

	@FindBy(xpath = "(//li[@class='authorization-link'])[1]")
	private WebElement signin;
	 @FindBy(xpath = "//a[@id='ui-id-4']")
	 private WebElement women;
	@FindBy(xpath = "//a[@id='ui-id-9']")
	private WebElement top;
	@FindBy(xpath = "//a[@id='ui-id-11']")
	private WebElement jackets;
	@FindBy(xpath = "//a[@id='ui-id-12']")
	private WebElement hoodiesandsweatshirts;
	@FindBy(xpath = "//a[@id='ui-id-13']")
	private WebElement tees;
	@FindBy(xpath = "//a[@id='ui-id-14']")
	private WebElement brasandtanks;
	@FindBy (xpath = "(//button[@type='button'])[1]")
	private WebElement downbar;
	@FindBy(xpath = "(//li[@class='authorization-link'])[1]")
	private WebElement signout;
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getSignin()
	{
		return signin;
	}
	public WebElement getWomen()
	{
		return women;
	}
	public WebElement getTop()
	{
		return top;
	}
	public WebElement getJackets()
	{
		return jackets;
	}
	public WebElement getHoodiesandsweatshirts()
	{
		return hoodiesandsweatshirts;
	}
	public WebElement getTees()
	{
		return tees;
	}
	public WebElement getBrasandTanks()
	{
		return brasandtanks;
	}
	public WebElement getDownbar()
	{
		return downbar;
	}
	public WebElement getSignout()
	{
		return signout;
	}
	
	public void clickonsignin()
	{
		signin.click();
	}
	public void womenproductOnTopJackets(WebDriver driver)
	{
		mouseOverAction(driver, women);
		mouseOverAction(driver, top);
		jackets.click();
	}
	public void womenproductOnTopHoodiesandSweatshirts(WebDriver driver)
	{
		mouseOverAction(driver, women);
		mouseOverAction(driver, top);
		hoodiesandsweatshirts.click();
	}
	public void womenproductOnTopTees(WebDriver driver)
	{
		mouseOverAction(driver, women);
		mouseOverAction(driver, top);
		tees.click();
	}
	public void womenproductOnTopBrasandTanks(WebDriver driver)
	{
		mouseOverAction(driver, women);
		mouseOverAction(driver, top);
		brasandtanks.click();
	}
	public void signoutOperation()
	{
		downbar.click();
		signout.click();
	}
}
