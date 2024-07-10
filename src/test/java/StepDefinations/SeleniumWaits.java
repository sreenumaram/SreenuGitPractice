package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumWaits {
	
	
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Test
	public void implicitWait() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin123");
		driver.findElement(By.cssSelector("button[class*=\"orangehrm-login-button\"]")).click();
		
	}
	
	@Test
	public void explicitWait() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(7));
		driver.manage().window().maximize();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
//		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//input[@name='username']"))));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		
	

		driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin");
		driver.findElement(By.cssSelector("input[name=\"password\"]")).sendKeys("admin123");
		wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("h5.oxd-text.oxd-text--h5.orangehrm-login-title")));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.cssSelector("button[class*=\"orangehrm-login-button\"]"))));
		driver.findElement(By.cssSelector("button[class*=\"orangehrm-login-button\"]")).click();
		
		
//		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.cssSelector("a[href*='web/index.php/admin/viewAdminModule']"))));
		
//		driver.findElement(By.cssSelector("a[href*='web/index.php/admin/viewAdminModule']")).click();
		
		wait.until(ExpectedConditions.urlContains("web/index.php/dashboard/index"));
		driver.findElement(By.cssSelector("a[href*='web/index.php/admin/viewAdminModule'] span")).click();
		
		
		
	}
	
	
	@Test
	public void explicitWait2() throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		wait = new WebDriverWait(driver, Duration.ofSeconds(4));
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		driver.findElement(By.cssSelector("fieldset select")).click();
		driver.findElement(By.cssSelector("option[value='option2']")).click();
//		wait.until(ExpectedConditions.elementToBeSelected(driver.findElement(By.cssSelector("select option[value='option3']"))));
		driver.findElement(By.cssSelector("input[value='option1']")).click();
	
		wait.until(ExpectedConditions.attributeToBe(By.cssSelector("input#name"), "id", "name"));
		
		driver.findElement(By.cssSelector("input#name")).sendKeys("Kalki 2898 AD");
		
		wait.until(ExpectedConditions.textToBePresentInElementValue(By.cssSelector("option[value='option2']"), "option2"));
		driver.findElement(By.cssSelector("fieldset select")).click();
		driver.findElement(By.cssSelector("option[value='option1']")).click();
		
		
		
//		driver.findElement(By.cssSelector("#alertbtn")).click();
		Thread.sleep(6);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();		
	}
	
	
	
	
	
	

}
