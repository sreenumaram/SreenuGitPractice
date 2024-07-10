package TestNGPracticeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SecondTest {
	WebDriver driver;

	
	
	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver. get("https://rahulshettyacademy.com/angularpractice/");
	driver.findElement(By.cssSelector("label~input[name='name']")).sendKeys("Protractor Tutorial");
	driver.findElement(By.cssSelector("input[name='email']")).sendKeys("pro@gmail.com", Keys.ENTER);
	System.out.println("Test1 Second TEST SUCCESSFUL");
	driver.quit();
	}

	@Test
	public void test2() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://openmrs.org/demo/");
	System.out.println("Test2 Second TEST SUCCESSFUL");
	driver.quit();
	}
	
	@Test
	public void test3() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.openmrs.org/openmrs/login.htm");
	System.out.println("Test3 Second TEST SUCCESSFUL");
	driver.quit();
	}
}
