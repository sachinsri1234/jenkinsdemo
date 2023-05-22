

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/SA20464034/Desktop/selenium/jenkinsproject/src/main/resources/abc.feature",
glue = "jenkinsproject")

public class Runner extends AbstractTestNGCucumberTests{

}
