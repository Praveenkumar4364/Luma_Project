package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Cart_Class {
@FindBy(xpath = "//input[@title='Qty']")
private WebElement qty;
@FindBy(xpath = "(//button[@class='action primary checkout'])[2]")
private WebElement checkout;

public Shipping_Cart_Class(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getQty()
{
	return qty;
}
public WebElement getCheckout()
{
	return checkout;
}

public void operationOnShippingcart(String QTY) throws InterruptedException
{
	//Thread.sleep(3000);
	//qty.click();
	qty.clear();
	qty.sendKeys(QTY);
	checkout.click();
	Thread.sleep(4000);
}
}
