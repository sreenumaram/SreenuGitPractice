package TestNGPracticeTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider1 {
	
	
	
	@Test(dataProvider = "creds")
	public void userCreds(String username, String password) {
		System.out.println(username+ " - "+ password);
	}
	
	
	
	@DataProvider(name="creds")
	public Object[][] myCreds() {
		
		
		Object[][] data = new Object[4][2];
		data[0][0] = "abc";
				data[0][1]="Abc@1";
						data[1][0] = "cde";
								data[1][1]= "Cde@2";
										data[2][0]="fgh";
												data[2][1]="Fgh@3";
														data[3][0]="ijk";
																data[3][1]="Ijk@4";
																
																return data;
																
		
	}

}
