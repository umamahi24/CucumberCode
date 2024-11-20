package runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features="src//test//resources//taggedFeatures",
		glue= {"stepDefs"},
		plugin= {//"pretty", "html:target//Reports//HtmlReport.html",
				 //"usage:target//Reports//usageReport",
				 //"json:target//Reports//jsonReport.json"
				 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		//tags="@SmokeTest"
		//tags="@SmokeTest or @RegressionTest"
		//tags="@SmokeTest and @RegressionTest"
		tags="@PhaseOne and  @RegressionTest"
	   //, monochrome = true
			   
	   //, dryRun=true
	   )
public class TaggedRunner extends AbstractTestNGCucumberTests {

}
