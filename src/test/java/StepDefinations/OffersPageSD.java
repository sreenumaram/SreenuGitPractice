package StepDefinations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import PageObjects.OffersPageObjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.Then;

public class OffersPageSD {
	
	TestContextSetup testContextSetup;
	String offersPageProductName;
	
	
	OffersPageObjects offersObject;
	
	
	public OffersPageSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		
		
	}

@Then("^user search for product using short name (.+) in offers page and check if product exist$")
public void user_search_for_product_using_short_name_in_offers_page_and_check_if_product_exist(String productSN) throws InterruptedException, IOException {
	
	testContextSetup.genericUtils.webDriverManager().findElement(By.cssSelector("a[href='#/offers']")).click();
	OffersPageObjects offersObject = new OffersPageObjects(testContextSetup.genericUtils.webDriverManager());
	testContextSetup.switchWindow(testContextSetup.genericUtils.webDriverManager());
	offersObject.searchForProduct(productSN);

	Thread.sleep(3000);
	 offersPageProductName = testContextSetup.genericUtils.webDriverManager().findElement(By.cssSelector("tbody tr td:nth-child(1)")).getText().trim();
	 offersObject.verifyProduct(offersPageProductName,testContextSetup.productName);
	
	
}



}
