package runner;

import com.beust.jcommander.Parameters;
import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.BeforeClass;

@CucumberOptions(
            features = {},
            glue = {},
            plugin = {}
            )

    public class ParalellTestRunner extends AbstractTestNGCucumberTests {

        @BeforeClass
    @Parameters("browser")

    public void before (String browser){


        }
    }

