package StepDefinations;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;




@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",glue={"StepDefinations"},
monochrome=true,
plugin={"pretty","junit:target/JUnitReports/report.junit",
		"json:target/JSONReports/report.json",
		"html:target/HtmlReports/report.html"},
	tags="@SmokeTesting"	)



public class TestRunner {

	
	
}
 