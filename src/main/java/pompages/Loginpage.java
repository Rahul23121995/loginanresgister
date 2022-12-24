package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy(name="username")
	private WebElement user;
	
	@FindBy(name="password")
	private WebElement pass;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void username(String em)
	{
		user.sendKeys(em);
	}
	public void passowrd(String ps)
	{
		pass.sendKeys(ps);
	}

}
