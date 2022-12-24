package Scripts;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import genericlib.BaseClass;
import pompages.Loginpage;
import pompages.Registerpage;

public class Testcase2 extends BaseClass{
	
	@Test
	public void tc2() throws IOException
	{
		Registerpage r=new Registerpage(driver);
		r.login();
		
		Loginpage lp=new Loginpage(driver);
		lp.username(pdata.getpropertyfiledata("em"));
		lp.passowrd(pdata.getpropertyfiledata("ps"));
	}

}
