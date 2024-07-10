package POMtaskPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericUtility {
	
	

	public void checkCheckBox(WebElement checkbox) {
		
		if (!checkbox.isSelected()) {
           
            checkbox.click();
        }
		
	}
	

}
