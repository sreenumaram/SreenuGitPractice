package MyTestsPOM;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import ConfigPropertiesPOM.ConfigReadProperties;
import DriverFactoryPOM.DriverFactory;
import PagesPOM.HomePage;

public class HomepageTestPOM {
	
	DriverFactory dF;
	ConfigReadProperties crp;
	Properties prop;
	HomePage homepage;
	WebDriver driver;
	
	
	@BeforeTest
	public void setUp() {
		crp = new ConfigReadProperties();
		prop =crp.readProp("english");
		dF = new DriverFactory();
		driver = dF.driverInit("chrome", prop); 
		homepage = new HomePage(driver);
	}
	
	
	
	@Test
	public void headerTest() {
		
		Assert.assertTrue(homepage.checkHeaderDisplay(prop.getProperty("header")));
		
	}
	
	
	@Test
	public void contactTest() {
		
		Assert.assertTrue(homepage.checkContactDisplay(prop.getProperty("contact")));
		
	}
	
	@Test
	public void headings() {
		homepage.getClimate();
		homepage.getGender();
	}
	
	@AfterTest
	public void tearDown() {
		
		driver.quit();
		
	}

}
