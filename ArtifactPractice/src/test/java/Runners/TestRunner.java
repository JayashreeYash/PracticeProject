package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = ".//src/test/resources/features/Calculator.feature",        // Path to feature files
    glue = "com.example.stepDefinitions",     // Path to step definition classes
    plugin = {"pretty", "html:target/cucumber-reports"}, // Reporting options
    monochrome = true
)

public class TestRunner {

	

}
