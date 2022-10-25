package runner;


import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;

import java.io.File;

@CucumberOptions(
        plugin = {""},
        features = {"src/test/java/featureFiles/HumanResources.feature"},
        glue = {"src/test/java/stepDefinition/HumanResourcesSteps.java"},
        dryRun = false
)


public class RunnerExtendRapor extends AbstractTestNGCucumberTests {

    @AfterClass
    public static void setup()
    {
        Reporter.loadXMLConfig("src/test/java/xmlFiles/extendRapor.xml");
        Reporter.setSystemInfo("Benutzer Name", "Ilyas Ugur");
        Reporter.setSystemInfo("Application Name", "Basqar Project");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Department", "QA Manager");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");


    }


}
