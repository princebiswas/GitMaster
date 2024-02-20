package TestRunner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/features"},
        glue = {"steps"},
        plugin = {"pretty","html:target/cucumber-reports.html"},
        tags = "@correctUsername",
        monochrome = true
)
public class TestRunner
{

}
