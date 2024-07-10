package StepDefinations;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import Utils.TestContextSetup;
import io.cucumber.java.After;

public class Hooks {

	TestContextSetup testContextSetup;
	
	public Hooks(TestContextSetup testContextSetup) {
		this.testContextSetup = testContextSetup;
		
	}
	
	@After
	public void quitDriver() throws IOException {
		testContextSetup.genericUtils.webDriverManager().quit();
	}
}
