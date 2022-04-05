package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= "/Users/activemac03/eclipse-workspace/LWCucumber/src/main/java/Features", // The path of Feature File.
glue= {"StepDefination"} // The Path of Step Definition file.
,format= {"pretty","html:test-outout" , "json:json_output/cucumber.json"}, //To generate different type of report.
monochrome = true,  //Display the console out put in readable format
strict=true, // It will check if any step are not defined in step definition file.
dryRun = true //to check the mapping is proper btw feature file  and step definition file.

		)
public class TestRunner {

}
 