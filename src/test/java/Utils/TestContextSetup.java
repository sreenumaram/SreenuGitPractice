package Utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestContextSetup {

	public WebDriver driver;
	public String productName;
	
	public GenericUtils genericUtils = new GenericUtils(driver);


	public void switchWindow(WebDriver driver) {
		Set<String>windows = driver.getWindowHandles();
		Iterator <String> i1 = windows.iterator();
		String parentWindow = i1.next();
		String childWindow = i1.next();
		driver.switchTo().window(childWindow);
	}

	
}
