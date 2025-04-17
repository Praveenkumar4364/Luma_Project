package genericUtility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesUtility {
public String getdatafromproperties(String data) throws IOException
{
	FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\LumaEcommerse.properties");
	Properties pobj=new Properties();
	pobj.load(fis);
	String DATA=pobj.getProperty(data);
	return DATA;
}
}
