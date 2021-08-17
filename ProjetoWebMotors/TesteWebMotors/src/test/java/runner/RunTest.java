package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features/CompraWebMotors.feature",
		glue = "steps",
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = true,
		dryRun = false,
		snippets = SnippetType.CAMELCASE,
		//tags = "@ct1,@ct2", 
		strict = true
		)

public class RunTest {

}
