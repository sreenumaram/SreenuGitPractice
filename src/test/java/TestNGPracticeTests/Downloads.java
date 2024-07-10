package TestNGPracticeTests;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Downloads {
	
	@Test
	public void test() {
		
		
		
		
		  WebDriverManager.chromedriver().setup();

	        String location = "C:\\Users\\sreenivasa.maram\\Desktop\\";

//	        HashMap<String, String> preferences = new HashMap<>();
	        HashMap preferences = new HashMap();
	        preferences.put("download.default_directory", location);

	        ChromeOptions options = new ChromeOptions();
	        options.setExperimentalOption("prefs", preferences);

	        WebDriver driver = new ChromeDriver(options);

	        try {
	            driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
	            driver.findElement(By.cssSelector("tbody tr:nth-child(1) td:nth-child(5) a:nth-child(1)")).click();

	            // Add a wait or verify download logic here if needed

	        } finally {
	            // Ensure the WebDriver is quit to release resources
//	            driver.quit();
	        }
	    }
	
	
	
	
	@Test
	public void uploadFile() throws Exception  {
		
		
		  WebDriverManager.chromedriver().setup();
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://plugins.krajee.com/file-basic-usage-demo");
		  
//		  driver.findElement(By.cssSelector("#input-b1")).sendKeys("C:\\Users\\sreenivasa.maram\\Desktop\\file-sample_100kB.doc");
		 WebElement button =  driver.findElement(By.cssSelector("#input-b1"));

////		  JavascriptExecutor js = (JavascriptExecutor)driver;
////		  js.executeScript("arguments[0].click()", button);
//		  
		  
		 
	        Robot rb = new Robot();
	        rb.delay(2000);
	        StringSelection sss = new StringSelection("C:\\Users\\sreenivasa.maram\\Desktop\\file-sample_100kB.doc");
	        
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sss, null);
	      rb.keyPress(KeyEvent.VK_CONTROL);
	      rb.keyPress(KeyEvent.VK_V);
	      
	      rb.keyRelease(KeyEvent.VK_CONTROL);
	      rb.keyRelease(KeyEvent.VK_V);
	      
	      rb.keyPress(KeyEvent.VK_ENTER);
	      rb.keyRelease(KeyEvent.VK_ENTER);
	}
		
	}
	
	
	
	


