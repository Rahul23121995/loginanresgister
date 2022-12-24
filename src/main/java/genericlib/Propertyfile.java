package genericlib;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

public class Propertyfile {
	
	public String getpropertyfiledata(String key) throws IOException
	{
	
	Properties p=new Properties();
	FileInputStream fis=new FileInputStream(AutoConstant.propertyFilepath);
	p.load(fis);
	return p.getProperty(key);
	}
}
