package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class OffersPageObjects {
	WebDriver driver;
	
	By search_textfiled = By.id("search-field");
	
	public OffersPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	

	public void searchForProduct(String productSN) {
		driver.findElement(search_textfiled).sendKeys(productSN);
	}
	
	
	
	public void verifyProduct(String offersPageProductName, String productName) {
		Assert.assertEquals(offersPageProductName, productName);
	}
	
	
	
	

}
