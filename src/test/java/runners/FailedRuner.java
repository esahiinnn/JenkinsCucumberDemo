package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/default-cucumber-reports.html",
                "json:target/json-report/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:target/FailedRerun.txt"
        },
        features = "@target/FailedRerun.txt",
        glue = "stepdefinitions",
        dryRun = false
)

public class FailedRuner {
}
