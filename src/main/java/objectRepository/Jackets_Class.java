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
@FindBy(xpath = "//div[text()='Size']")
private WebElement size;
@FindBy(xpath = "(//div[@class='swatch-option text '])[3]")
private WebElement m;
@FindBy(xpath = "//div[text()='Climate']")
private WebElement climate;
@FindBy(xpath = "//a[contains(@href,'https://magento.softwaretestingboard.com/"
		+ "women/tops-women/jackets-women.html?climate=205')]")
private WebElement mild;
@FindBy(xpath = "//div[text()='Color']")
private WebElement color;
@FindBy(xpath = "(//div[@option-label='Green'])[2]")
private WebElement green;

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
public WebElement getSize() {
	return size;
}
public WebElement getM()
{
	return m;
}
public WebElement getClimate()
{
	return climate;
}
public WebElement getMild()
{
	return mild;
}
public WebElement gerColor()
{
	return color;
}
public WebElement getGreen()
{
	return green;
}

public void operationOnJackets()
{
	list.click();
	style.click();
	lightweight.click();
	size.click();
	m.click();
	climate.click();
	mild.click();
	color.click();
	green.click();
}
}
