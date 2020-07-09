package runner;



import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"progress",
	            "html:build/report/html",
	            "junit:build/report/junit/cucumber-report.xml",
	            "json:build/report/json/cucumber-report.json"
	    },
		
		features="C://Users//R//eclipse-workspace//cucumber//src//main//java//features//inputForm.feature" //the path of the feature file
		,glue= {"stepDefination"},//the path of the Step defination file
		//format = {"pretty", "html:target/cucumber"}, // to generate different type of reporting
		monochrome= true, //display the console output in a proper readable format
		strict= true, //it will check if any step is not defined in step defination file
		dryRun= false  //to check the mapping is proper between feature file and step def file
		//tags= {"@SmokeTest"} //to run the specific test cases
		)

public class TestRunner {
	
	}


