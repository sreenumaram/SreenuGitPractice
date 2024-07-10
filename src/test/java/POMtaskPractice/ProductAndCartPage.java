package POMtaskPractice;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductAndCartPage {
	
WebDriver driver;
GenericUtility gu;
	
	
	public  ProductAndCartPage(WebDriver driver) {
		
	this.driver = driver;
	PageFactory.initElements(driver, this);
	gu = new GenericUtility();
	
	
		
	}
	
	
	
	@FindBy(linkText ="Simple Computer")
	private WebElement product;
	
	
	@FindBy(xpath ="//label[text()=\"Slow \"]/preceding-sibling:: input")
	private WebElement processor;
	
	@FindBy(xpath ="//label[text()=\"4 GB  [+20.00]\"]/preceding-sibling:: input")
	private WebElement RAM;
	
	@FindBy(xpath ="//label[text()=\"320 GB \"]/preceding-sibling:: input")
	private WebElement HDD;
	
	@FindBy(css =".qty-input")
	private WebElement quantity;
	
	
	@FindBy(css ="input#add-to-cart-button-75")
	private WebElement addToCartButton;
	
	@FindBy(css = "input#product_attribute_75_8_35_108")
	private WebElement software;
	
	@FindBy(xpath="//span[text()='Shopping cart']")
	private WebElement shoppingCart;
	
	@FindBy(css = "input[name='removefromcart']")
	private WebElement removeFromCart;
	
	@FindBy(css="input[name=\"updatecart\"]")
	private WebElement updateCheckoutButton;
	
	
	
	public void SelectProduct() {
		product.click();
	}
		
	public void selectRequiredSpecifications(String productQuantity) {
		processor.click();
		RAM.click();
		HDD.click();
		gu.checkCheckBox(software);
		quantity.sendKeys(productQuantity);
		
	}
	
	
	public void AddProductToCart() {
		addToCartButton.click();
	}
	
	public void goToCart() {
		shoppingCart.click();
		gu.checkCheckBox(removeFromCart);
	}
	
	
	public void updateCheckout() {
		
		updateCheckoutButton.click();
	}
	
	
	
		
	
	

}
