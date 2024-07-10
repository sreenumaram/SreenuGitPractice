package StepDefinations;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPageObjects;
import Utils.TestContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchProductSD {
	
	
	TestContextSetup testContextSetup;
	
	LandingPageObjects landingObjects;
	
	public SearchProductSD(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		
	}


@Given("^user is on Greenkart products page$")
public void user_is_on_greenkart_products_page() throws IOException {
    testContextSetup.genericUtils.webDriverManager();
}

@When("^user searched for product using short name (.+) and extracted product full name$")
public void user_searched_for_product_using_short_name_and_extracted_product_full_name(String productSN) throws InterruptedException, IOException {
	LandingPageObjects landingObjects = new LandingPageObjects(testContextSetup.genericUtils.webDriverManager());
	landingObjects.searchForProduct(productSN);
	Thread.sleep(3000);
	testContextSetup.productName =   testContextSetup.genericUtils.webDriverManager().findElement(By.cssSelector("h4.product-name")).getText().split("-")[0].trim();
System.out.println(testContextSetup.productName);
}


}
