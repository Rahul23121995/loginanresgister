package genericlib;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	public WebDriver driver;
  public Propertyfile pdata=new Propertyfile();
	public WebDriverUtilities driverutilities=new WebDriverUtilities();
	@BeforeMethod
	public void openapp() throws IOException
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(pdata.getpropertyfiledata("url"));
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	
	@AfterMethod
	public void closeapp(ITestResult  result) throws IOException
	{
		
	String	name=result.getName();
		int status=result.getStatus();
		
		if(status==2)
		{
		 photo p=new photo();
		 p.getphoto(driver, name);
		}
		driver.quit();
	}

}
