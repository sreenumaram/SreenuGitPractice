package ConfigPropertiesPOM;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReadProperties {
	
	private FileInputStream fis;
	private Properties prop;
	
	public Properties readProp(String language) {
		
		   prop = new Properties();
		try {
			switch (language.toLowerCase()) {
			case "english" : 
				fis = new FileInputStream(".\\src\\test\\resources\\englishPOM.properties");
			 
				break;
			
			case "french":
				fis = new FileInputStream(".\\src\\test\\resources\\frenchPOM.properties");
				break;
			default:
				System.out.println("language Not Foune: " + language.toLowerCase());
			}
			
		prop.load(fis);
			
		}
		catch(Exception e) {
			
		}
		return prop;
		
	}

}
