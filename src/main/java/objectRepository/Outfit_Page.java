package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Outfit_Page {
@FindBy(xpath = "(//div[@class='swatch-option text'])[4]")
private WebElement size;

@FindBy(xpath = "//button[@title='Add to Cart']")
private WebElement addtocart;

public Outfit_Page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getSize()
{
	return size;
}
public WebElement getAddtocart()
{
	return addtocart;
}

public void operationOnoutfitpage()
{
	size.click();
	addtocart.click();
}
}
