package CucumberTestNG;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features", glue="StepDefinations",  monochrome=true, tags="@greenkart or @Offers",plugin = {"pretty", "html:target/cucumber1.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class GreenkartTestRunner extends AbstractTestNGCucumberTests{
	
	
	@Override
	@DataProvider(parallel=true)
	public Object[][] scenarios(){
		return super.scenarios();
	}

}



//to rerun failed scenarios
//@CucumberOptions(features="@target/failed_scenarios.txt", glue="StepDefinations",  monochrome=true,plugin = {"pretty", "html:target/cucumber1.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//"rerun:target/failed_scenarios.txt"})
//public class GreenkartTestRunner extends AbstractTestNGCucumberTests{
//	
//	
//	@Override
//	@DataProvider(parallel=true)
//	public Object[][] scenarios(){
//		return super.scenarios();
//	}

