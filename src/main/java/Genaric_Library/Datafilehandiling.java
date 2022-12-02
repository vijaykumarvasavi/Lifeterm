package Genaric_Library;

import java.io.FileInputStream;
import java.util.Properties;


public class Datafilehandiling {	
	
	
	public String getdatafile(String key) throws Exception {
		// TODO Auto-generated method stub		      
	
		FileInputStream fies = new FileInputStream(Constant.datafilepath);
		Properties per = new Properties();
		per.load(fies);
		String value = per.getProperty(key);
		return value;
	}
}
