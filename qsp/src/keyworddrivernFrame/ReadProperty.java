package keyworddrivernFrame;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	//generic reusable method to read the key value from property file
	public String getProperty(String path,String key) throws IOException
	{
		FileInputStream fis=new FileInputStream(path);
		Properties prop=new Properties();
		prop.load(fis);
		String val = prop.getProperty(key);
		return val;
	}

}
