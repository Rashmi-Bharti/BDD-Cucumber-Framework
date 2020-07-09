package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\R\\eclipse-workspace\\cucumber\\src\\main\\java\\features\\hooks.feature",
		glue= {"stepDefination"}, //the path of the step cdefination file
		monochrome=true, //display the console output in proper readable format
		//format= {"preety","html:test-output"},
		//format= {"preety"},
		dryRun=false
		//tags= {"~@SmokeTest", "@RegressionTest"}
		)
public class CRMTestRunner {

}
/*@CucumberOptions(features="Features/Beh.feature"
			,glue="steps",dryrun=true,monochrome=true,
			plugin={"pretty","usage","html:"location",json:"location","junit:C:\\Users\\KS5047809\\Desktop\\Reports\\report1.xml",strict=true)*/

//ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
//ANDed : tags = tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest
