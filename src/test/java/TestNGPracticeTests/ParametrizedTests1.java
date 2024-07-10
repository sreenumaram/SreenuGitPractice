package TestNGPracticeTests;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrizedTests1 {

	@Parameters({"Username", "Password"})
	@Test
	public void PT1_1(String username,String password) {
		System.out.println(username +"   -   "+ password );
		
	}
	
	
	@Parameters("id")
	@Test
	public void PT1_2(String id) {
		
		System.out.println("USER ID =  "+ id );
		
	}
	

	@Parameters("Country")
	@Test
	public void PT1_3(@Optional("")  String Country) {
	System.out.println(Country);
}
	
	
	
	}
