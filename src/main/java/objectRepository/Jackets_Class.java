package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Jackets_Class {
@FindBy(xpath = "(//a[@id='mode-list'])[1]")
private WebElement list;
@FindBy(xpath = "//div[text()='Style']")
private WebElement style;
@FindBy(xpath = "//a[contains(@href,'https://magento.softwaretestingboard.com/women/"
		+ "tops-women/jackets-women.html?product_list_mode=list&style_general=119')]")
private WebElement lightweight;

public Jackets_Class(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getList()
{
	return list;
}
public WebElement getStyle()
{
	return style;
}
public WebElement getLightweight()
{
	return lightweight;
}

public void operationOnJackets()
{
	list.click();
	style.click();
	lightweight.click();
}
}
