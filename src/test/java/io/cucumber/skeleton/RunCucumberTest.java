package io.cucumber.skeleton;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions( monochrome = true,
        features = "src\\test\\resources\\io\\cucumber",
        glue = {"SampleTestingStepDefs"},
        tags = {"@Top_test","not @Bottom_test"},
        plugin = {"pretty"}
)
public class RunCucumberTest {
}
