package CucumberTestNG;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


//@CucumberOptions(features = "src\\test\\java\\features\\DDCucumber.feature", glue = "StepDefinations", monochrome = true, tags = "@Regression")
//public class DDCucumberTestrunner  extends AbstractTestNGCucumberTests{
//	
//	
//}

//@CucumberOptions(features = "src\\test\\java\\features\\DDCucumber.feature", glue = "StepDefinations", monochrome = true, tags = "@Regression and @smoke")
//public class DDCucumberTestrunner  extends AbstractTestNGCucumberTests{
//	
//	
//}


//@CucumberOptions(features = "src\\test\\java\\features\\DDCucumber.feature", glue = "StepDefinations", monochrome = true, tags = "not @Regression and not  @smoke")
//public class DDCucumberTestrunner  extends AbstractTestNGCucumberTests{
//	
//	
//}



@CucumberOptions(features = "src\\test\\java\\features\\BackgroundFeature.feature", glue = "StepDefinations", monochrome = true, plugin = {"pretty", "html:target/cucumber1.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, dryRun = true)
public class DDCucumberTestrunner  extends AbstractTestNGCucumberTests{
	
	
}
