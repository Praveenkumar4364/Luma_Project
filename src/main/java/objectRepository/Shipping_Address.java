package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Address {
@FindBy(xpath = "//button[@class='action action-show-popup']")
private WebElement newaddress;
	


@FindBy(xpath = "//input[@name='street[0]']")
private WebElement street;
@FindBy(xpath = "//input[@name='city']")
private WebElement city;
@FindBy(xpath = "//select[@name='region_id']")
private WebElement region;
@FindBy(xpath = "//input[@name='postcode']")
private WebElement postcode;
@FindBy(xpath = "//select[@name='country_id']")
private WebElement country;
@FindBy(xpath = "//input[@name='telephone']")
private WebElement phone;
@FindBy (xpath = "(//input[@type='radio'])[1]")
private WebElement radio;

@FindBy(xpath = "//button[@class='action primary action-save-address']")
private WebElement shipherebtn;


@FindBy(xpath = "//span[text()='Next']")
private WebElement next;

public Shipping_Address(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getNewaddress() {
	return newaddress;
}

public WebElement getStreet() {
	return street;
}

public WebElement getCity() {
	return city;
}

public WebElement getRegion() {
	return region;
}

public WebElement getPostcode() {
	return postcode;
}

public WebElement getCountry() {
	return country;
}

public WebElement getPhone() {
	return phone;
}

public WebElement getRadio() {
	return radio;
}


public WebElement getShipherebtn() {
	return shipherebtn;
}


public WebElement getNext()
{
	return next;
}

public void shippingorderOperation(String STREET,String CITY,String REGION,String POSTCODE,String COUNTRY,String PHONE) throws InterruptedException
{
	getNewaddress().click();
	street.sendKeys(STREET);
	city.sendKeys(CITY);
	country.sendKeys(COUNTRY);
	region.sendKeys(REGION);
	postcode.sendKeys(POSTCODE);
	phone.sendKeys(PHONE);
	//radio.click();
	shipherebtn.click();
	Thread.sleep(5000);
	next.click();
	Thread.sleep(4000);
}
public void shippingorderOperation() throws InterruptedException
{
	next.click();
	Thread.sleep(3000);
}
}
