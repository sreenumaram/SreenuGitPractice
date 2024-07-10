package TestNGPracticeTests;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(MyListeners.class)
public class TestListener {
	
	
	
	
	
	
	@Test
	public void test1() {
		System.out.println("Test case1");
		
	}
	
	
	@Test(timeOut = 1000)
	public void test2() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test case2 should fail");
	}
	
	
	@Test()
	public void test3() {
		System.out.println("Test case3");
		
	}

}
