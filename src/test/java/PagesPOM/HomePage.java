package PagesPOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import UtilsPOM.ElementsUtils;

public class HomePage {
	
	private WebDriver driver;
	private ElementsUtils eUtils;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		eUtils = new ElementsUtils(driver);
		
	}
	
	
	
	By gender = By.cssSelector("h4.field-content a[href='https://www.un.org/en/global-issues/gender-equality']");
	By climate = By.cssSelector("h4.field-content a[href='https://www.un.org/en/climatechange/']");
	
	
  public void getClimate() {
	  
     String climate1 = eUtils.getElement(climate).getText();
     System.out.println(climate1);
	  
  }
  
	
  public void getGender() {
	  
     String gender1 = eUtils.getElement(gender).getText();
     System.out.println(gender1);
	  
  }
  
  
	
  
	

	
	
	private WebElement getHeaderElement(String headerValue) {
		
		String headerXpathValue = "//a[text()='"+headerValue +"']";
		return eUtils.getElement("xpath", headerXpathValue);	
		
	}
	
	private WebElement getContactElement(String contactValue) {
		String contactXpathValue = "//a[text()='" +contactValue +"']";
		return  eUtils.getElement("xpath", contactXpathValue);
	}
	
	public Boolean checkHeaderDisplay(String headervalue) {
		String headertext =getHeaderElement(headervalue).getText();
		System.out.println("-----------"+headertext+"----------");
		return getHeaderElement(headervalue).isDisplayed();
	}
	
	public Boolean checkContactDisplay(String contactValue) {
		String contacText =getHeaderElement(contactValue).getText();
		System.out.println("-----------"+contacText+"----------");
		return getContactElement(contactValue).isDisplayed();
	}
	
	
	
}
