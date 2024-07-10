package TestNGPracticeTests;

import org.testng.annotations.Ignore;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterizedTests2 {
	
	
	@Test
	public void PT2_1() {
		System.out.println("TEST@2");
		
	}
	
	
	@Parameters({"id"})
	@Test(enabled = false)
	public void PT2_2(String id) {
		
		System.out.println("USER ID =  "+ id );
		
	}
	

	@Parameters("Country")
	@Test
	public void PT2_3(@Optional("") String country) {
	System.out.println("USERCOUNTRY ="+ country);
}

}
