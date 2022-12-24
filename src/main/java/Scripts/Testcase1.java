package Scripts;



import java.io.IOException;

import org.testng.annotations.Test;

import genericlib.BaseClass;
import pompages.Loginpage;
import pompages.Registerpage;

public class Testcase1 extends BaseClass {
	
	@Test
	public void tc1() throws IOException, InterruptedException
	{
		Registerpage rg=new Registerpage(driver);
		rg.First(pdata.getpropertyfiledata("fn"));
		rg.Last(pdata.getpropertyfiledata("ln"));
		rg.email(pdata.getpropertyfiledata("em"));
		rg.mobile(pdata.getpropertyfiledata("mb"));
		rg.db();
		rg.date();
		rg.ps(pdata.getpropertyfiledata("ps"));
		rg.psc(pdata.getpropertyfiledata("pwc"));
		rg.registerbutton();
		
		
		
		
	}
}
	



