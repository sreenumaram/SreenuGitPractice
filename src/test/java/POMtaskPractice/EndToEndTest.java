package POMtaskPractice;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class EndToEndTest {
	
	WebDriver driver;
	Properties prop;
	ReadProperties rp;
    ProductAndCartPage pcp;
    RegistrationShoppingPage rsp;
    Configurations cd;
    
    
    @BeforeTest
    public void testInit() throws IOException {
    	rp = new ReadProperties();
    	prop = rp.readProperties1();
    	
    	cd =  new Configurations();
    	driver = cd.initDriver(prop.getProperty("browser"));
    	pcp = new ProductAndCartPage(driver);
    	rsp = new RegistrationShoppingPage(driver);
    	 	
    }
    
    
    
    @Test
    public void test1() {
    	driver.get(prop.getProperty("url"));
    	rsp.gotoRegistration();
    	rsp.enterPersonalDetails(prop.getProperty("gender"), prop.getProperty("firstName"), prop.getProperty("lastName"),prop.getProperty("email"));
    	rsp.enterPassword(prop.getProperty("password"));
    	rsp.completeRegistration();
    	rsp.searchProduct(prop.getProperty("product"));
    	pcp.SelectProduct();
    	pcp.selectRequiredSpecifications(prop.getProperty("productQuantity"));
    	pcp.AddProductToCart();
    	pcp.goToCart();
    	pcp.updateCheckout();
    	
    	
    }
    
    
//    @AfterTest
    public void tearDown() {
    	driver.quit();
    }
    
    
    
}
