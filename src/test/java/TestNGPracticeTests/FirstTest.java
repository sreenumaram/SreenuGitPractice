package TestNGPracticeTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
//	WebDriver driver;
	
	RemoteWebDriver driver;

	
	@Ignore
	@Test
	public void test1() throws Throwable {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver. get("https://rahulshettyacademy.com/angularpractice/");
	Thread.sleep(5000);
	driver.findElement(By.cssSelector("label~input[name='name']")).sendKeys("Protractor Tutorial");
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("pro@gmail.com", Keys.ENTER);
	
	URL url = new URL("https://rahulshettyacademy.com/");
	

     // Use navigate().to() to go to the URL
     driver.navigate().to(url);
	System.out.println("Test1 FIRST TEST SUCCESSFUL");
	driver.quit();
	}

//	@Test
	public void test2() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://openmrs.org/demo/");
	System.out.println("Test2 FIRST TEST SUCCESSFUL");
	driver.quit();
	}
	
//	@Test
	public void test3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.openmrs.org/openmrs/login.htm");
	System.out.println("Test3 FIRST TEST SUCCESSFUL");
	driver.quit();
	}
}
