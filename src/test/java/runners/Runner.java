package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-reports.html",
                "json:target/json-reports/Pcucumber1.json",
                "junit:target/xml-report/Pcucumber1.xml"},
        features="src/test/resources/features",
        glue = "stepdefinitions",
        tags="@VerifyScrollUpWithoutArrowButtonAndScrollDownFunctionality",
        dryRun = false
)

public class Runner {
}