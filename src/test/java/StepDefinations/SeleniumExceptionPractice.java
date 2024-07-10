package StepDefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import freemarker.core.JavaScriptCFormat;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumExceptionPractice {

	
	WebDriver driver;
	WebDriverWait wait;
	
	@Test
	public void exceptions() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
//		unhadledAlert Exception
		driver.get("https://omayo.blogspot.com/");
//		driver.findElement(By.xpath("//input[@id='alert1']")).click();
//		driver.switchTo().alert().accept();
//		driver.close();
		
//		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		
		
//		staleElementReferrence Exception
		
//		WebElement textFiled= driver.findElement(By.cssSelector("#ta1"));
//		textFiled.sendKeys("helloWorld");
//		driver.findElement(By.xpath("//a[normalize-space()='onlytestingblog']")).click();
//		driver.navigate().back();
////		textFiled.clear();
//		driver.findElement(By.cssSelector("#ta1")).clear();
		
		
//	Invalid selector exception
//	This exception occurs when we provide locator with incorrect syntax.
		
//NosuchElement Exception occurs when we provide valid syntax locator, but the element not found on web page
		
		
		
//   element click interception
		
		
		driver.findElement(By.xpath("//span[@id='blogsmenu']")).click();
		WebElement link = driver.findElement(By.cssSelector("#selenium143"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", link);
		
	}
}
