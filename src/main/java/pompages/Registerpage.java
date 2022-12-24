package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {
	
	@FindBy(name="first_name")
	private WebElement firstname;
	
	@FindBy(name="last_name")
	private WebElement Lastname;
	
	@FindBy(name="email")
	private WebElement emailid;
	
	@FindBy(name="mobile")
	private WebElement mobileno;
	
	@FindBy(name="date")
	private WebElement date;
	
	@FindBy(xpath="//div[text()='2']")
	private WebElement dateofbirth;
	
	@FindBy(name="password")
    private WebElement pass;
	
	@FindBy(name="password_confirmation")
	private WebElement passwordconfirm;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement register;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement loginbtn;
	
	public Registerpage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void login()
	{
		loginbtn.click();
	}
	
	public void First(String fn)
	{
		firstname.sendKeys(fn);
	}
	public void Last(String ln)
	{
	 Lastname.sendKeys(ln);
	}
	public void email(String em)
	{
		emailid.sendKeys(em);
	}
	public void mobile(String mb)
	{
		mobileno.sendKeys(mb);
	}
	public void db()
	{
		date.click();
	}
	public void date()
	{
		dateofbirth.click();
	}
	public void ps(String pw)
	{
		pass.sendKeys(pw);
	}
	public void psc(String pwc)
	{
		passwordconfirm.sendKeys(pwc);
	}
	public void registerbutton()
	{
		register.submit();
	}
	
	

}
