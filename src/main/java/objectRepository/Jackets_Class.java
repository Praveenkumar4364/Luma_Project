package objectRepository;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericUtility.SeleniumUtility;

public class Jackets_Class extends SeleniumUtility{
@FindBy(xpath = "(//a[@title='List'])[1]")
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
@FindBy(xpath = "(//select[@id='sorter'])[1]")
private WebElement sortby;
@FindBy(xpath = "//a[text()='Learn More']")
private WebElement learnmore;


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
public WebElement getSortby()
{
	return sortby;
}
public WebElement getLearnmore()
{
	return learnmore;
}

public void operationOnJackets(String DATA) throws InterruptedException
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
	handleDropdown(sortby,DATA);
	learnmore.click();

}
}
