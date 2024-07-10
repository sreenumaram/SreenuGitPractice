package POMtaskPractice;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationShoppingPage {
	
	WebDriver driver;
	
	
	public RegistrationShoppingPage(WebDriver driver) {
		
	this.driver = driver;
	PageFactory.initElements(driver, this);
	
		
	}
	
	
	@FindBy(className = "ico-register")
	private WebElement registration;
	
	@FindBy(id = "gender-male")
	private WebElement genderMale;
	
	@FindBy(id = "gender-female")
	private WebElement genderFemale;
	
	
	@FindBy(css  = "#FirstName")
	private WebElement firstName;
	
	@FindBy(css = "#LastName")
	private WebElement lastName;
	
	@FindBy(name = "Email")
	private WebElement email;
	
	@FindBy(css = "#Password")
	private WebElement password;
	
	@FindBy(xpath = "//input[@id=\"ConfirmPassword\"]")
	private WebElement confirmPassword;
	
	@FindBy(name = "register-button")
	private WebElement register;
	
	@FindBy(css ="input#small-searchterms")
	private WebElement searchBox;
	
	@FindBy(css="  input[value='Search']")
	private WebElement searchButton;
	
	public void gotoRegistration() {
		registration.click();
		
	}
	
	
	public void enterPersonalDetails(String gender, String userfirstName, String userlastName, String userEmail ) {
		
	if(gender.toLowerCase()=="male" ) {
		genderMale.click();
	}else {
		genderFemale.click();
	}
	
	firstName.sendKeys(userfirstName);
	lastName.sendKeys(userlastName);
	email.sendKeys(userEmail);
		
	}
	
	
	public void enterPassword(String userPassword ) {
		password.sendKeys(userPassword);
			confirmPassword.sendKeys(userPassword);
		}
	
	public void completeRegistration() {
		register.click();
	}
	
	
	public void searchProduct(String productName) {
		searchBox.sendKeys(productName);
		searchButton.click();
		
	}
		
		
	
	
	
	
	
	
	

}
