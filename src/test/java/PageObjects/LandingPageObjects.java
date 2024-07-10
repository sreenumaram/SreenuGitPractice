package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPageObjects {
	
	
WebDriver driver;
	
	By search_textfiled = By.cssSelector("input[type='search']");
	
	public LandingPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public void searchForProduct(String productSN) {
		driver.findElement(search_textfiled).sendKeys(productSN);
	}

}
