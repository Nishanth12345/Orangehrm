package Utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtil {
	public static String getValueForKey(String key) throws Throwable
	{
		Properties configprop=new Properties();
		FileInputStream fis=new FileInputStream("D:\\nishanth\\ORANGE_HR\\PropertyFile\\Environment.properties");
		configprop.load(fis);
		return configprop.getProperty(key);
		
		
		
	}

}
