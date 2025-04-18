package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThankYouForYourPurchasePage {

	@FindBy(xpath = "//a[@class='action primary continue']")
	private WebElement continueshopping;
	
	public ThankYouForYourPurchasePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public WebElement getContinueShopping()
	{
		return continueshopping;
	}
	public void operationOnThankYouForYourPurchasePage()
	{
		continueshopping.click();
	}
}
