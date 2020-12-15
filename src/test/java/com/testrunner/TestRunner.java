package com.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
	
	plugin = { "pretty", "html:target/cucumber-reports" },   
	features = "src/test/resources/com/featurefiles",
    glue	= {"com.stepdefinations"},
    monochrome = true
)
public class TestRunner {
}