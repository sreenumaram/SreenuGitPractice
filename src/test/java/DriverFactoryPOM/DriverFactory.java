package DriverFactoryPOM;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	WebDriver driver;
	
	public WebDriver driverInit(String browserName, Properties prop) {
		
		switch (browserName.toLowerCase()) {
		case "chrome" :
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		
		case "edge":
			
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case "firefox" :
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			
			break;		
			
		default:
			System.out.println("Browser not found: " + browserName.toLowerCase());
		}
		;
   
	driver.manage().window().maximize();
	driver.get(prop.getProperty("url"));
		return driver;
	}
	

}
