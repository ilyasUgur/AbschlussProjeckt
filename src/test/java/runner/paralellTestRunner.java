package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import utilies.BasicWebDriver;
import com.cucumber.listener.Reporter;

import java.io.File;

@CucumberOptions(
        features = {"src/test/java/featureFiles/EducationSubjects.feature"},
        glue = {"EducationSubjectSteps"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:"}

)

public class ParalellTestRunner extends AbstractTestNGCucumberTests {
    @BeforeClass
    @Parameters("browser")

    public void before(String browser) {
        BasicWebDriver.browserName.set(browser);
    }


    @AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("src/test/java/xmlFiles/extendRapor.xml"));
        Reporter.setSystemInfo("Benutzer Name", "Ilyas Ugur");
        Reporter.setSystemInfo("Application Name", "Basqar Project");
        Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
        Reporter.setSystemInfo("Department", "QA Manager");
        Reporter.setTestRunnerOutput("Test Execution Cucumber Report");

    }
}
