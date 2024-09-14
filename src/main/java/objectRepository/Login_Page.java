package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
@FindBy(xpath = "//input[@name='login[username]']")
private WebElement email;
@FindBy(xpath = "//input[@name='login[password]']")
private WebElement password;
@FindBy(xpath = "(//button[@type='submit'])[2]")
private WebElement signin;

public Login_Page(WebDriver driver)
{
	PageFactory.initElements(driver,this);
}

public WebElement getEmail()
{
	return email;
}
public WebElement getPassword()
{
	return password;
}
public WebElement getSignin()
{
	return signin;
	
}
public void loginOperation(String EMAIL,String PASSWORD)
{
	email.sendKeys(EMAIL);
	password.sendKeys(PASSWORD);
	signin.click();
}
}
