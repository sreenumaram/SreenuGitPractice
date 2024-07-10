package POMtaskPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	
	
//	 File file = new File(System.getProperty("user.dir")+"src\\test\\resources\\POMtestPractice.properties");
 FileInputStream fis ;
 Properties prop;
 
 public Properties readProperties1() throws IOException {
	 prop = new Properties();
	 
	 try {
		fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\resources\\POMtestPractice.properties");
		prop.load(fis);
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 return prop;
	 
	 
 }
	
	
}
