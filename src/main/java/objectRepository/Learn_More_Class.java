package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class Learn_More_Class extends SeleniumUtility{
	//@FindBy(xpath = "//div[contains(@class,'fotorama__thumb ')]")
	//private List<WebElement> productimg;
	@FindBy(xpath = "(//div[@class='fotorama__arr__arr'])[2]")
	private WebElement sidebutton;
	@FindBy(xpath = "//input[@id='qty']")
	private WebElement quantity;
	@FindBy(xpath = "//div[@id='option-label-size-143-item-168']")
	private WebElement m;
	@FindBy(xpath = "//div[@id='option-label-color-93-item-53']")
	private WebElement color;
	@FindBy(xpath = "//button[@id='product-addtocart-button']")
	private WebElement addtocart;
	@FindBy(xpath = "//a[@class='action showcart']")
	private WebElement mycart;
	@FindBy(xpath = "//span[text()='View and Edit Cart']")
	private WebElement viewcart;
	
	public Learn_More_Class(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//public List<WebElement> gerProductimg()
	//{
//		return productimg;
	//}
	public WebElement getSidebutton()
	{
		return sidebutton;
	}
	public WebElement getQuantity()
	{
		return quantity;
	}
	public WebElement getM()
	{
		return m;
	}
	public WebElement getColor()
	{
		return color;
	}
	public WebElement addtocart()
	{
		return addtocart;
	}
	public WebElement getMycart()
	{
		return mycart;
	}
	public WebElement getViewcart()
	{
		return viewcart;
	}
	
	public void operationOnLearnmore(WebDriver driver,String QUANTITY) throws InterruptedException
	{
//		Iterator<WebElement> itr=productimg.iterator();
//		while(itr.hasNext())
//		{
//			
//			WebElement img=itr.next();
//		}
		sidebutton.click();
		sidebutton.click();
		sidebutton.click();
		quantity.clear();
		quantity.sendKeys(QUANTITY);
		m.click();
		color.click();
	    addtocart.click();
	    mycart.click();
	    viewcart.click();
	   // Thread.sleep(5000);
	}
}
