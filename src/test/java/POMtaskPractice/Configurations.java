package POMtaskPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Configurations {

	WebDriver driver;
	
    
    
	public WebDriver initDriver(String browserName) {

		switch (browserName.toLowerCase()) {
		case "chrome": {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--start-fullscreen");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver(options);

			break;
		}
		case "edge": {
			EdgeOptions options = new EdgeOptions();
	        options.addArguments("--start-fullscreen");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver(options);
			break;

		}

		case "firefox": {
			 FirefoxOptions options = new FirefoxOptions();
		        options.addArguments("--start-fullscreen");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver(options);
			break;

		}
		default:
			System.out.println("Browser not found:" + browserName);
		}

		return driver;

	}

}
