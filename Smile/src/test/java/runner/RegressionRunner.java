package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/testdesign"},
        glue = {"stepdefination"},
        tags = "@staticdropdown",
        plugin = {"pretty",
                "html:target/testoutput/report.html",
                "json:target/testoutput/jsonreport.json",
                "junit:target/testoutput/xmlreport.xml"}
)

public class RegressionRunner {

}
