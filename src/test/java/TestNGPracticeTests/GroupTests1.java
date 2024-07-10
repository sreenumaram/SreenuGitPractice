package TestNGPracticeTests;

import org.testng.annotations.Test;

public class GroupTests1 {

	
	
	@Test(groups = {"functional"})
	public void gpTest11() {
		System.out.println("Executed gpt11");
	}
	
	@Test(groups = {"smoke"})
	public void gpTest12() {
		System.out.println("Executed gpt12");
	}
	
	@Test(groups = {"regression", "functional"})
	public void gpTest13() {
		System.out.println("Executed gpt13");
	}
	
	@Test(groups = {"smoke"})
	public void gpTest14() {
		System.out.println("Executed gpt14");
	}
	
	@Test(groups = {"sanity"})
	public void gpTest15() {
		System.out.println("Executed gpt15");
	}
}
