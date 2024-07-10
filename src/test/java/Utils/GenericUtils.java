package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericUtils {
	
	

	
	WebDriver driver;

	public GenericUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public  WebDriver webDriverManager() throws IOException {
		
		
		FileInputStream fis =  new FileInputStream(System.getProperty("user.dir")+"//src//test//resources//global.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		if(driver == null) {
		if(prop.getProperty("browser") == "chrome"){	
		  WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get(prop.getProperty("QAUrl"));
		}
		else {
				  WebDriverManager.edgedriver().setup();
				    driver = new EdgeDriver();
				    driver.manage().window().maximize();
				    driver.get(prop.getProperty("QAUrl"));
			
		}
			
		}
		    return driver;
		}
		
	
}
