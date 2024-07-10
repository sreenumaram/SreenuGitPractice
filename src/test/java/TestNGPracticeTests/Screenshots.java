package TestNGPracticeTests;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.reporter.FileUtil;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class Screenshots {
  WebDriver driver;
  
  
	
	
	
	@Test()
	public void test1() throws IOException {
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://marcloudconsulting.com/marketing-cloud/salesforce-marketing-cloud-journey-builder/");
		
		TakesScreenshot tsc = (TakesScreenshot) driver;
		
		
//		File src = tsc.getScreenshotAs(OutputType.FILE);
		
		
		File src  = driver.findElement(By.cssSelector(".Link__StyledLinkInternal-sc-dtp4qt-0.jlshfd.Button__StyledButtonLink-sc-e5yqi-1.eHCMdj.Header__StyledButton-sc-y5gefc-3.fgedBO")).getScreenshotAs(OutputType.FILE);
		
		String date = new  SimpleDateFormat("yyyy-mm-dd-HHmmss").format(new Date());
	File path = new File("C:\\Users\\sreenivasa.maram\\Desktop\\kkkkkkkk"+"_"+date+ ".png");
	
	String kk = Keys.chord(Keys.CONTROL, Keys.RETURN);
	 driver.findElement(By.cssSelector(".Link__StyledLinkInternal-sc-dtp4qt-0.jlshfd.Button__StyledButtonLink-sc-e5yqi-1.eHCMdj.Header__StyledButton-sc-y5gefc-3.fgedBO")).sendKeys(kk);
	
	
	
	FileUtils.copyFile(src, path);
	}
}

