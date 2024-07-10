package TestNGPracticeTests;

import org.testng.annotations.Test;

public class GroupTests2 {
	
	
	
	
	@Test(groups = {"smoke"})
	public void gpTest21() {
		System.out.println("Executed gpt21");
	}
	
	@Test(groups = {"functional"})
	public void gpTest22() {
		System.out.println("Executed gpt22");
	}
	
	@Test(groups = {"smoke","sanity","regession"})
	public void gpTest23() {
		System.out.println("Executed gpt23");
	}
	
	@Test(groups = {"sanity","regression"})
	public void gpTest24() {
		System.out.println("Executed gpt24");
	}
	
	@Test(groups = {"smoke"})
	public void gpTest25() {
		System.out.println("Executed gpt25");
	}

}
