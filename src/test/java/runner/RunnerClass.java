package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@CucumberOptions(
        features = {"src/test/java/featureFiles"},
        glue = {"src/test/java/stepDefinition"},
//        plugin = {"html:target/cucumber-report",
//                "json:target/cucumber.json",
//        },
        dryRun = false
)
public class RunnerClass extends AbstractTestNGCucumberTests {

}

