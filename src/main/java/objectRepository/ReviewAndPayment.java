package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReviewAndPayment {
@FindBy(xpath = "(//button[@type='submit'])[3]")
private WebElement placeorder;

public ReviewAndPayment(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}
public WebElement getPlaceorder()
{
	return placeorder;
}

public void operationOnPaymentpage()
{
	placeorder.click();
	//placeorder.click();
}
}
