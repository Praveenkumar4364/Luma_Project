package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hoodies_Sweatshirts {
@FindBy(xpath = "(//a[contains(@href,'https://magento')])[2]")
private WebElement outfit;

public Hoodies_Sweatshirts(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getOutfit() {
	return outfit;
}

public void operationOutfit()
{
	outfit.click();
}
}